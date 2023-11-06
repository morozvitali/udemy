package lesson43_Predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

public class RemoveIf {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("i");
        arrayList.add("am");
        arrayList.add("grood");
        arrayList.add("hello");
        arrayList.add("bye");

        //видалити з лимста, якщо.. в листі залищиться 2 елемента
        //так
        System.out.println(arrayList);
        arrayList.removeIf(element -> element.length()<3);
        System.out.println(arrayList);
        //або так
        Predicate <String> p = element -> element.length()>3;
        arrayList.removeIf(p);
        System.out.println(arrayList);
    }
}
