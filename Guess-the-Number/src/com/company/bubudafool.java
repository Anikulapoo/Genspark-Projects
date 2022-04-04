package com.company;

import java.util.Random;
import java.util.Scanner;

public class bubudafool {

    public static String getName(Scanner in){
        String name1 = "";
        try {
            name1 = in.nextLine();
        }
        catch (Exception e){
            System.out.println("Invalid name input");
        }
        return name1;
    }

    public static void main(String[] args) {
        // write your code here{
        Scanner in = new Scanner(System.in);
        Random rand = new Random();

        String cont = "y";
        int randomNumber;
        int guess;
        int guessCount;
        String name;

        while (cont.equals("y")) {
            name = getName(in);
            randomNumber = rand.nextInt(20);
            randomNumber++;

            System.out.println("Hello!  What is your name?");
            name = in.nextLine();

            System.out.println("Well " + name + ", I am thinking of a number between 1 and 20.");
            System.out.println("Take a guess.");


            try {

                guess = Integer.parseInt(in.nextLine());
                guessCount = 1;


                while (guessCount < 6) {
                    if (randomNumber < guess) {
                        System.out.println("Your guess is too high.");
                        System.out.println("Take a guess.");
                    } else if (randomNumber > guess) {
                        System.out.println("Your guess is too low.");
                        System.out.println("Take a guess.");
                    } else {

                    }
                    guess = Integer.parseInt(in.nextLine());
                    guessCount++;
                }

                if (guessCount == 6) {
                    System.out.println("Sorry, you could not guess the number in 6 tries.");
                } else if (guessCount == 1) {
                    System.out.println("Good job, " + name + "!  You guessed my number on your first guess!");
                } else {
                    System.out.println("Good job, " + name + "!  You guessed my number in " + guessCount + " guesses!");
                }
                System.out.println("Would you like to play again? (y or n)");
                cont = in.nextLine().toLowerCase();


            } catch (Exception ex) {
                System.out.println("Please re-inter a viable input");
            }


        }
    }
}
