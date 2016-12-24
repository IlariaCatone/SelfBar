package test.payment;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import selfbar.payment.BancomatPayment;
import selfbar.payment.CashPayment;
import selfbar.payment.PaymentStrategy;

/**
 *
 * @author lores
 */
public class CashTest {
    
    public CashTest() {
    }
    
    PaymentStrategy paymentStrategy;
    
    @Before
    public void setUp() {
        paymentStrategy = new CashPayment();
    }
    
    @Test
    public void getPaymentMethod() {
        String expected = "Pagamento effettuato tramite contanti";
        assertEquals(expected, paymentStrategy.getPaymentMethod());
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
