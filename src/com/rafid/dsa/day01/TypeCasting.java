package com.rafid.dsa.day01;

public class TypeCasting {
    public static void main(String[] args) {
        // Widening
        int a = 10 ;
        double c = a;
        System.out.println(c);

        // Narrowing
        float b = 11.5f;
        int d = (int) b;
        System.out.println(d);
    }
}
