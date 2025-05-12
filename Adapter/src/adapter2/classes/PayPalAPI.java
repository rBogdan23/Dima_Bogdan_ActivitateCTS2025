package adapter2.classes;

public class PayPalAPI {
    public void sendPayment(String userEmail, double value) {
        System.out.println("PayPal: Paid " + value + " EUR from " + userEmail);
    }
}