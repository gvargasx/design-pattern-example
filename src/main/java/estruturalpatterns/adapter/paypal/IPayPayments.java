package estruturalpatterns.adapter.paypal;

import estruturalpatterns.adapter.utils.Token;

public interface IPayPayments {

    Token authToken();

    void paypalPayment();

    void paypalReceive();

}
