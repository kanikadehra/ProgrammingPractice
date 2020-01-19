package com.kanikadehra;

/*

Write a program to find shared digits in 2 numbers

Example : 30 and 13 should return true.


 */

public class HasSharedDigit {

    public static boolean hasSharedDigit(int num1 , int num2) {

        int digit = 0;

        if((num1 <10 || num1 >99) || (num2 <10 || num2>99)){

            return false;
        }


        int num1SecondDigit = num1 % 10;
        int num1FirstDigit = num1/10;

        int num2SecondDigit = num2 % 10;
        int num2FirstDigit = num2/10;

        if(num1SecondDigit==num2FirstDigit || num1SecondDigit == num2SecondDigit ||
                num1FirstDigit == num2FirstDigit || num1FirstDigit == num2SecondDigit){
            return true;

        }
        else {

            return false;
        }


    }
}
