package lesson30;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Vitalii");
        set.add("Vitali2");
        set.add("Vitali3");
        set.add(null);
       //System.out.println(set);
        for (String s:set) {
            System.out.println(s);
        }
        set.remove("Vitali3");
        System.out.println(set);
        System.out.println(set.size());

    }
}
