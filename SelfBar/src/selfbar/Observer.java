package selfbar;

/**
 * Created by lores on 11/12/2016.
 */
public interface Observer {
    public void updateAdd(Product product);
    public void updateRemove(Product product);
}
