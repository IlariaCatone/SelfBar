package selfbar;

/**
 * Created by lores on 17/12/2016.
 */
public class StandardCoffeePricing implements PricingStrategy{

    public StandardCoffeePricing() {
    }
    
    @Override
    public double getBasePrice() {
        return 1.5;
    }

    @Override
    public double getAddictionPrice() {
        return 0.5;
    }
}
