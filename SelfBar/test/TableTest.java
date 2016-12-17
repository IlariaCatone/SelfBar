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
 * Created by Remei on 14/12/2016.
 */
class TableTest {

    Table table;
    PricingStrategy pricingStrategy;

    @Before
    void setUp() {
        table = new Table();
        pricingStrategy = new StandardCoffeePricing();
    }

    @Test
    void addOneProduct() {
        Product mockProduct = new CoffeeBase("arabica",pricingStrategy);
        ArrayList<Product> mockArray = new ArrayList<Product>();
        mockArray.add(mockProduct);
        table.addProduct(mockProduct);
        //assertEquals(mockArray, table.getProducts());
    }

    @Test
    void addMoreProduct() {
        Product mockProduct = new CoffeeBase("miscela",pricingStrategy);
        Product stubProduct = new CoffeeBase("arabica",pricingStrategy);
        ArrayList<Product> mockArray = new ArrayList<Product>();
        mockArray.add(mockProduct);
        mockArray.add(stubProduct);
        table.addProduct(mockProduct);
        table.addProduct(stubProduct);
        //assertEquals(mockArray, table.getProducts());
    }

    @Test
    void addNoProduct() {
        ArrayList<Product> mockArray = new ArrayList<Product>();
        //assertEquals(mockArray, table.getProducts());
    }


    @Test
    void getProducts() {
        ArrayList<Product> mockArray = new ArrayList<Product>();
        //assertEquals(mockArray, table.getProducts());
    }


}