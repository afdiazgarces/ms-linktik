package co.com.linktic.infrastructure.drivenadapters.primas;

import co.com.linktic.infrastructure.drivenadapters.amparos.AmparoEntity;
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

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
@Table(name = "primas", schema = "public")
public class PrimaEntity {

    @Id
    @Column(name = "id_prima", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idPrima;

    @Column(name = "edad_minima", nullable = false)
    private Integer edadMinima;

    @Column(name = "edad_maxima", nullable = false)
    private Integer edadMaxima;

    @Column(name = "porcentaje_prima", nullable = false)
    private Double porcentajePrima;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_amparo", nullable = false)
    private AmparoEntity amparo;
}
