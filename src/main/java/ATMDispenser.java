public class ATMDispenser {

    public ATMDispenser() {
    }

    public void getMoney(int amount) {
        // TODO complete this class and implement the pattern Chain of Responsibility
        new Euro50Dispenser().dispense(amount);
    }
}
