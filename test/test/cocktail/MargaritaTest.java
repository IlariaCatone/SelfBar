package test.cocktail;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import selfbar.Cocktail;
import selfbar.Coffee;
import selfbar.Product;
import selfbar.Table;
import selfbar.cocktail.Margarita;
import selfbar.coffeebase.Arabica;

public class MargaritaTest {
    
    public MargaritaTest() {
    }
    
    Cocktail cocktail;
    
    @Before
    public void setUp() {
        cocktail = new Margarita();
    }
    
    @Test
    public void getDescription() {
        assertEquals("Cocktail margarita", cocktail.getDescription());
    }

    @Test
    public void getPrice() {
        assertEquals(3, cocktail.getPrice(),0);
    }

    @Test
    public void getAddictionPrice() {
        assertEquals(0.5, cocktail.getAddictionPrice(),0);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
