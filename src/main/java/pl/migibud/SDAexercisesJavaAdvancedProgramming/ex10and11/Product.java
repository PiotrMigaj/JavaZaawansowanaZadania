package pl.migibud.SDAexercisesJavaAdvancedProgramming.ex10and11;

import java.time.LocalDate;

public interface Product {
    Double getPrice();
    Boolean isAvailable(LocalDate localDate);
}
