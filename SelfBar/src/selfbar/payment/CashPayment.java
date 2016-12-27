package selfbar.payment;

public class CashPayment implements PaymentStrategy{
    @Override
    public String pay() {
        return "Pagamento effettuato tramite contanti";
    }
}