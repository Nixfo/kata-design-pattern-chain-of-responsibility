import static org.junit.jupiter.api.Assertions.*;

class ATMDispenserTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    void test_with_2592_euros() {
        ATMDispenser atm = new ATMDispenser();
        atm.getMoney(2592);

        assertEquals("Here is 51x50€\n"
            + "Here is 2x20€\n"
            + "The remainder is going to the trash! 2€ spoiled.", outContent.toString());
    }
}
