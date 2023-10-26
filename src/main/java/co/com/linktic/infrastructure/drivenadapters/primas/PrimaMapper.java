package co.com.linktic.infrastructure.drivenadapters.primas;

import co.com.linktic.domain.model.prima.Prima;

public class PrimaMapper {

    private PrimaMapper() {}

    public static Prima toPrima(PrimaEntity primaEntity) {
        return Prima.builder()
                .idPrima(primaEntity.getIdPrima())
                .porcentajePrima(primaEntity.getPorcentajePrima())
                .idAmparo(primaEntity.getAmparo().getIdAmparo())
                .nombreAmparo(primaEntity.getAmparo().getNombre())
                .build();
    }
}
