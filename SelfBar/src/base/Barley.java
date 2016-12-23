/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package base;

import selfbar.AddictionPricingStrategy;
import selfbar.Coffee;
import selfbar.BasePricingStrategy;

/**
 *
 * @author lores
 */
public class Barley implements Coffee{
    
    private String name;
    private BasePricingStrategy basePricingStrategy;
    private AddictionPricingStrategy addictionPricingStrategy;

    public Barley(BasePricingStrategy basePricingStrategy , AddictionPricingStrategy addictionPricingStrategy){
        this.name = "d'orzo";
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
        return "Caffe "+name;
    }

    @Override
    public double getAddictionPrice() {
        return addictionPricingStrategy.getAddictionPrice();
    }

    @Override
    public boolean equals(Object object) {
        boolean res = false;
        if (object instanceof Coffee) {
            Coffee coffee= (Coffee) object;
            if ((coffee.getDescription().equals(this.getName().toLowerCase())) && (coffee.getPrice() == this.getPrice())) {
                res = true;
            }
        }
        return res;
    }
}

