package solution;

public class ɵEuro3Dispenser extends ɵBaseDispenser {

    @Override
    public void dispense(int amount) {
        if (amount >= 3) {
            int coinNumber = amount / 3;
            int remainder = amount % 3;

            System.out.println("Here is " + coinNumber + "x3€");

            super.dispense(remainder);
        } else {
            super.dispense(amount);
        }
    }
}
