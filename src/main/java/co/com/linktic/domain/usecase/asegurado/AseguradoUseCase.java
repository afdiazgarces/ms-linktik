package co.com.linktic.domain.usecase.asegurado;

import co.com.linktic.domain.model.dto.AseguradoRequest;
import co.com.linktic.domain.model.dto.AseguradoResponse;

public interface AseguradoUseCase {

    AseguradoResponse calcularLiquidacion(AseguradoRequest request);
}
