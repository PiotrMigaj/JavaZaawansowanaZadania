package pl.migibud.workbook.store;

public class Store<T> {

    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public static void main(String[] args) {

        Store<String> stringStore = new Store<>();

        stringStore.setT("Piotr");
        String t = stringStore.getT();
        System.out.println(t.toUpperCase());

    }
}
