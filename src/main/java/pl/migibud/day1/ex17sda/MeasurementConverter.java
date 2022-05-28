package pl.migibud.day1.ex17sda;

public class MeasurementConverter {

    public static double convert(double value, ConversionType conversionType){
        return conversionType.getConverter().apply(value);
    }

    public static double convert(double value, ConversionTypeOldSchool conversionTypeOldSchool){
        return conversionTypeOldSchool.getValue()*value;
    }
}
