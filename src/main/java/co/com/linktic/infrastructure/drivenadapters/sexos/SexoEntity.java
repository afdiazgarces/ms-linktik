package co.com.linktic.infrastructure.drivenadapters.sexos;

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
@Table(name = "sexos", schema = "public")
public class SexoEntity {

    @Id
    @Column(name = "id_sexo", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idSexo;

    @Column(length = 30)
    private String descripcion;

}
