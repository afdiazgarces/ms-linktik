package co.com.linktic.domain.model.prima;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Prima {

    private Integer idPrima;
    private Integer edadMinima;
    private Integer edadMaxima;
    private Double porcentajePrima;
    private Integer idAmparo;
    private String nombreAmparo;
}
