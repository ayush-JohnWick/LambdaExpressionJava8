package Function;

import java.util.function.Function;

/***
 * Function chaining
 * andThen()
 * compose()
 */
public class FunctionChaining {

    public static void main(String[] args) {
        Function<Integer, Integer> f1= i->i*2;
        Function<Integer, Integer> f2=i->i*i*i;

        System.out.println(f1.andThen(f2).apply(2)); // O/p: 64 2 will get passed to f1 and then output will get passed to f2
        System.out.println(f1.compose(f2).apply(2)); //O/p: 16 2 will get passed to f2 and then output will get passed to f1

    }
}
