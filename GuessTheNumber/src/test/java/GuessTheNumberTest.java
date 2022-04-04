import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class GuessTheNumberTest {

    GuessTheNumber numberTest;

    @BeforeEach
    void setUp() {
        numberTest = new GuessTheNumber();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getName() {
        String userName = "Yoseph";
        Scanner in = new Scanner(userName);
        assertEquals("yoseph", GuessTheNumber.getName(in), "Invalid name input.");
        in.close();
    }

    
}