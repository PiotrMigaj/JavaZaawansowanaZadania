package pl.migibud.day1.ex4sda;

import java.sql.Struct;
import java.util.*;
import java.util.stream.Collectors;

public class Storage {

    private Map<String, List<String>> storage;

    public Storage() {
        storage = new HashMap<>();
    }

    public void addToStorage(String key, String value){
        if (storage.containsKey(key)){
            //List<String> list = storage.get(key);
            //nie trzeba puta robić, bo robię na referencji!
            //list.add(value);
            storage.get(key).add(value);
        }else{
            List<String> list = new ArrayList<>();
            list.add(value);
            storage.put(key,list);
        }
    }

    public List<String> getValues(String key){
        return storage.get(key);
    }

    public void printValues(String key){
        System.out.println(getValues(key));
    }

    public List<String> findValues(String searchedValue){
        return storage.entrySet()
                .stream()
                .filter(entry->entry.getValue().contains(searchedValue))
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }


}
