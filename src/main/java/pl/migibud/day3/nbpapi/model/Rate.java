
package pl.migibud.day3.nbpapi.model;

import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
public class Rate{
    public String currency;
    public String code;
    public double mid;
}