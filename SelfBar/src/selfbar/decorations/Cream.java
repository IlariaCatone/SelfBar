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
public class Cream extends CoffeeDecorator{

    public Cream(Coffee coffee) {
        super(coffee,"Panna");
    }
    
    @Override
    public String getDescription() {
        return coffee.getDescription() + " + "+ decoration;
    }
    
}
