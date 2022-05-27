package pl.migibud.day1.ex17;

public class Main {

    public static void main(String[] args) {

        MeasurementConverter measurementConverter = new MeasurementConverter();
        System.out.println(measurementConverter.convert(1,ConversionType.INCHES_TO_CENTIMETERS));

    }

}
