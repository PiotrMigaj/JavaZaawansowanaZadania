package pl.migibud.day1extras.ex3;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Builder
@ToString
public class Product {
    private Long id;
    private String name;
    private String category;
    private double price;

    public void setDicountedPrice(double discount) {
        this.price = price*(1-discount);
    }
}
