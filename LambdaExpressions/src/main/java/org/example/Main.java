package org.example;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

interface CoffeeTime {
     String coffeeTime(String drinkTime);
}

interface Addable{
    int add(int a,int b);
}

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(1);
        //numbers.forEach( (n) -> { System.out.println(n); } );

        Consumer<Integer> method = (n) -> { System.out.println(n); };
        numbers.forEach( method );

        Speak lambdaSample = () -> {
            System.out.println("Say cheese!");
        };

        lambdaSample.say(); //Say cheese!

        CoffeeTime lambdaSample2 = (time) -> {
            return "Coffee Time is " + time;
        };
        //CoffeeTime lambdaSample2 = (time) -> "Coffee Time is " + time; //alternative way

        System.out.println(lambdaSample2.coffeeTime("8:00am")); //Coffee Time is 8:00am

        Addable lambdaSample3 = (int a, int b) -> (a + b);
        System.out.println(lambdaSample3.add(10,20)); //30

        //using streams
        System.out.println("Using Streams and a Predicate Example...");
        Stream<Integer> stream = Stream.of(1,2,3,4,5,6,7,8,9,10);

        Predicate<Integer> p1 = integer -> integer > 4;
        Predicate<Integer> isEven = integer -> integer % 2 == 0;

        stream.filter(p1).filter(isEven).forEach(integer -> System.out.print(integer + " ")); //Anything greater than 4 that is an even number

    }


}