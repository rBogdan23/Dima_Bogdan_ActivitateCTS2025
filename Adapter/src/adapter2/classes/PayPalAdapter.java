package adapter2.classes;

public class PayPalAdapter implements PaymentProcessor {
    private PayPalAPI payPalAPI;

    public PayPalAdapter() {
        this.payPalAPI = new PayPalAPI();
    }

    public void pay(String customer, double amount) {
        // adaptăm metoda la ce așteaptă clientul
        payPalAPI.sendPayment(customer, amount);
    }
}