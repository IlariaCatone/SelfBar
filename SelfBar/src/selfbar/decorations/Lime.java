/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selfbar.decorations;

import selfbar.Cocktail;
import selfbar.Coffee;

/**
 *
 * @author lores
 */
public class Lime extends CocktailDecorator{

    public Lime(Cocktail cocktail) {
        super(cocktail,"Lime");
    }
    
    @Override
    public String getDescription() {
        return cocktail.getDescription() + " + "+ decoration;
    }
    
}
