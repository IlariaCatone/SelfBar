package test;

import selfbar.coffeebase.Barley;
import selfbar.coffeebase.Arabica;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import selfbar.Product;
import selfbar.Table;
import selfbar.coffeebase.*;

public class TableTest {

    Table table;

    public TableTest() {
    }

    @Before
    public void setUp() {
        table = new Table();
    }

    @Test
    public void addOneProduct() {
        Product mockProduct = new Arabica();
        ArrayList<Product> mockArray = new ArrayList<Product>();
        mockArray.add(mockProduct);
        table.addProduct(mockProduct);
        assertEquals(mockArray, table.getProducts());
    }

    @Test
    public void addMoreProduct() {
        Product mockProduct = new Arabica();
        Product stubProduct = new Barley();
        ArrayList<Product> mockArray = new ArrayList<Product>();
        mockArray.add(mockProduct);
        mockArray.add(stubProduct);
        table.addProduct(mockProduct);
        table.addProduct(stubProduct);
        assertEquals(mockArray, table.getProducts());
    }

    @Test
    public void addNoProduct() {
        ArrayList<Product> mockArray = new ArrayList<Product>();
        assertEquals(mockArray, table.getProducts());
    }

    
}