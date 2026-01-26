package com.rafid.dsa.day02;

import java.util.Scanner;

public class Largest_Number {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

//        if(a > b && a > c){
//            System.out.println("a is the largest num");
//        }else if(b > c && b > a){
//            System.out.println("b is the largest number");
//        }else {
//            System.out.println("c is the largets number");
//        }

        // Alternate logic
        int max = a ;

        if (b> max){
            max = b;
        }

        if ( c > max){
            max = c ;
        }

        System.out.println("Max : " + max);

    }
}
