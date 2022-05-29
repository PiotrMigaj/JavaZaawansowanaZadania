package pl.migibud.day3.ex29;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        Integer[] myInitialList = new Integer[]{1,2,3,4,8,7,10};


        int result = PartitioningUtil.getPercentageValuesThatFulfilSpecification(myInitialList,v->v%2==0);
        System.out.println(result);



    }
}
