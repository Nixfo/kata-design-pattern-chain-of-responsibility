package solution;

public class ɵTrash extends ɵBaseDispenser {

    @Override
    public void dispense(int amount) {
        if (amount > 0) {
            System.out.println("The remainder is going to the trash! " + amount + "€ spoiled.");
        }

        // In case another handler is added after this one
        super.dispense(amount);
    }
}
