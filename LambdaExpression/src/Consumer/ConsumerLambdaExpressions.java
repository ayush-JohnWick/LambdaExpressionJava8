package Consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Employee {
    String eName;
    int salary;
    String gender;

    Employee(String eName, int salary, String gender) {
        this.eName = eName;
        this.salary = salary;
        this.gender = gender;
    }

}

public class ConsumerLambdaExpressions {

    public static void main(String[] args) {
        Consumer<String> c = s -> System.out.println(s);
        //It has one method as accept and will just accepts one paramater
        c.accept("Welcome");

        //Combining Function, Predicate and Consumer for Lambda
        //Create multiple Employee objects calculate salary of each employee and add bonus
        //verfiy if bonus is greater than 5000 print all employee details

        //Task 1: calculate bonus
        //Task2 : if bonus greater than 5000
        // Task3 : print all employee details

        List<Employee> list = new ArrayList<>();
        list.add(new Employee("John", 50000, "Male"));
        list.add(new Employee("David", 20000, "Male"));
        list.add(new Employee("Mery", 30000, "Female"));
        list.add(new Employee("janice", 60000, "Female"));

        //Function Interface for task 1

        Function<Employee, Integer> f1 = i -> (i.salary * 10) / 100;

        //Predicate Interface for task 2

        Predicate<Integer> p1 = b -> b > 5000;

        //Consumer Interface for task 3

        Consumer<Employee> cs = emp -> {
            System.out.println(emp.eName);
            System.out.println(emp.salary);
            System.out.println(emp.gender);
        };

        //DO this for all employee objects

        for (Employee emp : list) {
            int bonus = f1.apply(emp);
            if (p1.test(bonus)) {
                cs.accept(emp);
                System.out.println("Bonus is " + bonus);
            }
        }


    }
}
