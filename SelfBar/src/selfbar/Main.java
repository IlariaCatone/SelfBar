package selfbar;

/**
 * Created by lores on 11/12/2016.
 */
public class Main {
    public static void main(String[] args) {
        Product p;

        PricingStrategy coffeeStrategy = new StandardCoffeePricing();
        PricingStrategy cocktailStrategy = new StandardCocktailPricing();

        CocktailBase b = new CocktailBase("Gin",cocktailStrategy);

        CocktailDecorator b1 = new CocktailDecorator(b,"Panna");
        CocktailDecorator b2 = new CocktailDecorator(b1,"Ovo");

       // System.out.println(b2.getDescription());

        CoffeeBase c = new CoffeeBase("Arabica",coffeeStrategy);

        CoffeeDecorator c1 = new CoffeeDecorator(c,"Panna");
        CoffeeDecorator c2 = new CoffeeDecorator(c1,"Ovo");

        // System.out.println(c2.getDescription());

        p = b2;
        System.out.println(p.getDescription());
        System.out.println(p.getPrice());


        p = c2;
        System.out.println(p.getDescription());
        System.out.println(p.getPrice());

        //new AppGUI().setVisible(true);

    }
}
