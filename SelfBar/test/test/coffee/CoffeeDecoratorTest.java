package test.coffee;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import selfbar.Coffee;
import selfbar.CoffeeDecorator;
import selfbar.Product;
import selfbar.coffeebase.Arabica;
import selfbar.coffeedecorations.Cocoa;
import selfbar.coffeedecorations.Cream;
import selfbar.coffeedecorations.Milk;


/**
 * Created by Remei on 13/12/2016.
 */
public class CoffeeDecoratorTest {
    
    Coffee coffee;

    public CoffeeDecoratorTest() {
    }
    
    @Before
    public void setUp() {
        coffee = new Cream(new Cocoa(new Milk(new Arabica())));
    }

    @Test
    public void getPrice() {
        assertEquals(2.5, coffee.getPrice(),0);
    }
    
    @Test
    public void getDescription() {
        String expected = "Caffe arabica + latte + cacao + panna";
        assertEquals(expected, coffee.getDescription());
    }
}