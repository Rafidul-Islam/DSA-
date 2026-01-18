package com.rafid.dsa.day01;

public class Variables {
    public static void main(String[] args) {
        String name = "Rafidul Islam";
        int age = 22;
        float bankBalance = 735471.2616f;

        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Bank Balance : " + bankBalance);

        int x = 5;
        int y = 6;

        System.out.println("The sum is " + x + y);   // Prints: The sum is 56
        /* So what happens here is the string gets to concatenated to 5 creating a full string and this happens for the y also. So in combination both become string */
        System.out.println("The sum is " + (x + y)); // Prints: The sum is 11
    }
}
