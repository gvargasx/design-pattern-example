package estruturalpatterns.adapter.payoneer;

import estruturalpatterns.adapter.utils.Token;

public interface IPayoneerPayments {

    Token authToken();

    void sendPayment();

    void receivePayment();
}
