import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import selfbar.Cocktail;
import selfbar.CocktailBase;
import selfbar.CocktailDecorator;
import selfbar.Product;
import selfbar.StandardCocktailPricing;
import selfbar.BasePricingStrategy;

/**
 * Created by Remei on 13/12/2016.
 */
public class CocktailDecoratorTest {
    Product decoratorCocktail;
    BasePricingStrategy pricingStrategy;
    Cocktail baseCocktail;

    public CocktailDecoratorTest() {
    }
    
    @Before
    public void setUp() {
        pricingStrategy = new StandardCocktailPricing();
        baseCocktail = new CocktailBase("vodka",pricingStrategy);
        decoratorCocktail = new CocktailDecorator(baseCocktail, "pesca");
    }

    @Test
    public void getPrice() {
        double increase = pricingStrategy.getAddictionPrice();
        double exptected = baseCocktail.getPrice() + increase;
        assertEquals(exptected, decoratorCocktail.getPrice(),0);
    }


    @Test
    public void getDescription() {
        String decoration = "pesca";
        String expected = baseCocktail.getDescription() + " + " + decoration;
        assertEquals(expected, decoratorCocktail.getDescription());
    }

}