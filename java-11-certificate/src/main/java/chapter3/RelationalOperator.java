package chapter3;

public class RelationalOperator {

    //for some reasons cannot run tests;
//    @Test
//    private void myTest() {
//
//        Assertions.assertTrue(myObj instanceof String);
//    }

    public static void openZoo(Number time) {
        if (time instanceof Integer)
            System.out.print((Integer) time + " O'clock");
        else
            System.out.print(time);
    }

    public static void main(String[] args) {

        String myString = "a string";
        Object myObj = myString;

        System.out.println(myObj instanceof String); //true because myObj == myString which is a String
        System.out.println(myString instanceof Object); // true
        myObj = new Object();
        System.out.println(myObj instanceof String); //false

        openZoo(9);
        int nineInt = 9;
        Integer nineInteger = Integer.valueOf(9); // "boxing"
//        System.out.println(nineInteger instanceof int); DOES NOT COMPILE cannot use instanceof on primitives
//        System.out.println(nineInt instanceof Number); DOES NOT COMPILE cannot use instanceof on primitives
        System.out.println(nineInt==nineInteger); //true they are the same "9" in memory
        System.out.println((Integer) nineInt instanceof Number); //true
    }
}
