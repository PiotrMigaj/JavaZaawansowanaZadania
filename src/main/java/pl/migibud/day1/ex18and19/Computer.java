package pl.migibud.day1.ex18and19;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Computer {
    String processor;
    String ram;
    String graphicsCard;
    String manufacturer;
    String model;
}
