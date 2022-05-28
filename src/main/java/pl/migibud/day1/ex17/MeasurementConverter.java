package pl.migibud.day1.ex17;

public class MeasurementConverter {

    public double convert(int value, ConversionType conversionType){
        return conversionType.executeConversion(value);
    }
}
