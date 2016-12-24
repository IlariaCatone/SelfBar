/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selfbar.coffeebase;

import selfbar.Coffee;

/**
 *
 * @author lores
 */
public class Arabica implements Coffee{
    
    private String name;
    
    public Arabica(){
        this.name = "arabica";
    }

    private String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return 1;
    }

    @Override
    public String getDescription() {
        return "Caffe "+name;
    }

    @Override
    public double getAddictionPrice() {
        return 0.5;
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
