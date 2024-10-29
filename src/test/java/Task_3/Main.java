package Task_3;

public class Main {
    public static void main(String[] args) {
        PaymentProcessor creditCardProcessor = new CreditCardProcessor();
        PaymentProcessor payPalProcessor = new PayPalProcessor();


        System.out.println("Payment: ");
        PaymentService.executePayment(creditCardProcessor, 45.36);
        PaymentService.executePayment(payPalProcessor, 12.85);


        System.out.println("Payment with polymorphism: ");
        executeCreditPayment(creditCardProcessor);
        executePayPalPayment(payPalProcessor);
    }

    private static void executePayPalPayment(PaymentProcessor paymentProcessor) {
        paymentProcessor.process(45.47);
    }

    private static void executeCreditPayment(PaymentProcessor creditCardProcessor) {
        creditCardProcessor.process(45.22);
    }
}
