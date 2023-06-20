package estruturalpatterns.adapter.adapters;

import estruturalpatterns.adapter.payoneer.Payoneer;
import estruturalpatterns.adapter.paypal.IPayPayments;
import estruturalpatterns.adapter.utils.Token;

public class PayoneerAdapter implements IPayPayments {
    private Token token;
    private Payoneer payoneer;

    public PayoneerAdapter(Payoneer payoneer) {
        this.payoneer = payoneer;
        System.out.println("Adaptando");
    }

    @Override
    public Token authToken() {
        return new Token();
    }

    @Override
    public void paypalPayment() {
        this.payoneer.sendPayment();
    }

    @Override
    public void paypalReceive() {
        this.payoneer.receivePayment();
    }
}
