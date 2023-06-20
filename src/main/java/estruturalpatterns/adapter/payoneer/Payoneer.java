package estruturalpatterns.adapter.payoneer;

import estruturalpatterns.adapter.utils.Token;

public class Payoneer implements IPayoneerPayments {

    @Override
    public Token authToken() {
        return new Token();
    }

    @Override
    public void sendPayment() {
        System.out.println("Enviando");
    }

    @Override
    public void receivePayment() {
        System.out.println("Recebendo");
    }
}
