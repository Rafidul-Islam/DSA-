package com.rafid.dsa.day02;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter ");
        char op = in.next().trim().charAt(0);

        if(op == '+' || op == '-' || op == '*' || op == '/'){
            int a = in.nextInt();
            int b = in.nextInt();

            if(op == '+'){
                System.out.println(a+b);
            }if(op == '-'){
                System.out.println(a-b);
            }if(op == '*'){
                System.out.println(a*b);
            }if(op == '/'){
                System.out.println(a/b);
            }
        }
    }
}
