package lesson32;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        LinkedHashSet <Integer> lhs = new LinkedHashSet<>();
        lhs.add(2);
        lhs.add(0);
        lhs.add(4);
        lhs.add(9);
        lhs.add(6);
        lhs.add(7);
        System.out.println(lhs); // зберігається в порядку додавання в сет
        //цей сет потрбен коли треба запам'ятати послідовність додавання
        lhs.remove(6);
        System.out.println(lhs);
        lhs.contains(6);
    }
}
