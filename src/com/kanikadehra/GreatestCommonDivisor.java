package com.kanikadehra;


/*

Write a program to find greatest common divisor.

 */

public class GreatestCommonDivisor {

    public static int getGreatestCommonDivisor(int num1 , int num2){

        if(num1 < 10 || num2<10 ){

            return -1;
        }

        int min = 0;

        min = Math.min(num1, num2);

        int gcd = 1;


        for(int i = 1; i<=min; i++){

            if(num1%i ==0 && num2%i==0){
                gcd = i;
            }
        }

        return gcd;

    }
}
