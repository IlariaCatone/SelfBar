package selfbar;

/**
 * Created by lores on 11/12/2016.
 */
public class CocktailBase implements Cocktail {

    private String name;
    private PricingStrategy pricingStrategy;

    public CocktailBase(String name,PricingStrategy pricingStrategy){
        this.name = name;
        this.pricingStrategy = pricingStrategy;
    }

    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return pricingStrategy.getBasePrice();
    }

    @Override
    public String getDescription() {
        return "Cocktail base: "+name;
    }

    @Override
    public double getAddictionPrice() {
        return pricingStrategy.getAddictionPrice();
    }

    @Override
    public boolean equals(Object object) {
        boolean res = false;
        if (object instanceof CocktailBase) {
            CocktailBase cocktailBase = (CocktailBase) object;
            if ((cocktailBase.getName().equals(this.getName().toLowerCase())) && (cocktailBase.getPrice() == this.getPrice())) {
                res = true;
            }
        }
        return res;
    }
}
