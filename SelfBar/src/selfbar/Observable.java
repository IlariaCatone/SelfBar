package selfbar;

/**
 * Created by lores on 11/12/2016.
 */
public interface Observable {
    public void addObserver(Observer o);
    public void remObserver(Observer o);

}
