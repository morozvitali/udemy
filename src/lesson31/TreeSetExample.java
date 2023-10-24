package lesson31;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        Set<Integer> treeSet1 = new TreeSet<>();
        treeSet1.add(32);
        treeSet1.add(456);
        treeSet1.add(7);
        treeSet1.add(34);
        treeSet1.add(787);
        treeSet1.add(243);
        System.out.println(treeSet1);

        treeSet1.remove(243);
        System.out.println(treeSet1);
        System.out.println(treeSet1.contains(243));

        //treeSet1.add(null)
    }

}
