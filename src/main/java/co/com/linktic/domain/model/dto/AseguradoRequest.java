package co.com.linktic.domain.model.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
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
public class AseguradoRequest {

    @NotNull(message = "El campo 'tipoIdentificacion' no puede ser nulo ni vacio")
    private Integer tipoIdentificacion;
    @NotBlank(message = "El campo 'numeroIdentificacion' no puede ser nulo ni vacio")
    private String numeroIdentificacion;
    @NotNull(message = "El campo 'valorAsegurado' no puede ser nulo ni vacio")
    private Double valorAsegurado;
}
