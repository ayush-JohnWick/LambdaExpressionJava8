package Predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

class Employee {
    String eName;
    int salary;
    int experience;

    Employee(String ename, int salary, int experience) {
        this.eName = ename;
        this.salary = salary;
        this.experience = experience;
    }
}


public class PredicateLambdaObjects {

    public static void main(String[] args) {
        //emp obj --> return name if sal>30k and exp>3
        Employee emp = new Employee("John", 50000, 5);

        Predicate<Employee> p = e -> (e.salary > 30000 && e.experience > 3);

        System.out.println(p.test(emp));  //true

        //print name of employee if condition satisfied and also use of multiple employee objects
        //Example 2
        List<Employee> list = new ArrayList<>();
        list.add(new Employee("Mary", 25000, 5));
        list.add(new Employee("David", 55000, 7));
        list.add(new Employee("Janice", 65000, 4));
        list.add(new Employee("Paul", 55000, 2));

        for (Employee e : list) {
            if (p.test(e)) {
                System.out.println(e.eName + "  " + e.salary);
            }
        }


    }
}
