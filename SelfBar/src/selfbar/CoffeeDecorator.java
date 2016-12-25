package selfbar;



/**
 * Created by lores on 11/12/2016.
 */

public abstract class CoffeeDecorator implements Coffee{

    protected Coffee coffee;
    protected String decoration;

    public CoffeeDecorator(Coffee coffee, String decoration) {
        this.coffee = coffee;
        this.decoration = decoration;
    }

    @Override
    public double getPrice() {
        return getAddictionPrice() + coffee.getPrice();
    }

    @Override
    public abstract String getDescription();

    @Override
    public double getAddictionPrice() {
        return coffee.getAddictionPrice();
    }
    
    @Override
    public String toString(){
        return getDescription();
    }
    
}
