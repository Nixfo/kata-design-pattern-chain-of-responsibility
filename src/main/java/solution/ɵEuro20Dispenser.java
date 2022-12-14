package solution;

public class ɵEuro20Dispenser extends ɵBaseDispenser {

    @Override
    public void dispense(int amount) {
        if (amount >= 20) {
            int billNumber = amount / 20;
            int remainder = amount % 20;

            System.out.println("Here is " + billNumber + "x20€");

            super.dispense(remainder);
        } else {
            super.dispense(amount);
        }
    }
}
