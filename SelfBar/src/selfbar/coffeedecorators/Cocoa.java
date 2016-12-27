package selfbar.coffeedecorators;

import selfbar.CoffeeDecorator;
import selfbar.Coffee;


public class Cocoa extends CoffeeDecorator{

    public Cocoa(Coffee coffee) {
        super(coffee,"cacao");
    }
    
    @Override
    public String getDescription() {
        return coffee.getDescription() + " + "+ decoration;
    }
    
}
