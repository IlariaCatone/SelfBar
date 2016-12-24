import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import selfbar.CocktailBase;
import selfbar.CoffeeBase;
import selfbar.PricingStrategy;
import selfbar.Product;
import selfbar.StandardCocktailPricing;
import selfbar.StandardCoffeePricing;

/**
 * Created by Remei on 14/12/2016.
 */
public class CoffeeBaseTest {
    Product coffeeBase;
    PricingStrategy pricingStrategy;

    public CoffeeBaseTest() {
    }

    @Before
    public void setUp() {
        pricingStrategy = new StandardCoffeePricing();
        coffeeBase = new CoffeeBase("arabica",pricingStrategy);
    }

    @Test
    public void getPrice() {
        double expected = pricingStrategy.getBasePrice();
        assertEquals(expected, coffeeBase.getPrice(),0);
    }

    @Test
    public void getDescription() {
        String expected = "Caffe base: arabica";
        assertEquals(expected, coffeeBase.getDescription());
    }

    @Test
    public void equals() {
        Product mock = new CoffeeBase("arabica",pricingStrategy);
        assertEquals(mock, coffeeBase);
    }

}