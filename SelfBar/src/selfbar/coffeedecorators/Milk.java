package selfbar.coffeedecorators;


import selfbar.CoffeeDecorator;
import selfbar.Coffee;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author lores
 */
public class Milk extends CoffeeDecorator{

    public Milk(Coffee coffee) {
        super(coffee,"latte");
    }
    
    @Override
    public String getDescription() {
        return coffee.getDescription() + " + "+ decoration;
    }
    
}
