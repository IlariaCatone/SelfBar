package selfbar.payment;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lores
 */
public class CashPayment implements PaymentStrategy{
    @Override
    public String getPaymentMethod() {
        return "Pagamento effettuato tramite contanti";
    }
}