package co.com.linktic.domain.usecase.util;

import java.time.LocalDate;
import java.time.Period;

public class FechaUtil {

    private FechaUtil() {}

    public static Integer calcularEdad(LocalDate fechaNacimiento) {
        return Period.between(fechaNacimiento, LocalDate.now()).getYears();
    }
}
