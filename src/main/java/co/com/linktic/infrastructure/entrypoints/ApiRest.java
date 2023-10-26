package co.com.linktic.infrastructure.entrypoints;

import co.com.linktic.domain.model.dto.AseguradoRequest;
import co.com.linktic.domain.model.dto.AseguradoResponse;
import co.com.linktic.domain.usecase.asegurado.AseguradoUseCase;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiRest {

    private final AseguradoUseCase aseguradoUseCase;

    public ApiRest(AseguradoUseCase aseguradoUseCase) {
        this.aseguradoUseCase = aseguradoUseCase;
    }

    @PostMapping(path = "/calcular-liquidacion")
    public ResponseEntity<AseguradoResponse> calcularLiquidacion(@Valid @RequestBody AseguradoRequest request) {
        return ResponseEntity.ok(aseguradoUseCase.calcularLiquidacion(request));
    }
}
