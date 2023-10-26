package co.com.linktic.infrastructure.drivenadapters.tiposidentificacion;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
@Table(name = "tipos_de_identificacion", schema = "public")
public class TipoIdentificacionEntity {

    @Id
    @Column(name = "id_tipo_identificacion", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idTipoIdentificacion;

    @Column(length = 50)
    private String descripcion;

    @Column(length = 10)
    private String abreviatura;
}
