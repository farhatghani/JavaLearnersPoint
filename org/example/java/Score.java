package org.example.java;

public class Score {

    public static void main(String args []){

        int total = 0;
        int score = 7;
        if (score == 7){

            System.out.println("Your score is touchdown");
        }
        if (score == 3){
            System.out.println("Your kick a field goal!");
        }
        total = total + score;
        System.out.println("Total score:" + total);
    }
}
