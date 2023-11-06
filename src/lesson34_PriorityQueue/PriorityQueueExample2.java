package lesson34_PriorityQueue;

import java.util.Objects;
import java.util.PriorityQueue;


public class PriorityQueueExample2 {
    public static void main(String[] args) {
        Student st1 = new Student("Vitalii", 2);
        Student st2 = new Student("Vitali1", 1);
        Student st3 = new Student("Vitali2", 4);
        Student st4 = new Student("Vitali3", 5);
        Student st5 = new Student("Vitali4", 0);

        PriorityQueue<Student> pq = new PriorityQueue<>();
        pq.add(st1);
        pq.add(st2);
        pq.add(st3);
        pq.add(st4);
        pq.add(st5);
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());

    }
}


class Student implements Comparable<Student> {
    String name;
    int course;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public int compareTo(Student other) {
        return this.course - other.course;
    }
}