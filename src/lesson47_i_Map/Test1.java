package lesson47_i_Map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Slava Ukraini");
        list.add("geroyam slava");
        list.add("smert' vorogam");
        list.add("slava nacii");
        list.add("Ukraina ponad use");

//        for (int i = 0; i<list.size(); i++) {
//            list.set(i, String.valueOf(list.get(i).length()));
//        }


        //=> 13 13 14 11 17
        List <Integer> list2 = (list.stream().map(e->e.length()))
                .collect(Collectors.toList());
        System.out.println(list2);



    int [] array = {5,62,56,7,3};
    // 5 31 28 7 3
    array = Arrays.stream(array).map(element -> {
            if (element % 2 == 0) {
                element = element/2;
        }
    return element;
    }).toArray();
        System.out.println(Arrays.toString(array));
    }
}
