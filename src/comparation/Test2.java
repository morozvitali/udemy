package comparation;

import java.util.ArrayList;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        Employee emp1 = new Employee(100, "Zaur", "Tregulov", 1000);
        Employee emp2 = new Employee(122, "Bill", "Kill", 1033);
        Employee emp3 = new Employee(77, "Mona", "Lisa", 900);
        list.add (emp1);
        list.add (emp2);
        list.add (emp3);
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

}