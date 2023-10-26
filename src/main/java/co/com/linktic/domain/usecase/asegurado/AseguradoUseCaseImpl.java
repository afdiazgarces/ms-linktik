package co.com.linktic.domain.usecase.asegurado;

import co.com.linktic.domain.model.asegurados.AseguradoRepository;
import co.com.linktic.domain.model.dto.AseguradoRequest;
import co.com.linktic.domain.model.dto.AseguradoResponse;
import co.com.linktic.domain.model.prima.PrimaRepository;
import co.com.linktic.domain.usecase.util.FechaUtil;

import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;

import static co.com.linktic.domain.usecase.util.Constantes.VALOR_MINIMO_ASEGURADO;

public class AseguradoUseCaseImpl implements AseguradoUseCase {

    private final AseguradoRepository aseguradoRepository;
    private final PrimaRepository primaRepository;

    public AseguradoUseCaseImpl(AseguradoRepository aseguradoRepository, PrimaRepository primaRepository) {
        this.aseguradoRepository = aseguradoRepository;
        this.primaRepository = primaRepository;
    }

    @Override
    public AseguradoResponse calcularLiquidacion(AseguradoRequest request) {
        validarValorMinimo(request.getValorAsegurado());

        AtomicReference<Double> valorTotal = new AtomicReference<>(0.0);

        var asegurado = aseguradoRepository.getAsegurado(request.getTipoIdentificacion(),
                request.getNumeroIdentificacion());

        var edad = FechaUtil.calcularEdad(asegurado.getFechaNacimiento());
        
        var liquidacion = primaRepository.getPrimaByEdad(edad)
                .stream()
                .map(prima -> {
                    var a = AseguradoResponse.Liquidacion.builder()
                            .codigoAmparo(prima.getIdAmparo())
                            .nombreAmparo(prima.getNombreAmparo())
                            .valorPrima(request.getValorAsegurado() * prima.getPorcentajePrima())
                            .build();
                    valorTotal.updateAndGet(v -> v + a.getValorPrima());
                    return a;
                })
                .collect(Collectors.toList());

        return AseguradoResponse.builder()
                .tipoIdentificacion(asegurado.getIdTipoIdentificacion())
                .numeroIdentificacion(asegurado.getNumeroIdentificacion())
                .valorAsegurado(request.getValorAsegurado())
                .liquidacion(liquidacion)
                .valorTotal(valorTotal.get())
                .build();
    }
    private void validarValorMinimo(Double valorAsegurado) {
        if (valorAsegurado < VALOR_MINIMO_ASEGURADO) {
            throw new RuntimeException("El valor asegurado debe ser mayor a 0");
        }
    }

}
