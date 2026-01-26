package com.rafid.dsa.day02;

import java.util.Scanner;

public class Case_Check {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        char ch = in.next().trim().charAt(0);

        if((ch >= 'a' && ch <='z')){
            System.out.println("Character is Lowercase !");
        }else {
            System.out.println("Character is Uppercase !");
        }


    }
}
