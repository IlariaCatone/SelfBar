import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import selfbar.CocktailBase;
import selfbar.PricingStrategy;
import selfbar.Product;
import selfbar.StandardCocktailPricing;

/**
 * Created by Remei on 13/12/2016.
 */
public class CocktailBaseTest {
    
    Product baseCoffee;
    PricingStrategy pricingStrategy;
    
    public CocktailBaseTest() {
    }

    @Before
    public void setUp() {
        pricingStrategy = new StandardCocktailPricing();
        baseCoffee = new CocktailBase("vodka",pricingStrategy);
    }

    @Test
    public void getPrice() {
        double expected = pricingStrategy.getBasePrice();
        assertEquals(expected, baseCoffee.getPrice(),0);
    }

    @Test
    public void getDescription() {
        String expected = "Cocktail base: vodka";
        assertEquals(expected, baseCoffee.getDescription());
    }

    @Test
    public void equals() {
        Product mock = new CocktailBase("vodka",pricingStrategy);
        assertEquals(mock, baseCoffee);
    }

}