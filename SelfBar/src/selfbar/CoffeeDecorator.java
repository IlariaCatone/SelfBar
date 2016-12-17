package selfbar;

/**
 * Created by lores on 11/12/2016.
 */

public class CoffeeDecorator implements Coffee{

    private String decoration;
    private Coffee coffee;

    public CoffeeDecorator(Coffee coffee,String decoration) {
        this.coffee = coffee;
        this.decoration = decoration;
    }

    @Override
    public double getPrice() {
        return getAddictionPrice() + coffee.getPrice();
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + " + "+ decoration;
    }

    @Override
    public double getAddictionPrice() {
        return coffee.getAddictionPrice();
    }


}
