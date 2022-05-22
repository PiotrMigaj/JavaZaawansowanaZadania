package pl.migibud.day1.ex7;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.ArrayBlockingQueue;

public class WeaponMagazine {

    private Deque<String> weaponMagazine;
    private final int maxNumberOfBulletInMagazine;

    public WeaponMagazine(int capacity) {
        this.weaponMagazine = new ArrayDeque<>(); // check
        maxNumberOfBulletInMagazine = capacity;
    }

    public void loadBullet(String bullet) {
        if (maxNumberOfBulletInMagazine == weaponMagazine.size()) {
            throw new IllegalArgumentException("Magazine is full");
        }
        weaponMagazine.push(bullet);
    }

    public boolean isLoaded() {
        return !weaponMagazine.isEmpty();
    }

    public String shot() {
//        if (isLoaded()){
//            return weaponMagazine.pop();
//        }
//        return "pusty magazynek";
        return isLoaded() ? weaponMagazine.pop() : "pusty magazynek";
    }
}
