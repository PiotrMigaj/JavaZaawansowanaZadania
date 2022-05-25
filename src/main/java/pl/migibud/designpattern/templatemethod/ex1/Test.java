package pl.migibud.designpattern.templatemethod.ex1;

public interface Test {

    void initializeData();
    void checkTest();
    void cleanData();

    default void run(){
        this.initializeData();
        this.checkTest();
        this.cleanData();
    }
}
