package com.rafid.dsa.day03;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruit = "mango";

        String input = in.next();

        if (input.equals(fruit)) {
            System.out.println("Order Mango");
        }

        // == would do the work, but not the same. (==) checks the value.
        // Revise Object and value in programming;

        switch (input) {
            case "mango":
                System.out.println("Order Mango !");
                break;
            case "apple":
                System.out.println("Order apple !");
                break;
            case "jackfruit":
                System.out.println("Order jackfruit !");
                break;
            case "grapes":
                System.out.println("Order grapes !");
                break;
            default:
                System.out.println("No fruit selected !");
                break;
        }
    }
}
