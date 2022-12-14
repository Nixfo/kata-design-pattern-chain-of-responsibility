package solution;

public class ɵEuro50Dispenser extends ɵBaseDispenser {

    @Override
    public void dispense(int amount) {
        if (amount >= 50) {
            int billNumber = amount / 50;
            int remainder = amount % 50;

            System.out.println("Here is " + billNumber + "x50€");

            super.dispense(remainder);
        } else {
            super.dispense(amount);
        }
    }
}
