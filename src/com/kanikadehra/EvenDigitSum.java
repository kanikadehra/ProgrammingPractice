package com.kanikadehra;

/*

Write a program to get the sum of even digits in a number.

Example: 7632 should return 8.

 */


public class EvenDigitSum {

    public static int getEvenDigitSum(int number) {

        int sum = 0;
        int digit = 0;

        if (number< 0){

            return -1;
        }

        while (number >0){

            digit = number % 10;

            if(digit %2==0){
               sum = sum+digit;
           }

           number = number/10;
        }

        return sum;
    }

}
