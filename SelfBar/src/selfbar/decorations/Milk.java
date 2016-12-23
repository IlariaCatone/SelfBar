/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selfbar.decorations;

import selfbar.Coffee;

/**
 *
 * @author lores
 */
public class Milk extends CoffeeDecorator{

    public Milk(Coffee coffee) {
        super(coffee,"Latte");
    }
    
    @Override
    public String getDescription() {
        return coffee.getDescription() + " + "+ decoration;
    }
    
}
