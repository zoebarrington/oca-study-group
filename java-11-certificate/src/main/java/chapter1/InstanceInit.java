package chapter1;

public class InstanceInit {

    static {
        System.out.println("inside static initialization block");
    }

    private String name = "D";

    {
        System.out.println(name); //this will always be D
        name = "inside instance initialization block"; // as this assignment only affects the instance
        System.out.println(name);
    }

    public static void main(String[] args) {
        System.out.println("chapter1.A");
        InstanceInit instanceInit1 = new InstanceInit();
        InstanceInit instanceInit2 = new InstanceInit();

        System.out.println(instanceInit1.name);
        instanceInit2.name = "newName";
        System.out.println(instanceInit2.name);
        {
            System.out.println("B");
        }

        byte apples = 5;
        short oranges = 10;
        short ear = 10;
        int hearing = 2 * ear;

    }
}

/* code inside instance initialization block ({} outside main) will only be executed when an instance of the class is created
   static { } <-- static initialization block execute only once in the beginning when the class is loaded.
 */

class Bike7 {

    int speed;
    String name;

    {
        speed = 100;
    }

    Bike7() {
        System.out.println("speed is " + speed);
    }

    public static void main(String args[]) {
        Bike7 b1 = new Bike7();
        Bike7 b2 = new Bike7();

        System.out.println(b1.getName());
    }

    public String getName() {
        return name;
    }

    /*
       if no assignment is made for variables, numbers will default to 0
                                                String              to null
                                                boolean             to false
        when assessing the field directly or through getters
        no NPE will be thrown
     */
}

class Bike8 {
    int speed;

    {
        System.out.println("instance initializer block invoked");
    }

    Bike8() {
        System.out.println("constructor is invoked");
    }

    public static void main(String args[]) {
        Bike8 b1 = new Bike8();
        Bike8 b2 = new Bike8();
    }

//    any code inside the instance initializer will be executed before code in the constructor
}


class A{
    A(){
        System.out.println("parent class constructor invoked");
    }
}

class B2 extends A{
    B2(){
        super();
        System.out.println("child class constructor invoked");
    }

    {System.out.println("instance initializer block is invoked");}

    public static void main(String args[]){
        B2 b=new B2();
    }
}

/* The instance initializer block is created when instance of the class is created.
The instance initializer block is invoked after the parent class constructor is invoked (i.e. after super() constructor call).
The instance initializer block comes in the order in which they appear.*/


class Zoo {

    public static void main(String[] args) {
        System.out.println(args[0]);
        System.out.println(args[1]);
    }

/*    the arguments for main is provided in the runner config, or can be provided in the command line
      e.g. javac chapter1.Zoo.java (given that zoo is on an independent file) <- to compile chapter1.Zoo.java into chapter1.Zoo.class
           java chapter1.Zoo Elephant Lion <-- to execute chapter1.Zoo.class with the 2 provided arguments
           TODO: Starting in Java 11, you can run a program without compiling it first —well, without typing the javac command that is.
//       command line: java chapter1.Zoo.java Elephant **have to include .java extension
       */

}

