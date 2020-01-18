package com.kanikadehra;

public class PalindromeNumber {

    public static boolean isPalindrome(int number){

        int n = Math.abs(number);
        int reverse = 0;
        int lastDigit = 0;

        while (n!=0){
            lastDigit = n % 10;
            reverse = reverse * 10 +lastDigit;

            n = n/10;
        }



        if(Math.abs(number) == reverse){
            return true;
        }
        else {
            return false;
        }
    }
}
