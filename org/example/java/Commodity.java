package org.example.java;

/*
 *
 *
 * @Farhat Ghani
 */
/*
This application sets the command string to "BUY" in line 16.
 When the switch is tested, the case block in line 23 to 25 is run.
 The quantity of the commodity increases by 5 and the balance is lowered by £20
 when the commodity program is run, it produces the following output:
 Balance: 550
 Quantity: 42

 */

public class Commodity {

    public static void main(String args[]){

        String command = "Buy";
        int balance = 550;
        int quantity = 42;

        switch (command) {
            case "BUY":
                quantity += 5;
                balance -= 20;
                break;

            case "SELL":
                quantity -= 5;
                balance += 15;
        }
        System.out.println("Balance: " +balance + "\n"+"Quantity: "+ quantity);
    }
}
