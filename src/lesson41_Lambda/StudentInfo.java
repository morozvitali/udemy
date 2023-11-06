package lesson41_Lambda;
import java.util.ArrayList;
public class StudentInfo {

    void testStudent (ArrayList<Student> arrayList,StudentCheks sc) {
        for (Student s : arrayList) {
            if (sc.check(s)) {
                System.out.println(s);
            }
        }
    }

    public static void main(String[] args) {
        Student student1 = new Student("Marichka", 'f', 20,2,55 );
        Student student2 = new Student("Bogdan", 'm', 36,4,81 );
        Student student3 = new Student("Mihaylo", 'm', 27,1,44 );
        Student student4 = new Student("Any", 'f', 44,3,85 );
        Student student5 = new Student("Bob", 'm', 38,2,95 );
        ArrayList <Student> arrayList = new ArrayList<>();
        arrayList.add(student1);
        arrayList.add(student2);
        arrayList.add(student3);
        arrayList.add(student4);
        arrayList.add(student5);

        StudentInfo info = new StudentInfo();
        info.testStudent(arrayList, new CheckOverGrade());
        System.out.println("-------------------");
        info.testStudent(arrayList, new StudentCheks() {
            @Override
            public boolean check(Student s) {
                return s.age<33;
            }
        });

        info.testStudent(arrayList, s -> s.age<30);

//        StudentInfo si = new StudentInfo();
//        si.printStudentUnderAge(arrayList, 30);
//        System.out.println("----------------");
//        si.printSudentOverGrade(arrayList, 65);
//        System.out.println("----------------");
//        si.studentsMixCondition(arrayList,33,'m',80);
    }



//    void printSudentOverGrade (ArrayList<Student> arrayList, double grade) {
//        for (Student s : arrayList) {
//            if (s.avgGrade > grade) {
//                System.out.println(s);
//            }
//        }
//    }

//    void printStudentUnderAge (ArrayList<Student> arrayList, int age){
//        for (Student s : arrayList) {
//            if (s.age < age) {
//                System.out.println(s);
//            }
//        }
//    }

//    void studentsMixCondition (ArrayList<Student> arrayList, int age, char sex, double grade) {
//        for (Student s : arrayList) {
//            if (s.avgGrade > grade && s.sex == sex && s.age > age) {
//                System.out.println(s);
//            }
//        }
//    }
}

interface StudentCheks {
    boolean check (Student s);
}

class CheckOverGrade implements StudentCheks {
    @Override
    public  boolean check (Student s) {
        return s.avgGrade > 90;
    }
}