package lesson34_PriorityQueue;

import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(1);
        priorityQueue.add(3);
        priorityQueue.add(0);
        priorityQueue.add(6);
        priorityQueue.add(4);
        priorityQueue.add(8);
        priorityQueue.add(9);
        System.out.println(priorityQueue.peek());
        // для цієї черги пріорітет 0-1-3-4-6-8-9 у зростанні
        // або якщо переписати самому компаратор

        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue.remove());


    }
}
