package pl.migibud.workbook.testinnerclass;

public abstract class OuterClass {


    public static abstract class InnerClass{

        public void innerClassMethod(){};

    }

}

class Main{
    public static void main(String[] args) {

        OuterClass.InnerClass innerClass = new OuterClass.InnerClass() {
            @Override
            public void innerClassMethod() {
                System.out.println("Zadanie zrobione");
            }
        };

        innerClass.innerClassMethod();

    }
}
