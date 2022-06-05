@FunctionalInterface
interface  Cab{
    public String bookCab(String source, String destination);
}

public class LambdaExpression {

    public static void main(String[] args) {
        Cab cab = (source, destination) -> {
            System.out.println("Ola cab is booked from " + source + " TO " + destination);
            return ("Price 50000 Rs ");
        };
        System.out.println(cab.bookCab("Hyd", "Mumbai"));
    }
}
