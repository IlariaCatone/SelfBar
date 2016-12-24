package test.cocktail;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import selfbar.Cocktail;
import selfbar.Coffee;
import selfbar.Product;
import selfbar.cocktailbase.Martini;
import selfbar.cocktaildecorations.Appetizer;
import selfbar.cocktaildecorations.Soda;
import selfbar.coffeebase.Arabica;
import selfbar.coffeedecorations.Cocoa;
import selfbar.coffeedecorations.Cream;
import selfbar.coffeedecorations.Milk;

/**
 *
 * @author lores
 */
public class AppetizerTest {
    
    public AppetizerTest() {
    }
    
    Cocktail cocktail;
    
    @Before
    public void setUp() {
        cocktail = new Appetizer(new Martini());
    }
    
    @Test
    public void getDescription() {
        assertEquals("Cocktail martini + appetizer", cocktail.getDescription());
    }
    
    @Test
    public void getPrice() {
        assertEquals(3.5, cocktail.getPrice(),0);
    }


    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
