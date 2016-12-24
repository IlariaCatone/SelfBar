package test.coffee;

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
import selfbar.Coffee;
import selfbar.Product;
import selfbar.coffeebase.Arabica;
import selfbar.coffeedecorators.Cocoa;

/**
 *
 * @author lores
 */
public class CocoaTest {
    
    public CocoaTest() {
    }
    
    Coffee coffee;
    
    @Before
    public void setUp() {
        coffee = new Cocoa(new Arabica());
    }
    
    @Test
    public void getDescription() {
        assertEquals("Caffe arabica + cacao", coffee.getDescription());
    }
    
    @Test
    public void getPrice() {
        assertEquals(1.5, coffee.getPrice(),0);
    }


    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
