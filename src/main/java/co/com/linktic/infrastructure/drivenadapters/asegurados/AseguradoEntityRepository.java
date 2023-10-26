package co.com.linktic.infrastructure.drivenadapters.asegurados;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface AseguradoEntityRepository extends CrudRepository<AseguradoEntity, Integer> {

    Optional<AseguradoEntity> findByTipoIdentificacionIdTipoIdentificacionAndNumeroIdentificacion(
            Integer tipoIdentificacion, String numeroIdentificacion);
}
