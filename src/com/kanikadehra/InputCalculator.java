package com.kanikadehra;

import java.util.Scanner;

/*

Write a method called inputThenPrintSumAndAverage that does not have any parameters.

The method should not return anything (void) and it needs to keep reading int numbers from the keyboard.

When the user enters something that is not an int then it needs to print a message in the format "SUM = XX AVG = YY".

XX represents the sum of all entered numbers of type int.
YY represents the calculated average of all numbers of type long.

EXAMPLES OF INPUT/OUTPUT:

EXAMPLE 1:

INPUT:

1
2
3
4
5
a

OUTPUT

SUM = 15 AVG = 3


EXAMPLE 2:

INPUT:

hello

OUTPUT:

SUM = 0 AVG = 0

 */

public class InputCalculator {

    public static void inputThenPrintSumAndAverage(){

        int sum = 0;
        int count = 0;

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextInt()){
            sum = sum + scanner.nextInt();
            count++;
        }

        long average = sum/count;

        System.out.println("SUM = " + sum + " AVG = " + average);
    }
}
