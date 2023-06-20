package estruturalpatterns.adapter;

import estruturalpatterns.adapter.adapters.PayoneerAdapter;
import estruturalpatterns.adapter.payoneer.Payoneer;
import estruturalpatterns.adapter.paypal.IPayPayments;

public class Main {
    public static void main(String[] args) {

        IPayPayments payPayments = new PayoneerAdapter(new Payoneer());
        payPayments.paypalPayment();
        payPayments.paypalReceive();
    }
}
