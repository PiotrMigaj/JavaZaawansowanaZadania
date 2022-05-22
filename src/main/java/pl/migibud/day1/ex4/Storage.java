package pl.migibud.day1.ex4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Storage {

    private Map<String, List<String>> storage = new HashMap<>();

    public void addToStorage(String key,String value){

        if (storage.containsKey(key)){
            this.upDateList(key, value);
            return;
        }
        List<String> newList = new ArrayList<>();
        newList.add(value);
        storage.put(key,newList);
    }

    private void upDateList(String key, String value){
        List<String> tmpList = storage.get(key);
        tmpList.add(value);
    }

    public List<String> getValues(String key){
        return storage.get(key);
    }

    public List<String> printValues(String key){
        storage.get(key).forEach(System.out::println);
        return storage.get(key);
    }

    public List<String> getAllKeysOfSpecifiedValue(final String value){
        return storage.entrySet().stream().filter(v->v.getValue().contains(value)).map(Map.Entry::getKey).collect(Collectors.toList());
    }

    public static void main(String[] args) {

        Storage storage = new Storage();
        storage.addToStorage("VW","Golf");
        storage.addToStorage("VW","Passat");
        storage.addToStorage("Seat","Passat");

        System.out.println(storage.getAllKeysOfSpecifiedValue("Passat"));

    }


}
