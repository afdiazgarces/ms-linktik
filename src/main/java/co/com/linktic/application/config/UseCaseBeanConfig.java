package co.com.linktic.application.config;

import co.com.linktic.domain.model.asegurados.AseguradoRepository;
import co.com.linktic.domain.model.prima.PrimaRepository;
import co.com.linktic.domain.usecase.asegurado.AseguradoUseCase;
import co.com.linktic.domain.usecase.asegurado.AseguradoUseCaseImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UseCaseBeanConfig {

    @Bean
    public AseguradoUseCase aseguradoUseCase(AseguradoRepository aseguradoRepository, PrimaRepository primaRepository) {
        return new AseguradoUseCaseImpl(aseguradoRepository, primaRepository);
    }
}
