package comparation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        Employee emp1 = new Employee(100, "Zaur", "Tregulov", 1000);
        Employee emp2 = new Employee(122, "Bill", "Kill", 1033);
        Employee emp3 = new Employee(77, "Mona", "Lisa", 900);
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);

//        System.out.println("Before sorting \n" +list);
//        Collections.sort(list, new idComparator());
//        System.out.println("After sorting \n" +list);

//        System.out.println("Before sorting \n" +list);
//        Collections.sort(list, new nameComparator());
//        System.out.println("After sorting \n" +list);

        System.out.println("Before sorting \n" + list);
        Collections.sort(list, new salaryComparator());
        System.out.println("After sorting \n" + list);


    }

}


class Employee {
    int id;
    String name;
    String surname;
    int salary;

    public Employee(int id, String name, String surname, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}' + "\n";
    }

//    @Override
//    public int compareTo(Object o) {
//        if (this.id == o.id) {
//            return 0;
//        } else if (this.id < o.id) {
//            return -1;
//        } else {
//            return 1;
//        }
//    }
}

class idComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee emp1, Employee emp2) {
        if (emp1.id == emp2.id) {
            return 0;
        } else if (emp1.id < emp2.id) {
            return -1;
        } else {
            return 1;
        }
    }
}

class nameComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee emp1, Employee emp2) {
        return emp1.name.compareTo(emp2.name);
    }
}

class salaryComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee emp1, Employee emp2) {
        return emp1.salary - emp2.salary;
    }
}