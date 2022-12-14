package solution;

/**
 * Optional class to write common code in handlers.
 */
public class ɵBaseDispenser implements ɵDispenseChain {

    private ɵDispenseChain next;

    @Override
    public void setNext(ɵDispenseChain dispenseChain) {
        this.next = dispenseChain;
    }

    @Override
    public void dispense(int amount) {
        if (next != null) {
            next.dispense(amount);
        }
    }
}
