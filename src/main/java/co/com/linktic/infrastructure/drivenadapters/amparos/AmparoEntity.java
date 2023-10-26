package co.com.linktic.infrastructure.drivenadapters.amparos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
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
@Table(name = "amparos", schema = "public")
public class AmparoEntity {

    @Id
    @Column(name = "id_amparo", nullable = false)
    private Integer idAmparo;

    @Column(length = 50)
    private String nombre;
}
