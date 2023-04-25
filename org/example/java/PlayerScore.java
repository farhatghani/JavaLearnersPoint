package org.example.java;

public class PlayerScore {

    public static void main(String args[]){
        int playerScore = 12000;
        int playerLives = 3;
        int difficultyLevel = 0;

        if (playerScore > 9999){

            playerLives++;

            System.out.println("Extra life!");
            System.out.println("PlayerLives increase: " +playerLives);

            difficultyLevel = difficultyLevel + 5;
            System.out.println("Difficulty Level increase: " +difficultyLevel);

        }

    }
}
