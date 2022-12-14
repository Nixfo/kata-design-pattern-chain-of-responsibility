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
        atm.getMoney(20);

        assertEquals("Here is 1x20€\r\n", outContent.toString());
    }

    @Test
    void test_with_3_euros() {
        ATMDispenser atm = new ATMDispenser();
        atm.getMoney(3);

        assertEquals("Here is 1x3€\r\n", outContent.toString());
    }

    @Test
    void test_with_2592_euros() {
        ATMDispenser atm = new ATMDispenser();
        atm.getMoney(2592);

        assertEquals("Here is 51x50€\r\n"
            + "Here is 2x20€\r\n"
            + "The remainder is going to the trash! 2€ spoiled.\r\n", outContent.toString());
    }
}
