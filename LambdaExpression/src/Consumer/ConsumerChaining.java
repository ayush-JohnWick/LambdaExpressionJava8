package Consumer;

import java.util.function.Consumer;

public class ConsumerChaining {

    public static void main(String[] args) {
        Consumer<String> c1 = s -> System.out.println(s + " " + " is white");
        Consumer<String> c2 = s -> System.out.println(s + " " + " is having four legs");
        Consumer<String> c3 = s -> System.out.println(s + " " + " is  eating grass");

        //1st way
        c1.accept("Cow");
        c2.accept("Cow");
        c3.accept("Cow");

        //andThen()
        c1.andThen(c2).andThen(c3).accept("Cow");

        //combining all three consumers into one
        Consumer<String> c4 = c1.andThen(c2).andThen(c3);
        c4.accept("Cow");
    }
}
