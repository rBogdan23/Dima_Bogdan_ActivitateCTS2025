package adapter2.classes;

public class OnlineStore {
    private PaymentProcessor paymentProcessor;

    public OnlineStore(PaymentProcessor paymentProcessor) {
        this.paymentProcessor = paymentProcessor;
    }

    public void checkout(String customerEmail, double amount) {
        System.out.println("Processing payment...");
        paymentProcessor.pay(customerEmail, amount);
    }
}