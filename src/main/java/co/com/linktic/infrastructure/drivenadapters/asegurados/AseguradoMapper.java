package co.com.linktic.infrastructure.drivenadapters.asegurados;

import co.com.linktic.domain.model.asegurados.Asegurado;
import co.com.linktic.infrastructure.drivenadapters.sexos.SexoEntity;
import co.com.linktic.infrastructure.drivenadapters.tiposidentificacion.TipoIdentificacionEntity;

public class AseguradoMapper {

    private AseguradoMapper() {
    }

    public static AseguradoEntity toEntity(Asegurado asegurado) {
        return AseguradoEntity.builder()
                .numeroIdentificacion(asegurado.getNumeroIdentificacion())
                .apellidos(asegurado.getApellidos())
                .nombres(asegurado.getNombres())
                .fechaNacimiento(asegurado.getFechaNacimiento())
                .tipoIdentificacion(TipoIdentificacionEntity.builder()
                        .idTipoIdentificacion(asegurado.getIdTipoIdentificacion()).build())
                .sexo(SexoEntity.builder().idSexo(asegurado.getIdSexo()).build())
                .build();
    }

    public static Asegurado toDto(AseguradoEntity aseguradoEntity) {
        return Asegurado.builder()
                .numeroIdentificacion(aseguradoEntity.getNumeroIdentificacion())
                .apellidos(aseguradoEntity.getApellidos())
                .nombres(aseguradoEntity.getNombres())
                .fechaNacimiento(aseguradoEntity.getFechaNacimiento())
                .idTipoIdentificacion(aseguradoEntity.getTipoIdentificacion().getIdTipoIdentificacion())
                .idSexo(aseguradoEntity.getSexo().getIdSexo())
                .build();
    }
}
