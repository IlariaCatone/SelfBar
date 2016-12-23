/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package base;

import selfbar.AddictionPricingStrategy;
import selfbar.Cocktail;
import selfbar.BasePricingStrategy;

/**
 *
 * @author lores
 */
public class Margarita implements Cocktail {
    private String name;
    private BasePricingStrategy basePricingStrategy;
    private AddictionPricingStrategy addictionPricingStrategy;

    public Margarita(BasePricingStrategy basePricingStrategy , AddictionPricingStrategy addictionPricingStrategy){
        this.name = "margarita";
        this.basePricingStrategy = basePricingStrategy;
        this.addictionPricingStrategy = addictionPricingStrategy;
    }

    private String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return basePricingStrategy.getBasePrice();
    }

    @Override
    public String getDescription() {
        return "Cocktail "+name;
    }

    @Override
    public double getAddictionPrice() {
        return addictionPricingStrategy.getAddictionPrice();
    }

    @Override
    public boolean equals(Object object) {
        boolean res = false;
        if (object instanceof Cocktail) {
            Cocktail cocktail = (Cocktail) object;
            if ((cocktail.getDescription().equals(this.getName().toLowerCase())) && (cocktail.getPrice() == this.getPrice())) {
                res = true;
            }
        }
        return res;
    }
}
