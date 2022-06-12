package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Calculator {

    public static void startCalculator() {
        List<Integer> integerList = inputIntegers();
        if (integerList.size() <= 1) {
            System.out.println("Needs more than one integer. Exiting.");
            return;
        }
        try {
            switch(operationChoice()){
                case 1: //addition
                    System.out.println("Addition: Total = "+ addList(integerList));
                    break;
                case 2: //subtraction
                    System.out.println("Subtraction: Difference = "+ subtractList(integerList));
                    break;
                case 3: //multiplication
                    System.out.println("Multiplication: Product = "+ multiplyList(integerList));
                    break;
                case 4: //division
                    System.out.println("Division: Quotient = "+ divideList(integerList));
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static List<Integer> inputIntegers() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose at least two integers in this format:");
        System.out.println("int1 int2 int3 ... intN (one space between)");

        List<Integer> values = new ArrayList<>();
        String[] input = sc.nextLine().split(" ");
        for (String num: input){
            values.add(Integer.parseInt(num));
        }
        return values;
    }

    public static int operationChoice() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose an operation: ");
        System.out.println("1 -> Addition");
        System.out.println("2 -> Subtraction");
        System.out.println("3 -> Multiplication");
        System.out.println("4 -> Division");
        return sc.nextInt();
    }

    public static int addList(List<Integer> numArr) throws ArithmeticException {
        Integer total = 0;

        for(Integer num : numArr) {
            total += num;
        }

        return total;
    }

    public static int subtractList(List<Integer> numArr) throws ArithmeticException {
        Integer difference = numArr.get(0);

        for(int i = 1; i < numArr.size(); i++){
            difference -= numArr.get(i);
        }

        return difference;
    }

    public static int multiplyList(List<Integer> numArr) throws ArithmeticException {
        Integer total = 1;

        for(Integer num : numArr) {
            total *= num;
        }

        return total;
    }

    public static int divideList(List<Integer> numArr) throws ArithmeticException {
        Integer quotient = numArr.get(0);

        for(int i = 1; i < numArr.size(); i++){
            quotient /= numArr.get(i);
        }

        return quotient;
    }
}
