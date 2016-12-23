/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package base;

import selfbar.Cocktail;
import selfbar.PricingStrategy;

/**
 *
 * @author lores
 */
public class Martini implements Cocktail {
    private String name;
    private PricingStrategy pricingStrategy;

    public Martini(PricingStrategy pricingStrategy){
        this.name = "Martini";
        this.pricingStrategy = pricingStrategy;
    }

    private String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return pricingStrategy.getBasePrice();
    }

    @Override
    public String getDescription() {
        return "Cocktail "+name;
    }

    @Override
    public double getAddictionPrice() {
        return pricingStrategy.getAddictionPrice();
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
