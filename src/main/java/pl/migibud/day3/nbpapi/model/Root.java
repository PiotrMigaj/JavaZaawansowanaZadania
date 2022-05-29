package pl.migibud.day3.nbpapi.model;

import lombok.Getter;
import lombok.ToString;

import java.util.ArrayList;

@ToString
@Getter
public class Root{
    public String table;
    public String no;
    public String effectiveDate;
    public ArrayList<Rate> rates;
}