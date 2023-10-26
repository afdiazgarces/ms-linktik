package co.com.linktic.domain.model.asegurados;

public interface AseguradoRepository {

    Asegurado save(Asegurado asegurado);

    Asegurado getAsegurado(Integer tipoIdentificacion, String numeroIdentificacion);
}
