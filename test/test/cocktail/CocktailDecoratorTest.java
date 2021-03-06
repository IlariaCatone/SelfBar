package test.cocktail;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import selfbar.Cocktail;
import selfbar.cocktail.Martini;
import selfbar.cocktaildecorators.Appetizer;
import selfbar.cocktaildecorators.Lime;
import selfbar.cocktaildecorators.Soda;

public class CocktailDecoratorTest {
    
    Cocktail cocktail;

    public CocktailDecoratorTest() {
    }
    
    @Before
    public void setUp() {
        cocktail = new Appetizer(new Lime(new Soda(new Martini())));
    }

    @Test
    public void getPrice() {
        assertEquals(4.5, cocktail.getPrice(),0);
    }
    
    @Test
    public void getDescription() {
        String expected = "Cocktail martini + soda + lime + appetizer";
        assertEquals(expected, cocktail.getDescription());
    }
}