package pl.migibud.workbook.test2;

import java.util.function.Consumer;

public enum TestEnum {

    PITER(()-> System.out.println("Im Peter")),
    ANIA (()-> System.out.println("Im Ania"));

    private Runnable runnable;

    TestEnum(Runnable runnable){
        this.runnable=runnable;
    }

    public void sayStr(){
        runnable.run();
    }

}

class TestRun{
    public static void main(String[] args) {

        TestEnum.PITER.sayStr();
    }
}
