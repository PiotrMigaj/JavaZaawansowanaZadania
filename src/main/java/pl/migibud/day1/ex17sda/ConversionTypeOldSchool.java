package pl.migibud.day1.ex17sda;

public enum ConversionTypeOldSchool {
    METERS_TO_YARD(1.0936133),
    YARDS_TO_METERS(0.9144),
    CENTIMETERS_TO_INCHES(0.393700787),
    INCHES_TO_CENTIMETERS(2.54),
    KILOMETERS_TO_MILES(0.621371192),
    MILES_TO_KILOMETERS(1.609344);

    private double value;

    ConversionTypeOldSchool(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }
}
