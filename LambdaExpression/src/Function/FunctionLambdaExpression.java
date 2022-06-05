package Function;

import java.util.function.Function;

public class FunctionLambdaExpression {

    public static void main(String[] args) {
        Function<Integer, Integer> f= n->n*n;

        System.out.println(f.apply(5));
        System.out.println(f.apply(2));
        System.out.println(f.apply(10));

        //Example 2
        Function<String, Integer> fn=s->s.length();
        System.out.println(fn.apply("Welcome")); //7
        System.out.println(fn.apply("Hello World")); //11

    }
}
