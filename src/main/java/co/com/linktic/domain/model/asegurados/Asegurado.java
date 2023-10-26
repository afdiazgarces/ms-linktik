package co.com.linktic.domain.model.asegurados;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class Asegurado {

    private Integer idAsegurado;
    private Integer idTipoIdentificacion;
    private String numeroIdentificacion;
    private String apellidos;
    private String nombres;
    private Integer idSexo;
    private LocalDate fechaNacimiento;
}
