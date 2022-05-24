package pl.migibud.day1extras.ex3;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.time.LocalDate;
import java.util.List;

@AllArgsConstructor
@Getter
@ToString
public class Order {
    private Long id;
    private LocalDate localDate;
    private List<Product> productList;
}
