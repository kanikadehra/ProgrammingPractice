package com.kanikadehra;

public class PerfectNumber {

    public static boolean isPerfectNumber(int number) {

        int sum = 0;

        if (number < 1) {

            return false;
        }

        else {

            int i = 1;

            while (i < number) {

                if (number % i == 0) {
                   sum = sum + i;

                }
                i++;

            }

            if(sum == number){
                return true;
            }

            else {
                return false;
            }

        }

    }
}
