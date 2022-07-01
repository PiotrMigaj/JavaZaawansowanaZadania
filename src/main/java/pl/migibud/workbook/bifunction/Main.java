package pl.migibud.workbook.bifunction;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {

        BiFunction<Integer,Integer,Integer> myfunction;

        String opis = "-";



        switch (opis){
            case "+":
                myfunction= Main::add;
                break;
            case "-":
                myfunction=(a,b)->a-b;
                break;
            default:
                throw new IllegalArgumentException();
        }

        System.out.println(myfunction.apply(2,3));



    }

    public static int add(int a,int b){
        return a+b;
    }
}
