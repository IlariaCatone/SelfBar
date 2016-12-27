package selfbar.cocktaildecorators;


import selfbar.CocktailDecorator;
import selfbar.Cocktail;

public class Soda extends CocktailDecorator{

    public Soda(Cocktail cocktail) {
        super(cocktail,"soda");
    }
    
    @Override
    public String getDescription() {
        return cocktail.getDescription() + " + "+ decoration;
    }
    
}
