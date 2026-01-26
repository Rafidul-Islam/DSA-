package com.rafid.dsa.day02;

public class Count_Occurrence {
    public static void main(String[] args) {
        int n = 553555;
        int count = 0;

        while(n > 0){
            int rem = n % 10;
            if(rem == 5){
                count++;
            }
            n = n/10;
        }

        System.out.println("Number of Count_Occurrence : " + count);
    }
}
