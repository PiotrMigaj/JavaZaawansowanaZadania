package pl.migibud.day1.ex17sda;

import java.util.function.Function;

public enum ConversionType {

    METERS_TO_YARD(v->1.0936133*v),
    YARDS_TO_METERS(v->0.9144*v),
    CENTIMETERS_TO_INCHES(v->0.393700787*v),
    INCHES_TO_CENTIMETERS(v->2.54*v),
    KILOMETERS_TO_MILES(v->0.621371192*v),
    MILES_TO_KILOMETERS(v->1.609344*v);

    private Function<Double,Double> converter;

    ConversionType(Function<Double, Double> converter) {
        this.converter = converter;
    }

    public Function<Double, Double> getConverter() {
        return converter;
    }
}
