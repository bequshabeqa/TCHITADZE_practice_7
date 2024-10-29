package Task_3;

public class PayPalProcessor implements PaymentProcessor {
    @Override
    public void process(double amount) {
        System.out.println("payment is being by PayPal: " + amount);
    }

}
