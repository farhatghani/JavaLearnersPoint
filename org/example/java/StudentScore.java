package org.example.java;

public class StudentScore {

    public static void main(String args[]){


        int answer = 12;
        int rightAnswer = 12;

        int score = 0;
        if (answer == rightAnswer){
            score +=10;
            System.out.println("Student get 10 point");
        }else{
            score -=5;
            System.out.println("Sorry, that's wrong. You lose 5 point");
        }

    }
}
