package chapter3;

public class LogicalOperator {
    public static void main(String[] args) {
        int rabbit = 6;
        boolean bunny = (rabbit >= 6) || (++rabbit <= 7);
        System.out.println(rabbit);
        System.out.println(bunny); // true

        bunny = (rabbit >= 6) && (++rabbit <= 7);
        System.out.println(rabbit); // rabbit is 7 because the statment ++rabbit is executed as both statements on the logical operator needs to be evaluated
        System.out.println(bunny); // true
    }
}
