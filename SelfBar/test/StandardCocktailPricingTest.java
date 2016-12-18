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
import selfbar.PricingStrategy;
import selfbar.StandardCocktailPricing;

/**
 *
 * @author lores
 */
public class StandardCocktailPricingTest {
    
    PricingStrategy pricingStrategy;
    
    public StandardCocktailPricingTest() {
    }
    
    @Before
    public void setUp() {
        pricingStrategy = new StandardCocktailPricing();
    }
    
    @Test
    public void testBase() {
        double expected = 3.0;
        assertEquals(expected, pricingStrategy.getBasePrice(),0);
    }
 
    @Test
    public void testAddiction() {
        double expected = 0.5;
        assertEquals(expected, pricingStrategy.getAddictionPrice(),0);
    }
    
}
