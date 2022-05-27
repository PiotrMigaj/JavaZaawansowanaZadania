package pl.migibud.workbook.trainwithinterfaces;

public class MyClassOpertor implements Operation {

    private Operation operation;

    public MyClassOpertor(Operation operation) {
        this.operation = operation;
    }

    public int getValue(int value) {
        return operation.operate(value);
    }

    @Override
    public int operate(int value) {
        return this.operation.operate(value);
    }
}
