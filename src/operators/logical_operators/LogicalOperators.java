package operators.logical_operators;

public class LogicalOperators {
    public static void main(String[] args) {
        System.out.println(true | false | false | true); // true - slower performance since will check all the options
        System.out.println(true || false || false || true); // true - faster performance
    }
}
