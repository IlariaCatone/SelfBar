package selfbar;

import selfbar.Cocktail;

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
    
    @Override
    public String toString(){
        return getDescription();
    }


}
