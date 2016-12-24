package selfbar;

import selfbar.Cocktail;

/**
 * Created by lores on 11/12/2016.
 */
public abstract class CocktailDecorator implements Cocktail {

    protected String decoration;
    protected Cocktail cocktail;

    public CocktailDecorator(Cocktail cocktail,String decoration) {
        this.cocktail = cocktail;
        this.decoration = decoration;
    }

    @Override
    public double getPrice() {
        return getAddictionPrice() + cocktail.getPrice();
    }

    @Override
    public abstract String getDescription();
    
    @Override
    public double getAddictionPrice() {
        return cocktail.getAddictionPrice();
    }


}
