package lesson31;

import java.util.Objects;
import java.util.TreeSet;

public class TreeSetExample2 {
    public static void main(String[] args) {
        TreeSet<Student> treeSet = new TreeSet<>();

        Student st1 = new Student("Vitalii", 1);
        Student st2 = new Student("Vitali2", 3);
        Student st3 = new Student("Vitali3", 4);
        Student st4 = new Student("Vitali4", 5);
        Student st5 = new Student("Vitali5", 2);

        treeSet.add(st1);
        treeSet.add(st2);
        treeSet.add(st3);
        treeSet.add(st4);
        treeSet.add(st5);
        System.out.println(treeSet);
        System.out.println(treeSet.first());
        System.out.println(treeSet.last());

        Student st7 = new Student("Vitali7", 4);
        System.out.println(treeSet.headSet(st7));
        System.out.println(treeSet.tailSet(st7));


        Student st8 = new Student("Vitali8", 2);
        Student st9 = new Student("Vitali9", 4);
        System.out.println(treeSet.subSet(st8, st9));


        System.out.println(st3.equals(st9));
        System.out.println(st3.hashCode()== st9.hashCode());
    }
}

class Student implements Comparable <Student>{
    String name;
    int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return this.course-o.course;
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
        return Objects.hash(course);
    }
}