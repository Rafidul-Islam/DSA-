package com.rafid.dsa.day02;

public class Loops {
    public static void main(String[] args) {
        // There are 3 types of loops in every programming language
        //  1 --> for loop (more authorization when you know where to stop)
        //  2 --> while loop (standard)
        //  3 --> do while loop (to run only once even if condition is false)

        // Syntaxes
        int j = 0 ;

        for(int i = 0 ; i <= 5 ; i++){
            System.out.println(i);
        }

        while (j < 10 ){
            System.out.println("i = " + j);
            j++;
        }

        int k = 10;
        do{
            System.out.println("k = " + k);
            k++;
        }while(k < 10);



    }

}
