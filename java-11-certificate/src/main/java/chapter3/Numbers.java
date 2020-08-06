package chapter3;

public class Numbers {

    double myDouble = 3.33;
    short myShort = 2;
    double result = myDouble * myShort;

//    float egg = 2.0 / 9; // DOES NOT COMPILE
//        2.0 is default to be double; result will be double
    float egg = (float)2.0/9;
//    int tadpole = (int)5 * 2L; // DOES NOT COMPILE
//        5 is promoted to long; result will be long
    int tadpole = 5*(int)2L;
//    short frog = 3 - 2.0; // DOES NOT COMPILE
//        2.0 is default to double; result will be a double
    short frog = 3 - (short)2.0;

    public static void main(String[] args) {

        double a = 2F;
        //float b = 2D; does not compile as double > float
        float b = (float)Math.PI;

        System.out.println(b);          //3.1415927
        System.out.println(Math.PI);    //3.141592653589793

        int firstNumber = 3; //this assignment is redundant
        int secondNumber = 2*(firstNumber = 5); //perfectly valid
//        int secondNumber = 2*firstNumber = 5; // DOES NOT COMPILE as firstNumber = 5 is a an operation in itself

        System.out.println(secondNumber); //10
        System.out.println(firstNumber); //5

        boolean healthy = false;
        if(healthy = true) { //the assignment is executed and the result of the assignment is the value of the assignment so this evaluates to true
            System.out.print("Good!");
        }

        System.out.println(healthy);

    }
}
