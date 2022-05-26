package pl.migibud.workbook;

public class IntegerTest {

    Integer number;

    public Integer getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "IntegerTest{" +
                "number=" + number +
                '}';
    }

    public static void main(String[] args) {

        IntegerTest integerTest = new IntegerTest();

        System.out.println(integerTest);

    }
}
