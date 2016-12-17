package selfbar;

/**
 * Created by lores on 11/12/2016.
 */
public class CocktailDecorator implements Cocktail {

    private String decoration;
    private Product cocktail;

    public CocktailDecorator(Cocktail cocktail,String decoration) {
        this.cocktail = cocktail;
        this.decoration = decoration;
    }

    @Override
    public double getPrice() {
        return getAddictionPrice() + cocktail.getPrice();
    }

    @Override
    public String getDescription() {
        return cocktail.getDescription() + " + "+ decoration;
    }

    @Override
    public double getAddictionPrice() {
        return cocktail.getAddictionPrice();
    }


}
