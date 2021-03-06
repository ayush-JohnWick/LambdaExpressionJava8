package Supplier;

import java.util.Date;
import java.util.function.Supplier;

public class SupplierLambdaExpression {

    public static void main(String[] args) {
        //Supplier has one method as get() and just supply and doesn't take any arguments
        //also it doesn't have any return type
        Supplier<Date> s = () -> new Date();

        System.out.println(s.get());


    }
}
