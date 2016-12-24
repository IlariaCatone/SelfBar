package selfbar.coffeedecorators;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import selfbar.CoffeeDecorator;
import selfbar.Coffee;

/**
 *
 * @author lores
 */
public class Cream extends CoffeeDecorator{

    public Cream(Coffee coffee) {
        super(coffee,"panna");
    }
    
    @Override
    public String getDescription() {
        return coffee.getDescription() + " + "+ decoration;
    }
    
}
