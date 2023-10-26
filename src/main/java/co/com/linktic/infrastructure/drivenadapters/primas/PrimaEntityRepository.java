package co.com.linktic.infrastructure.drivenadapters.primas;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PrimaEntityRepository extends JpaRepository<PrimaEntity, Integer> {

    @Query(value = "SELECT * FROM primas WHERE ?1 BETWEEN edad_minima AND edad_maxima", nativeQuery = true)
    List<PrimaEntity> findBetweenEdad(Integer edad);
}
