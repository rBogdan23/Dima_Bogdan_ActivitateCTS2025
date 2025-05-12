package adapter2.classes;

public interface PaymentProcessor {
    void pay(String customer, double amount);
}