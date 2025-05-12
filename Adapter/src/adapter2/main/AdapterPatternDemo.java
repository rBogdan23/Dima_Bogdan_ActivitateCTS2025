package adapter2.main;

import adapter2.classes.OnlineStore;
import adapter2.classes.PayPalAdapter;
import adapter2.classes.PaymentProcessor;

public class AdapterPatternDemo {
    public static void main(String[] args) {
        PaymentProcessor adapter = new PayPalAdapter();
        OnlineStore store = new OnlineStore(adapter);

        store.checkout("client@email.com", 99.99);
    }
}