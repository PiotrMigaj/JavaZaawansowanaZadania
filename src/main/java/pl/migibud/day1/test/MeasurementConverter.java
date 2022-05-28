package pl.migibud.day1.test;

public class MeasurementConverter {

    public double convert(int value, ConversionType conversionType){
        return conversionType.executeConversion(value);
    }
}
