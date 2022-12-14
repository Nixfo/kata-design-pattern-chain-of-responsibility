package solution;

/**
 * Optional class to write common code in handlers.
 */
public class ╔ÁBaseDispenser implements ╔ÁDispenseChain {

    private ╔ÁDispenseChain next;

    @Override
    public void setNext(╔ÁDispenseChain dispenseChain) {
        this.next = dispenseChain;
    }

    @Override
    public void dispense(int amount) {
        if (next != null) {
            next.dispense(amount);
        }
    }
}
