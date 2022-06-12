package org.example;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        HashMap<Integer,String> hm = new HashMap<Integer,String>();
        hm.put(1, "Calculator");
        hm.put(2, "Factorial");
        hm.put(3,"Recursion");
        hm.put(4,"Fibonacci");
        hm.put(5,"Palindrome");
        hm.put(6,"Permutation and Combination");
        hm.put(7,"String Reverse");

        System.out.println("Select a program by picking its number: ");
        for (Integer key : hm.keySet()){
            System.out.println(key + " -> " + hm.get(key));
        }
        Integer input = sc.nextInt();
        switch(input){
            case 1:
                Calculator.startCalculator();
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            default:
                System.out.println("Invalid Choice");
                break;
        }
    }
}