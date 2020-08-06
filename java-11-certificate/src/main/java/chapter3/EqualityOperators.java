package chapter3;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;

import java.util.Objects;


public class EqualityOperators {

    public static void main(String[] args) {

//        EqualityOperation on Objects

        Animal cat1 = new Animal(4, true);
        Animal spider = new Animal(8, false);
        Animal cat2 = new Animal(4, true);

        System.out.println("cat1==cat2: "+ (cat1==cat2)); //false as they are not the same reference
        System.out.println("cat1.equals(cat2): "+ cat1.equals(cat2)); //true as they have the same value and .equals() is overwritten
        System.out.println("cat1==spider: " + (cat1==spider)); //false as they are two different objects

//        EqualityOperation on primitives

        double mydouble = 2; //2.0
        float myFloat = 2f;
        int myInt = 2;
//        int myIntAfterPromotion = mydouble + myInt; //DOES NOT COMPILE because

        System.out.println((float) mydouble == (myFloat = (myInt + myFloat))); //true because myInt+myFloat is promoted to float
        System.out.println(myFloat); //4.0 because the assignment took place in the line above
//        boolean monkey = true == 3; // DOES NOT COMPILE
//        boolean ape = false != "Grape"; // DOES NOT COMPILE
//        boolean gorilla = 10.2 == "Koko"; // DOES NOT COMPILE

        double myOtherDouble = 4.0;
        boolean areMyDoublesSame = myOtherDouble == mydouble; //redundant equality check as it's always false
        System.out.println(areMyDoublesSame);
        System.out.println(myOtherDouble == myFloat); //float is promoted to double
    }


    @EqualsAndHashCode
    @AllArgsConstructor
    static class Animal {
        int numberOfLegs;
        boolean isMammal;
    }


}
