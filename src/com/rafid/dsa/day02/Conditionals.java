package com.rafid.dsa.day02;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age : ");
        int age = input.nextInt();

        // Common Java Conditional Statements
        if(age > 18){
            System.out.println("Voter");
        }else{
            System.out.println("Non-Voter");
        }

        // Ternary operated Java
        System.out.println(age > 18 ? "Voter" : "Non-Voter");

    }
}