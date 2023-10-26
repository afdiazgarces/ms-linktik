package co.com.linktic.infrastructure.drivenadapters.asegurados;

import co.com.linktic.domain.model.asegurados.Asegurado;
import co.com.linktic.domain.model.asegurados.AseguradoRepository;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class AseguradoAdapter implements AseguradoRepository {

    private final AseguradoEntityRepository aseguradoEntityRepository;

    public AseguradoAdapter(AseguradoEntityRepository aseguradoEntityRepository) {
        this.aseguradoEntityRepository = aseguradoEntityRepository;
    }

    @Override
    @Transactional(readOnly = true)
    public Asegurado getAsegurado(Integer tipoIdentificacion, String numeroIdentificacion) {
        return aseguradoEntityRepository.findByTipoIdentificacionIdTipoIdentificacionAndNumeroIdentificacion(
                tipoIdentificacion, numeroIdentificacion)
                .map(AseguradoMapper::toDto)
                .orElseThrow(RuntimeException::new);
    }
    @Override
    @Transactional
    public Asegurado save(Asegurado asegurado) {
        return AseguradoMapper.toDto(aseguradoEntityRepository.save(AseguradoMapper.toEntity(asegurado)));
    }

}
