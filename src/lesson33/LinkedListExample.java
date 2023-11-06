package lesson33;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        // Сенс черги в том щоб додавати в початок черги а видаляти з кінця,
        // додавати весь час в середину або видаляти звідти немає сенсу для черги як такої
        queue.add("Vitalii");
        queue.add("Vitali2");
        queue.add("Vitali3");
        queue.add("Vitali4");
        queue.add("Vitali5");
        System.out.println(queue);

        //offer - якщо чергу обмежено кількістю
        //то .offer(..) не призведе до помилки у прграмі на відміну від .add(..)
        queue.offer("Vitali6");
        queue.offer("Vitali7");
        queue.offer("Vitali8");
        queue.offer("Vitali9");
        queue.offer("Vitali0");
        System.out.println(queue);

        System.out.println(queue.remove ()); // просто видалити перший елемент, повертає елемент
        System.out.println(queue.remove ("Vitali7")); // видалити обраний елемент, повертає тру

        System.out.println(queue);

        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        //System.out.println(queue.remove());
        //System.out.println(queue.remove());
        //System.out.println(queue.remove());
        System.out.println(queue.remove());
        // System.out.println(queue.remove()); викличе помилку бо черга вже пуста -
        // треба використати .poll() замість remove() для того аби не було помилки
        System.out.println(queue.poll());
        System.out.println(queue.poll());

        //  .element() - показує верхній елемент в черзі а .peek() робить те саме
        //  тільки не викидає помилки якщо черга порожня - поверне null
        System.out.println("---------");
        System.out.println(queue.element());
        System.out.println(queue.peek());


    }
}
