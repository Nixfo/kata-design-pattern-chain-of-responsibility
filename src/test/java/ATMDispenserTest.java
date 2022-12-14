import org.junit.jupiter.api.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class ATMDispenserTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    void test_with_50_euros() {
        ATMDispenser atm = new ATMDispenser();
        atm.getMoney(50);

        assertEquals("Here is 1x50€\r\n", outContent.toString());
    }

    @Test
    void test_with_20_euros() {
        ATMDispenser atm = new ATMDispenser();
        atm.getMoney(40);

        assertEquals("I give you 2 bills of 20€\r\n", outContent.toString());
    }

    @Test
    void test_with_3_euros() {
        ATMDispenser atm = new ATMDispenser();
        atm.getMoney(9);

        assertEquals("3 special coins of 3€ for you\r\n", outContent.toString());
    }

    @Test
    void test_with_2592_euros() {
        ATMDispenser atm = new ATMDispenser();
        atm.getMoney(2592);

        assertEquals("Here is 51x50€\r\n"
            + "I give you 2 bills of 20€\r\n"
            + "The remainder is going to the trash! 2€ spoiled.\r\n", outContent.toString());
    }
}
