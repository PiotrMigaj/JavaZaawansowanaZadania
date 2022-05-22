package pl.migibud.day1.ex8;

public class Parcel {

    private int xLength;
    private int yLength;
    private int zLength;
    private float weight;
    private boolean isExpress;

    public Parcel(int xLength, int yLength, int zLength, float weight, boolean isExpress) {
        this.xLength = xLength;
        this.yLength = yLength;
        this.zLength = zLength;
        this.weight = weight;
        this.isExpress = isExpress;
        new ParcelValidator().validate(this);
    }

    private static class ParcelValidator implements Validator{

        private static final int MAX_SUM_OF_SIZES = 300;
        public static final int MIN_SIZE_OF_ONE_OF_DIMENSIONS = 30;

        @Override
        public boolean validate(Parcel input) {
            if (input.xLength+input.yLength+ input.zLength>300){
                System.out.println();
            }


            return false;
        }

        private boolean ifSumOfSizesExceededMaxValue(Parcel input){
            return input.xLength+input.yLength+ input.zLength> MAX_SUM_OF_SIZES;
        }

        private boolean ifAnyOfSizeIsSmallerThatMinValue(Parcel input){
            return input.xLength<MIN_SIZE_OF_ONE_OF_DIMENSIONS||input.yLength<MIN_SIZE_OF_ONE_OF_DIMENSIONS||input.zLength< MIN_SIZE_OF_ONE_OF_DIMENSIONS;
        }

        private boolean ifWeightIsGreaterThanMaxValueAndIsExpress(Parcel input){
            return input.weight>30;
        }
    }


}
