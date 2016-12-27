package selfbar.cocktaildecorators;

import selfbar.CocktailDecorator;
import selfbar.Cocktail;

public class Lime extends CocktailDecorator{

    public Lime(Cocktail cocktail) {
        super(cocktail,"lime");
    }
    
    @Override
    public String getDescription() {
        return cocktail.getDescription() + " + "+ decoration;
    }
    
}
