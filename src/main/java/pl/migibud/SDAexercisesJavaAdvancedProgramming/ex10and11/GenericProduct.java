package pl.migibud.SDAexercisesJavaAdvancedProgramming.ex10and11;

import lombok.ToString;

import java.time.LocalDate;
import java.util.Objects;
import java.util.function.Function;
import java.util.function.Supplier;

@ToString
public class GenericProduct implements Product{

    private Supplier<Double> price;
    private Function<LocalDate,Boolean> availability;

    public GenericProduct(Supplier<Double> price, Function<LocalDate, Boolean> availability) {
        this.price = price;
        this.availability = availability;
    }

    @Override
    public Double getPrice() {
        return this.price.get();
    }

    @Override
    public Boolean isAvailable(LocalDate localDate) {
        return this.availability.apply(localDate);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GenericProduct that = (GenericProduct) o;
        return Objects.equals(price, that.price) && Objects.equals(availability, that.availability);
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, availability);
    }
}
