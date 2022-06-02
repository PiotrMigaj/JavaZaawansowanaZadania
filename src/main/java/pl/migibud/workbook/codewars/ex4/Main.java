package pl.migibud.workbook.codewars.ex4;

public class Main {

    public static void main(String[] args) {

        long number = 625;
        long result = (long) Math.sqrt(number);

        long anotherNumber = result*result;

        if (anotherNumber==number){
            System.out.println((result+1)*(result+1));
        }
        else{
            System.out.println(-1);
        }
    }



}
