import java.util.Scanner;

public class DragonCave {

    public void beginningText() {
        System.out.println("You are in a land full of dragons. In front of you, \n" +
        "you see two caves. In one cave, the dragon is friendly \n" +
        "and will share his treasure with you. The other dragon \n" +
        "is greedy and hungry and will eat you on sight. \n" +
        "Which cave will you go into? (1 or 2) \n");
    }

    public void choice1() {
        System.out.println("You approach the cave... \n" +
        "It is dark and spooky... \n" +
        "A large dragon jumps out in front of you! He opens his jaws and... \n" +
        "Gobbles you down in one bite! \n");
    }

    public void choice2() {
        System.out.println("You approach the cave... \n" +
                "It is dark and spooky... \n" +
                "A large dragon jumps out in front of you! He opens his jaws and... \n" +
                "Inside his mouth, you see treasure mountains of treasure and tells you to take it! \n");
    }

    public void main(String[] args) {

        Scanner myObj = new Scanner(System.in);
        beginningText();
        int choice = 0;
        try {
            choice = myObj.nextInt();
        } catch (Exception e) {
            System.out.println("Entered a wrong value.");
        }
        result(choice);

    }

    public void result(int finalChoice) {

        switch (finalChoice) {
            case 1 -> choice1();
            case 2 -> choice2();
            default -> System.out.println("Please re-enter a viable input.");
        }


    }
}

