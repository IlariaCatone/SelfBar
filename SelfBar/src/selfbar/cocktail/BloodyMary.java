package selfbar.cocktail;


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
public class BloodyMary implements Cocktail {
    private String name;
   
    public BloodyMary(){
        this.name = "bloody mary";
    }

    private String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return 3;
    }

    @Override
    public String getDescription() {
        return "Cocktail "+name;
    }

    @Override
    public double getAddictionPrice() {
        return 0.5;
    }

    @Override
    public boolean equals(Object object) {
        boolean res = false;
        if (object instanceof Cocktail) {
            Cocktail cocktail = (Cocktail) object;
            if ((cocktail.getDescription().equals(this.getName().toLowerCase())) && (cocktail.getPrice() == this.getPrice())) {
                res = true;
            }
        }
        return res;
    }
    
    @Override
    public String toString(){
        return getDescription();
    }
}
