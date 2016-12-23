import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import selfbar.CocktailBase;
import selfbar.CoffeeBase;
import selfbar.PricingStrategy;
import selfbar.Product;
import selfbar.StandardCocktailPricing;
import selfbar.StandardCoffeePricing;
import selfbar.Table;

/**
 * Created by Remeic on 14/12/2016.
 */
public class TableTest {

    Table table;
    PricingStrategy pricingStrategy;

    public TableTest() {
    }

    @Before
    public void setUp() {
        table = new Table();
        pricingStrategy = new StandardCoffeePricing();
    }

    @Test
    public void addOneProduct() {
        Product mockProduct = new CoffeeBase("arabica",pricingStrategy);
        ArrayList<Product> mockArray = new ArrayList<Product>();
        mockArray.add(mockProduct);
        table.addProduct(mockProduct);
        assertEquals(mockArray, table.getProducts());
    }

    @Test
    public void addMoreProduct() {
        Product mockProduct = new CoffeeBase("miscela",pricingStrategy);
        Product stubProduct = new CoffeeBase("arabica",pricingStrategy);
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

    @Test
    public void getProducts() {
        ArrayList<Product> mockArray = new ArrayList<Product>();
        assertEquals(mockArray, table.getProducts());
    }


}