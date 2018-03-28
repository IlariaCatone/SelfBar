package selfbar.coffeedecorators;

import selfbar.CoffeeDecorator;
import selfbar.Coffee;

public class Cream extends CoffeeDecorator{

    public Cream(Coffee coffee) {
        super(coffee,"panna");
    }
    
    @Override
    public String getDescription() {
        return coffee.getDescription() + " + "+ decoration;
    }
    
}
