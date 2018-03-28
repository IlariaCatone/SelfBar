package selfbar.payment;

public class BancomatPayment implements PaymentStrategy{
    @Override
    public String pay() {
        return "Pagamento effettuato tramite bancomat";
    }
}