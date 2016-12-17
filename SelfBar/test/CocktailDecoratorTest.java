import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import selfbar.Cocktail;
import selfbar.CocktailBase;
import selfbar.CocktailDecorator;
import selfbar.PricingStrategy;
import selfbar.Product;
import selfbar.StandardCocktailPricing;

/**
 * Created by Remei on 13/12/2016.
 */
class CocktailDecoratorTest {
    Product decoratorCocktail;
    Cocktail baseCocktail = new CocktailBase("vodka",new StandardCocktailPricing());

    @Before
    void setUp() {
        decoratorCocktail = new CocktailDecorator(baseCocktail, "pesca");
    }

    @Test
    void getPrice() {
        double increase = 0.5;
        double exptected = baseCocktail.getPrice() + increase;
        assertEquals(exptected, decoratorCocktail.getPrice());
    }

    @Test
    void getDescription() {
        //TODO da rivedere perchè funziona solo con una
        String decoration = "pesca";
        String expected = baseCocktail.getDescription() + " + " + decoration;
        assertEquals(expected, decoratorCocktail.getDescription());
    }

}