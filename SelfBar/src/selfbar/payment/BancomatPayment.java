/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selfbar.payment;

/**
 *
 * @author lores
 */
public class BancomatPayment implements PaymentStrategy{
    @Override
    public String getPaymentMethod() {
        return "Pagamento effettuato tramite bancomat";
    }
}