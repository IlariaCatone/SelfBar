package test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import selfbar.Cocktail;
import selfbar.Product;
import selfbar.cocktail.*;
import selfbar.cocktaildecorators.*;
import selfbar.coffeebase.*;
import selfbar.coffeedecorators.*;

public class ProductTest {
    
    public ProductTest() {
    }
    
    Product product;
    
    @Before
    public void setUp() {
        
    }

    @Test
    public void getPriceCoffee() {
        product = new Lime(new Soda(new Martini()));
        assertEquals(4.0, product.getPrice(),0);
    }
    
    @Test
    public void getDescriptionCoffee() {
        product = new Lime(new Soda(new Martini()));
        String expected = "Cocktail martini + soda + lime";
        assertEquals(expected, product.getDescription());
    }
    
    @Test
    public void getPriceCocktail() {
        product = new Cocoa(new Milk(new Arabica()));
        assertEquals(2.0, product.getPrice(),0);
    }
    
    @Test
    public void getDescriptionCocktail() {
        product = new Cocoa(new Milk(new Arabica()));
        String expected = "Caffe arabica + latte + cacao";
        assertEquals(expected, product.getDescription());
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
