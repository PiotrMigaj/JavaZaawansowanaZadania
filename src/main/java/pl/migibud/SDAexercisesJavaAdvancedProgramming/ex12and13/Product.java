package pl.migibud.SDAexercisesJavaAdvancedProgramming.ex12and13;

import java.time.LocalDate;

public interface Product {
    Double getPrice();
    Boolean isAvailable(LocalDate localDate);
}
