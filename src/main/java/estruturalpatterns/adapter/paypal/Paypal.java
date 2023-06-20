package estruturalpatterns.adapter.paypal;

import estruturalpatterns.adapter.utils.Token;

public class Paypal implements IPayPayments {
    private Token token;

    @Override
    public Token authToken() {
        return new Token();
    }

    @Override
    public void paypalPayment() {
        this.token = authToken();
        System.out.println("Enviando pagamentos com Paypal");
    }

    @Override
    public void paypalReceive() {
        System.out.println("Recebendo pagamentos");
    }
}
