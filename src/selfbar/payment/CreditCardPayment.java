package selfbar.payment;

public class CreditCardPayment implements PaymentStrategy{
    @Override
    public String pay() {
        return "Pagamento effettuato tramite carta di credito";
    }
}
