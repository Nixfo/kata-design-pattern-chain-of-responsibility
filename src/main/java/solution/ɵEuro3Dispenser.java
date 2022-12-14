package solution;

public class ɵEuro3Dispenser extends ɵBaseDispenser {

    @Override
    public void dispense(int amount) {
        if (amount >= 3) {
            int coinNumber = amount / 3;
            int remainder = amount % 3;

            System.out.println(coinNumber + " special coins of 3€ for you");

            super.dispense(remainder);
        } else {
            super.dispense(amount);
        }
    }
}
