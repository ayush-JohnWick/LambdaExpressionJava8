package Predicate;

import java.util.function.Predicate;

public class PredicateJoiningAndOrNegate {

    public static void main(String[] args) {
        //Joining Predicates --> And, Or Negate
        //p1--> checks number is even
        //p2--> checks greater than 50

        int[] a={5,10,15,20,25,30,35,40,45,50,55,60,65};
        Predicate<Integer> p1= i-> i%2==0;
        Predicate<Integer> p2= i->i>50;


        for(int i : a){
            //and logical operator
            if(p1.test(i) && p2.test(i)){
               System.out.println(i);
            }
            //and predicate joining
            if(p1.and(p2).test(i)){
                System.out.println(i);
            }
            //or predicate joining
            if(p1.or(p2).test(i)){
                System.out.println(i);
            }

            //negate predicate joining
            if(p1.negate().test(i)){
                System.out.println(i);
            }
        }
    }
}
