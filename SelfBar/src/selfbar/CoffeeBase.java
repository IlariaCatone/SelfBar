package selfbar;

/**
 * Created by lores on 11/12/2016.
 */
public class CoffeeBase implements Coffee {

    private String name;
    private PricingStrategy pricingStrategy;

    public CoffeeBase(String name,PricingStrategy pricingStrategy){
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
        return "Caffe base: "+name;
    }

    @Override
    public double getAddictionPrice() {
        return pricingStrategy.getAddictionPrice();
    }

    @Override
    public boolean equals(Object object) {
        boolean res = false;
        if (object instanceof CoffeeBase) {
            CoffeeBase coffeeBase = (CoffeeBase) object;
            if ((coffeeBase.getName().equals(this.getName().toLowerCase())) && (coffeeBase.getPrice() == this.getPrice())) {
                res = true;
            }
        }
        return res;
    }
}

