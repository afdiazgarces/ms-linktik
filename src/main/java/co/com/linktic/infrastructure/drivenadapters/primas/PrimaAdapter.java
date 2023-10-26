package co.com.linktic.infrastructure.drivenadapters.primas;

import co.com.linktic.domain.model.prima.Prima;
import co.com.linktic.domain.model.prima.PrimaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Repository
public class PrimaAdapter implements PrimaRepository {

    private final PrimaEntityRepository primaEntityRepository;

    public PrimaAdapter(PrimaEntityRepository primaEntityRepository) {
        this.primaEntityRepository = primaEntityRepository;
    }

    @Override
    @Transactional(readOnly = true)
    public List<Prima> getPrimaByEdad(Integer edad) {
        return primaEntityRepository.findBetweenEdad(edad)
                .stream()
                .map(PrimaMapper::toPrima)
                .collect(Collectors.toList());
    }
}
