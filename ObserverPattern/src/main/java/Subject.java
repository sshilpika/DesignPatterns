/**
 * Created by Shilpika on 3/2/2015.
 */
public interface Subject {
    public void register(Observer o);
    public void unregister(Observer o);
    public void notifyObservers();
}
