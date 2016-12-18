import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import selfbar.Coffee;
import selfbar.CoffeeBase;
import selfbar.CoffeeDecorator;
import selfbar.PricingStrategy;
import selfbar.Product;
import selfbar.StandardCoffeePricing;


/**
 * Created by Remei on 13/12/2016.
 */
public class CoffeeDecoratorTest {
    Product decoratorCocktail;
    PricingStrategy pricingStrategy;
    Coffee baseCoffee;

    public CoffeeDecoratorTest() {
    }
    
    @Before
    public void setUp() {
        pricingStrategy = new StandardCoffeePricing();
        baseCoffee = new CoffeeBase("arabica",pricingStrategy);
        decoratorCocktail = new CoffeeDecorator(baseCoffee, "panna");
    }

    @Test
    public void getPrice() {
        double increase = pricingStrategy.getAddictionPrice();
        double exptected = baseCoffee.getPrice() + increase;
        assertEquals(exptected, decoratorCocktail.getPrice(),0);
    }
    
    @Test
    public void getDescription() {
        String decoration = "panna";
        String expected = baseCoffee.getDescription() + " + " + decoration;
        assertEquals(expected, decoratorCocktail.getDescription());
    }

}