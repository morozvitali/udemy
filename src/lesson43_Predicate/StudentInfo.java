package lesson43_Predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

// Preicate це вже готовий інтерфейс,
// параметризований інтерфейс
public class StudentInfo {

    void testStudents (ArrayList<Student> arrayList, Predicate<Student> sP) {
        for (Student s : arrayList) {
            if (sP.test(s)) {
                System.out.println(s);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList <Student> arrayList = new ArrayList<>();

        Student st1 = new Student("Vitalii", 2);
        Student st2 = new Student("Vitali2", 4);
        Student st3 = new Student("Vitali3", 8);
        Student st4 = new Student("Vitali4", 3);
        Student st5 = new Student("Vitali5", 0);

        arrayList.add(st1);
        arrayList.add(st2);
        arrayList.add(st3);
        arrayList.add(st4);
        arrayList.add(st5);

        StudentInfo studentInfo = new StudentInfo();
        studentInfo.testStudents(arrayList, (s) -> s.course<5);

        //predicate видалити якщо курс більше 2
        Predicate<Student> p1 = p-> p.course>2;

        Predicate<Student> p2 = p-> {
            return p.course<8;
        };

        studentInfo.testStudents (arrayList, p1.or(p2));
        studentInfo.testStudents (arrayList, p1.and(p2));

        //negate() це отрицание р1 - значення навпаки
        studentInfo.testStudents (arrayList, p1.negate());

        arrayList.removeIf(p1);
        System.out.println(arrayList);
    }
}


class Student {
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
}

