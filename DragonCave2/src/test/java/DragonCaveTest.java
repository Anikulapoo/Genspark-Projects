import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class DragonCaveTest {

    DragonCave caveTest;

    @BeforeEach
    void setUp() {
        caveTest = new DragonCave();
    }


    @Test
    void beginningText() {
        caveTest.beginningText();
        String ecpected = "You are in a land full of dragons. In front of you, \n" +
                "you see two caves. In one cave, the dragon is friendly \n" +
                "and will share his treasure with you. The other dragon \n" +
                "is greedy and hungry and will eat you on sight. \n" +
                "Which cave will you go into? (1 or 2) \n";
        assertEquals(ecpected);
    }

    private void assertEquals(String ecpected) {
    }

    @Test
    void choice1() {
        caveTest.choice1();
        String expected = "You approach the cave... \\n\" +\n" +
                "        \"It is dark and spooky... \\n\" +\n" +
                "        \"A large dragon jumps out in front of you! He opens his jaws and... \\n\" +\n" +
                "        \"Gobbles you down in one bite! \\n";
        assertEquals(expected);
    }

    @Test
    void choice2() {
        caveTest.choice2();
        String expected = "You approach the cave... \\n\" +\n" +
                "                \"It is dark and spooky... \\n\" +\n" +
                "                \"A large dragon jumps out in front of you! He opens his jaws and... \\n\" +\n" +
                "                \"Inside his mouth, you see treasure mountains of treasure and tells you to take it! \\n";
        assertEquals(expected);
    }
}
