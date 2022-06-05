package Function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

class Employee {
    String eName;
    int salary;

    Employee(String eName, int salary) {
        this.eName = eName;
        this.salary = salary;
    }
}

public class FunctionObjects {

    public static void main(String[] args) {
        //calculate bonus as per each employee objects
        List<Employee> emp = new ArrayList<>();
        emp.add(new Employee("John", 25000));
        emp.add(new Employee("Mary", 15000));
        emp.add(new Employee("David", 50000));

        Function<Employee, Integer> f1 = e -> {
            int sal = e.salary;
            if (sal >= 10000 && sal <= 20000)
                return (sal * 10) / 100;
            else if (sal >= 20000 && sal <= 30000)
                return (sal * 20) / 100;
            else if (sal >= 30000 && sal <= 40000)
                return (sal * 30) / 100;
            else
                return (sal * 40) / 100;
        };

        for (Employee e : emp) {
            int bonus = f1.apply(e);
            System.out.println(e.eName + " " + e.salary + " Bonus is " + bonus);
        }
        //Joining Predicate and Function if bonus is greater than or equal to 5000 need to print
        //name and salary of employee as it is conditional check we can use Predicate here

        Predicate<Integer> p = b -> b >= 5000;

        for (Employee e : emp) {
            int bonus = f1.apply(e);
            if (p.test(bonus))// condition to check bonus is greater than or equal to 5000
                System.out.println(e.eName + " " + e.salary + " Bonus is " + bonus);

        }


    }
}
