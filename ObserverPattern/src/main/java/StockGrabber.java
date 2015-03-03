import java.util.ArrayList;

/**
 * Created by Shilpika on 3/2/2015.
 */
public class StockGrabber implements Subject {
    ArrayList<Observer> observers;
    private double ibmPrice;
    private double applPrice;
    private double googPrice;

    public StockGrabber(){
        observers = new ArrayList<Observer>();
    }
    @Override
    public void register(Observer newObserver) {
        observers.add(newObserver);
    }

    @Override
    public void unregister(Observer deleteObserver) {
        int observerIndex = observers.indexOf(deleteObserver);
        System.out.println("Observer "+(observerIndex+1) +" deleted");
        observers.remove(observerIndex);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer: observers){
            observer.update(ibmPrice,applPrice,googPrice);
        }
    }
    public void setIBMPrice(double newIBMPrice){
        ibmPrice = newIBMPrice;
        notifyObservers();
    }
    public void setAPPLPrice(double newAPPLPrice){
        applPrice = newAPPLPrice;
        notifyObservers();
    }
    public void setGOOGPrice(double newGOOGPrice){
        googPrice = newGOOGPrice;
        notifyObservers();
    }


}
