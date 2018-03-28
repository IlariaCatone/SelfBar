package selfbar.coffeebase;

import selfbar.Coffee;

public class Decaffeinato implements Coffee{
    
    private String name;

    public Decaffeinato(){
        this.name = "decaffeinato";
    }

    @Override
    public double getPrice() {
        return 1;
    }

    @Override
    public String getDescription() {
        return "Caffe "+name;
    }

    @Override
    public double getAddictionPrice() {
        return 0.5;
    }

    @Override
    public boolean equals(Object object) {
        boolean res = false;
        if (object instanceof Coffee) {
            Coffee coffee= (Coffee) object;
            if ((coffee.getDescription().equals(this.getDescription())) && (coffee.getPrice() == this.getPrice())) {
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

