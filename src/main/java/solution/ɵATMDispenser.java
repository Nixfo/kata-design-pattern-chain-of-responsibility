package solution;

public class ɵATMDispenser {

    private ɵDispenseChain dispenseChain;

    public ɵATMDispenser() {
        this.dispenseChain = new ɵEuro50Dispenser();
        ɵDispenseChain euro20Dispenser = new ɵEuro20Dispenser();
        ɵDispenseChain euro3Dispenser = new ɵEuro3Dispenser();
        ɵDispenseChain trash = new ɵTrash();

        this.dispenseChain.setNext(euro20Dispenser);
        euro20Dispenser.setNext(euro3Dispenser);
        euro3Dispenser.setNext(trash);
    }

    public void getMoney(int amount) {
        this.dispenseChain.dispense(amount);
    }
}
