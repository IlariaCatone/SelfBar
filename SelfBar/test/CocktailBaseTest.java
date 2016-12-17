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
class CocktailBaseTest {
    Product baseCoffee;
    PricingStrategy pricingStrategy;

    @Before
    void setUp() {
        pricingStrategy = new StandardCocktailPricing();
        baseCoffee = new CocktailBase("vodka",pricingStrategy);
    }

    @Test
    void getName() {
        //impossibile da testare l'interfaccia non ha il metodo
    }

    @Test
    void getPrice() {
        double expected = 3.0;
        assertEquals(expected, baseCoffee.getPrice());
    }

    @Test
    void getDescription() {
        String expected = "Cocktail base: vodka";
        assertEquals(expected, baseCoffee.getDescription());
    }

    @Test
    void equals() {
        Product mock = new CocktailBase("vodka",pricingStrategy);
        assertEquals(mock, baseCoffee);
    }

}