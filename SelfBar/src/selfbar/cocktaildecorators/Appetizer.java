package selfbar.cocktaildecorators;

import selfbar.CocktailDecorator;
import selfbar.Cocktail;

public class Appetizer extends CocktailDecorator{

    public Appetizer(Cocktail cocktail) {
        super(cocktail,"appetizer");
    }
    
    @Override
    public String getDescription() {
        return cocktail.getDescription() + " + "+ decoration;
    }
   
    
}
