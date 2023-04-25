package org.example.java;

/*
 *
 *
 * @Farhat Ghani
 */
/*
This Bank Balance declares the variables and constant for 3% interest rate,
and then asks the user for balance.
The application accepts a user's answer from the keyboard as a String,
and then use the first character of the String to determine whether the loop
should continue.
As long as the user wants to continue, the application continues to display increasing bank balances.
The while loop in tha application use to see user enters any value other than 'y'
the top body never execute and program will end.
However, if the user enter 'y', all the statements within the loop body execute.
The application increase the balance by the interest rate value.
Then the balance times 100 is cast to an integer, and the result is divided by 100.
The net effect of two statements is to limit the number of decimal places in the balance to two.
After these calculations, the application display the new balance and ask the user to want another balance.
The year variable increases and the loop body ends with closing curly brace.
After the loop body executes, control retun to the top of the loop,
where the boolean expression in the while loop is tested again.
if the user enter'y' to continue, the loop is entered and the process begins again.

 */
import java.util.Scanner;

public class BankBalance {

    public static void main(String args[]) {

        double balance;
        String response;
        char responseChar;
        int tempBalance;
        int year = 1;
        final double INT_RATE = 0.03;

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter initial bank balance > ");
        balance = keyboard.nextDouble();
        keyboard.nextLine();
        System.out.println(" Do you want to see next year's balance?");
        System.out.print("Enter y or n > ");
        response = keyboard.nextLine();
        responseChar = response.charAt(0);
        while (responseChar == 'y')
        {
            balance = balance + balance * INT_RATE;
            tempBalance = (int) (balance * 100);
            balance = tempBalance / 100.0;
            System.out.println("After year " + year + " at " + INT_RATE + " interest rate, balance is £" + balance);
            year = year +1;

            System.out.print("Do you want to see the balance " + "\n at the end of the another year? y or n? > ");
            response = keyboard.nextLine();
            responseChar = response.charAt(0);

        }

    }
}
