package Task_3;

public class PaymentService {
    static void executePayment(PaymentProcessor paymentProcessor, double amount) {
        paymentProcessor.process(amount);
    }
}
