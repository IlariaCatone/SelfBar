/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payment;

/**
 *
 * @author lores
 */
public class CreditCardPayment implements PaymentStrategy{
    @Override
    public String getPaymentMethod() {
        return "Pagamento effettuato tramite carta di credito";
    }
}
