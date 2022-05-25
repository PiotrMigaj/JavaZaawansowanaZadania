package pl.migibud.designpattern.templatemethod.ex1;

public class UserTest implements Test{

    @Override
    public void initializeData() {
        System.out.println("Initialize data");
    }

    @Override
    public void checkTest() {
        System.out.println("Check test");
    }

    @Override
    public void cleanData() {
        System.out.println("Clean data");
    }
}
