package pl.migibud.day1.ex8sda;

import pl.migibud.day1.ex8sda.Parcel;

public class ParcelValidator implements Validator {

    private static final int TOTAL_MAX_LENGTH = 300;
    public static final int SINGLE_MIN_LENGTH = 30;
    public static final int MAX_WEIGHT_FOR_EXPRESS = 15;
    public static final int MAX_WEIGHT_FOR_NON_EXPRESS = 30;

    @Override
    public boolean validate(Parcel input) {
        return validate(input) &&
                isEveryLengthMoreThan30(input) &&
                isWeightCorrect(input);
    }

    private boolean isXYZlessThan300(Parcel input) {
        return input.getxLength() + input.getyLength() + input.getzLength() < TOTAL_MAX_LENGTH;
    }

    private boolean isEveryLengthMoreThan30(Parcel input) {

        return input.getxLength() >= SINGLE_MIN_LENGTH &&
                input.getyLength() >= SINGLE_MIN_LENGTH &&
                input.getzLength() >= SINGLE_MIN_LENGTH;

    }

    private boolean isWeightCorrect(Parcel input) {
        return (input.isExpress() && input.getWeight() <= MAX_WEIGHT_FOR_EXPRESS) ||
                (!input.isExpress() && input.getWeight() <= MAX_WEIGHT_FOR_NON_EXPRESS);
    }

}
