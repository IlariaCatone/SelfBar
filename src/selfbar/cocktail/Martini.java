package selfbar.cocktail;

import selfbar.Cocktail;

public class Martini implements Cocktail {
    private String name;

    public Martini(){
        this.name = "martini";
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
            if ((cocktail.getDescription().equals(this.getDescription())) && (cocktail.getPrice() == this.getPrice())) {
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
