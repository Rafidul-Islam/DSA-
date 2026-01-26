package com.rafid.dsa.day02;

import java.util.Scanner;

public class Fibonacci_Numbers {
    public static void main(String[] args) {
        int a = 0, b = 1, n, next = 0;

        Scanner in = new Scanner(System.in);
        n = in.nextInt();

        for(int i = 0 ; i < 9 ; i++){
           next = a + b ;
           a = b;
           b = next;
        }

        System.out.println("Fibonacci of the " + n + " is " + next);



    }
}
