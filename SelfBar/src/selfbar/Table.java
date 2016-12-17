package selfbar;

import java.util.ArrayList;

/**
 * Created by lores on 12/12/2016.
 */
public class Table implements Observable{

    private ArrayList<Product> products;
    private ArrayList<Observer> observers;

    public Table() {
        this.products = new ArrayList<>();
        this.observers = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void remObserver(Observer o) {
        observers.remove(o);
    }

    public void addProduct(Product product) {
        products.add(product);
        notifyAdd(product);
    }

    public void removeProduct(Product product) {
        products.add(product);
        notifyRemove(product);
    }

    private void notifyAdd(Product product) {
        for (Observer o : observers) {
            o.updateAdd(product);
        }
    }

    private void notifyRemove(Product product) {
        for (Observer o : observers) {
            o.updateRemove(product);
        }
    }
}
