package test.coffee;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import selfbar.Coffee;
import selfbar.Product;
import selfbar.Table;
import selfbar.coffeebase.Arabica;

public class ArabicaTest {
    
    public ArabicaTest() {
    }
    
    Coffee coffee;
    
    @Before
    public void setUp() {
        coffee = new Arabica();
    }
    
    @Test
    public void getDescription() {
        assertEquals("Caffe arabica",coffee.getDescription());
    }

    @Test
    public void getPrice() {
        assertEquals(1, coffee.getPrice(),0);
    }

    @Test
    public void getAddictionPrice() {
        assertEquals(0.5, coffee.getAddictionPrice(),0);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
