package selfbar;

import java.util.ArrayList;
import selfbar.payment.PaymentStrategy;

/**
 * Created by lores on 12/12/2016.
 */
public class Table implements Observable {

    private ArrayList<Product> products;
    private ArrayList<Observer> observers;
    private PaymentStrategy paymentStrategy;

    public Table() {
        this.products = new ArrayList<>();
        this.observers = new ArrayList<>();
    }

    public ArrayList<Product> getProducts() {
        return products;
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
        System.out.println("size prima:   "+this.products.size());
        products.remove(product);
        System.out.println("prodotto "+product.getDescription()
                + "size dopo:   "+this.products.size());
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

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public String pay() {
        if (paymentStrategy != null){
            return paymentStrategy.pay();
        }
        return "";
    }
}
