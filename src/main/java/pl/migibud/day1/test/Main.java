package pl.migibud.day1.test;

public class Main {

    public static void main(String[] args) {

        MeasurementConverter measurementConverter = new MeasurementConverter();
        System.out.println(measurementConverter.convert(1,ConversionType.INCHES_TO_CENTIMETERS));

    }

}
