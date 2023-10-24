package lesson30;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSetExample2 {
    public static void main(String[] args) {
        HashSet<Integer> hashSet1 = new LinkedHashSet<>();
        hashSet1.add(1);
        hashSet1.add(441);
        hashSet1.add(5423);
        hashSet1.add(4);
        hashSet1.add(563);

        HashSet<Integer> hashSet2 = new LinkedHashSet<>();
        hashSet2.add(3245);
        hashSet2.add(1234);
        hashSet2.add(441);
        hashSet2.add(1);
        hashSet2.add(563);

        //HashSet<Integer> union = new HashSet<>(hashSet1);
        //union.addAll(hashSet2);

        //HashSet<Integer> intersect = new HashSet<>(hashSet1);
        //intersect.retainAll(hashSet2);
        //System.out.println(intersect);

        HashSet<Integer> subtract = new HashSet<>(hashSet1);
        subtract.removeAll(hashSet2);
        System.out.println(subtract);


    }
}
