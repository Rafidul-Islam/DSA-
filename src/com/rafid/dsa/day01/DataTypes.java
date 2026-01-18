package com.rafid.dsa.day01;

public class DataTypes {

    // Primitive Data types = int, float , double, long , short, boolean
    // These data types cant be broken into smaller parts anymore

    // Non-Primitive data types : String , ArrayList , Classes
    // These can be broken into parts and can be programmed by the programmer.

    public static void main(String[] args) {
        int a = 10;  // ---> 4 byte
        short sh = 2; // 2 bytes
        float b = 3.141678f; // 4 bytes
        double f = 364262374671d; // 8 bytes
        char c = 'a';// In java char takes 2 bytes but in c/cpp char takes 1 byte;
        String s = "rafidul islam";
        byte d = 127; // Max value of byte --> 1 byte
        boolean t = true; // 1 byte

        // Constant variable in java
        final String BIRTHDAY ;
        BIRTHDAY = "01/03/2004";

        System.out.println(a);
        System.out.println(sh);
        System.out.println(b);
        System.out.println(f);
        System.out.println(c);
        System.out.println(s);
        System.out.println(d);
        System.out.println(t);
        System.out.println(BIRTHDAY);


        int age = 10 ;
//        String age = 20;// This will produce an error; Cant redeclare a variable name with another type;
    }
}
