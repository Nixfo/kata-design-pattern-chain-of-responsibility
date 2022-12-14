public class Euro50Dispenser {

    public void dispense(int amount) {
        // TODO complete this class and implement the pattern Chain of Responsibility
        if (amount >= 50) {
            int billNumber = amount / 50;

            System.out.println("Here is " + billNumber + "x50€");
        }
    }
}
