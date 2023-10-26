package co.com.linktic.domain.model.prima;

import java.util.List;

public interface PrimaRepository {

    List<Prima> getPrimaByEdad(Integer edad);
}
