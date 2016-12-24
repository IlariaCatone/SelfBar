package selfbar.cocktaildecorators;


import selfbar.CocktailDecorator;
import selfbar.Cocktail;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author lores
 */
public class Soda extends CocktailDecorator{

    public Soda(Cocktail cocktail) {
        super(cocktail,"soda");
    }
    
    @Override
    public String getDescription() {
        return cocktail.getDescription() + " + "+ decoration;
    }
    
}