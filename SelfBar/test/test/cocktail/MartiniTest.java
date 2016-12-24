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
import selfbar.Table;
import selfbar.cocktailbase.Martini;
import selfbar.coffeebase.Arabica;

/**
 *
 * @author lores
 */
public class MartiniTest {
    
    public MartiniTest() {
    }
    
    Cocktail cocktail;
    
    @Before
    public void setUp() {
        cocktail = new Martini();
    }
    
    @Test
    public void getDescription() {
        assertEquals("Cocktail martini", cocktail.getDescription());
    }

    @Test
    public void getPrice() {
        assertEquals(3, cocktail.getPrice(),0);
    }

    @Test
    public void getAddictionPrice() {
        assertEquals(0.5, cocktail.getAddictionPrice(),0);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
