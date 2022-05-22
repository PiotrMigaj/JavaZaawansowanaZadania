package pl.migibud.day1.ex5;

public class SDAHashSet<T> {

    public Object[] objects;

    public SDAHashSet(int initialSize) {
        this.objects = new Object[initialSize];
    }

    public void add(T t){
        objects[calculateHash(t)]=t;
    }

    public int calculateHash(T t){
        return t.hashCode()%objects.length;
    }


}
