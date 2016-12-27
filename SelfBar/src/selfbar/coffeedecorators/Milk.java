package selfbar.coffeedecorators;

import selfbar.CoffeeDecorator;
import selfbar.Coffee;

public class Milk extends CoffeeDecorator{

    public Milk(Coffee coffee) {
        super(coffee,"latte");
    }
    
    @Override
    public String getDescription() {
        return coffee.getDescription() + " + "+ decoration;
    }
    
}
