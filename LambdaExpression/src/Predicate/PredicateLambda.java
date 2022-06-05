package Predicate;

import java.util.function.Predicate;

public class PredicateLambda {

    public static void main(String[] args) {
        //Predicate is a Functional Interface accepts one parameter as arguments we should go for predicate
        //only when there is conditional check

        //Accepts one parameter and returns boolean
        //use only if there is any conditional check in program...

        //Example 1
        Predicate<Integer> p= i->(i>10);
        //It has one abstract method as test() reason behind functional interface and
        //returns boolean value true or false
        System.out.println(p.test(20)); //true
        System.out.println(p.test(5));  //false

        //Example 2 check length of string whether greater than 4 or not
        Predicate<String> pr= s->(s.length()>4);
        System.out.println(pr.test("Ayush")); //true
        System.out.println(pr.test("xyz"));   //false

        //Example 3 print array elements whose size is >4 from array
        String[] names={"David", "Smith", "Ayush", "harry", "Mary", "John"};

        for(String name: names){
            if(pr.test(name)){
                System.out.println(name);
            }

            //alternate old school ways disdvantage if there are multiple conditions we need to use
            //logical operator like and or
           /* if(name.length()>4){
                System.out.println(name);
            }*/
        }
    }
}
