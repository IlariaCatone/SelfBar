package selfbar;

/**
 * Created by lores on 17/12/2016.
 */
public class StandardCocktailPricing implements PricingStrategy{
    @Override
    public double getBasePrice() {
        return 3;
    }

    @Override
    public double getAddictionPrice() {
        return 0.5;
    }
}
