package methods;


abstract class PaymentProcessor {

    // Final method which cannot be overridden
    public final void processPayment() {

        // Define custom flow here that should not be changed
        validateDetails();
        deductAmount();
        sendReceipt();
    }

    // Let subclasses use their custom logic for this
    protected abstract void deductAmount();

    private void validateDetails() {
        System.out.println("Validating payment details...");
    }

    private void sendReceipt() {
        System.out.println("Sending receipt to customer...");
    }
}

public class FinalMethods extends PaymentProcessor{

    @Override
    protected void deductAmount() {
        System.out.println("I am deducting amount from card");
    }

    public static void main(String[] args) {

        FinalMethods temp = new FinalMethods();
        temp.processPayment();

    }


}
