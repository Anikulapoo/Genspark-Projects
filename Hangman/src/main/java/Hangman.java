

import java.util.Scanner;

public class Hangman {
    private static String[] words = {"Apple", "Banana", "Cat", "Dog", "Elephant", "Frog" };
    private static String word = words[(int) (Math.random() * words.length)];
    private static String underscore = new String(new char[word.length()]).replace("\0", "_");
    private static int count = 1;

    public static void main(String[] args) {
        System.out.println("HANGMAN");
        hangmanPicture();
        System.out.println("Missed letters:");
        Scanner sc = new Scanner(System.in);

        while (count < 7 && underscore.contains("_")) {
            System.out.println(underscore);
            System.out.println("Guess a letter!");
            String guess = sc.next();
            hang(guess);
        }
        sc.close();
    }

    public static void hang(String guess) {
        String newUnderscore = "";
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == guess.charAt(0)) {
                newUnderscore += guess.charAt(0);
            } else if (underscore.charAt(i) != '_') {
                newUnderscore += word.charAt(i);
            } else {
                newUnderscore += "_";
            }
        }

        if (underscore.equals(newUnderscore)) {
            count++;
            hangmanPicture();
            missedLetter(guess);
        } else {
            underscore = newUnderscore;
        }
        if (underscore.equals(word)) {
            System.out.println("Correct! You win! The word was " + word);
        }
    }
    public static void missedLetter (String guess){
            String tempString;
            StringBuilder sb = new StringBuilder();
            sb.append(guess);
            tempString = sb.toString();
            System.out.println("Missed letters: " + tempString);

    }


    public static void hangmanPicture() {
        if (count == 1) {
            System.out.println("   +-----+");
            System.out.println("         |");
            System.out.println("         |");
            System.out.println("         |");
            System.out.println("         |");
            System.out.println("        ===");
        }
        if (count == 2) {
            System.out.println("Wrong guess, try again");
            System.out.println("   +-----+");
            System.out.println("   O     |");
            System.out.println("         |");
            System.out.println("         |");
            System.out.println("         |");
            System.out.println("        ===");
        }
        if (count == 3) {
            System.out.println("Wrong guess, try again");
            System.out.println("   +-----+");
            System.out.println("   O     |");
            System.out.println("   |     |");
            System.out.println("   |     |");
            System.out.println("         |");
            System.out.println("        ===");
        }
        if (count == 4) {
            System.out.println("Wrong guess, try again");
            System.out.println("   +-----+");
            System.out.println("   O     |");
            System.out.println("   |     |");
            System.out.println("   |     |");
            System.out.println("  /      |");
            System.out.println("        ===");
        }
        if (count == 5) {
            System.out.println("Wrong guess, try again");
            System.out.println("   +-----+");
            System.out.println("   O     |");
            System.out.println("   |     |");
            System.out.println("   |     |");
            System.out.println("  /\\    |");
            System.out.println("        ===");
        }
        if (count == 6) {
            System.out.println("Wrong guess, try again");
            System.out.println("   +-----+");
            System.out.println("   O     |");
            System.out.println("  /|     |");
            System.out.println("   |     |");
            System.out.println("  /\\    |");
            System.out.println("        ===");
        }
        if (count == 7) {
            System.out.println("GAME OVER!");
            System.out.println("   +-----+");
            System.out.println("   O     |");
            System.out.println("  /|\\     |");
            System.out.println("   |     |");
            System.out.println("  /\\    |");
            System.out.println("        ===");
            System.out.println("GAME OVER! The word was " + word);
        }
    }
}
