package pl.migibud.workbook.lombokbuildertest;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Builder
@ToString
public class Car {

    private final String name;
    private final int price;
}
