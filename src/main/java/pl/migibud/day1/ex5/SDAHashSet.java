package pl.migibud.day1.ex5;

import java.util.HashMap;
import java.util.HashSet;


//adapter dla HashMap
public class SDAHashSet<T> {

    private static final Object FAKE_OBJECT = new Object();

    private HashMap<T,Object> map;

    public SDAHashSet() {
        this.map = new HashMap<>();
    }

    public boolean add(T t){
        return map.put(t,FAKE_OBJECT)==null;
    }

    public boolean remove(T t){
        return map.remove(t)==FAKE_OBJECT;
    }

    public int size(){
        return map.size();
    }

    public boolean contains(T t){
        return map.containsKey(t);
    }

    public void clear(){
        map.clear();
    }
}
