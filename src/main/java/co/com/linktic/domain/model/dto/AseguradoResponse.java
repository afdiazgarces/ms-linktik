package co.com.linktic.domain.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AseguradoResponse {

    private Integer tipoIdentificacion;
    private String numeroIdentificacion;
    private Double valorAsegurado;
    private List<Liquidacion> liquidacion;
    private Double valorTotal;


    @Getter
    @Setter
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Liquidacion {
        private Integer codigoAmparo;
        private String nombreAmparo;
        private Double valorPrima;
    }
}
