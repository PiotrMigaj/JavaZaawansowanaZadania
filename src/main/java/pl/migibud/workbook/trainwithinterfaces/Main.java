package pl.migibud.workbook.trainwithinterfaces;

public class Main {

    public static void main(String[] args) {

        MyClassOpertor myClassOpertor = new MyClassOpertor(v->2*v);
        System.out.println(myClassOpertor.getValue(2));
    }
}
