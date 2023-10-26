package co.com.linktic.infrastructure.drivenadapters.asegurados;

import co.com.linktic.infrastructure.drivenadapters.sexos.SexoEntity;
import co.com.linktic.infrastructure.drivenadapters.tiposidentificacion.TipoIdentificacionEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
@Table(name = "asegurados", schema = "public")
public class AseguradoEntity {

    @Id
    @Column(name = "id_asegurado", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idAsegurado;

    @Column(name = "numero_identificacion",length = 30)
    private String numeroIdentificacion;

    @Column(length = 100)
    private String apellidos;

    @Column(length = 100)
    private String nombres;

    @Column(name = "fecha_nacimiento", nullable = false)
    private LocalDate fechaNacimiento;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_tipo_identificacion", nullable = false)
    private TipoIdentificacionEntity tipoIdentificacion;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_sexo", nullable = false)
    private SexoEntity sexo;
}
