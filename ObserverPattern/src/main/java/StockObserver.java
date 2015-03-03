/**
 * Created by Shilpika on 3/2/2015.
 */
public class StockObserver implements Observer {

    private double ibmPrice;
    private double applPrice;
    private double googPrice;

    private int observerID;

    private Subject stockGrabber;

    private static int observerIDTracker = 0;

    public StockObserver(Subject stockGrabber){

        this.stockGrabber = stockGrabber;

        observerID = ++observerIDTracker;
        System.out.println("New Observer " + this.observerID);

        stockGrabber.register(this);

    }
    @Override
    public void update(double ibmPriceNew, double applPriceNew, double googPriceNew) {
        ibmPrice = ibmPriceNew;
        applPrice = applPriceNew;
        googPrice = googPriceNew;
        printPrices();
    }
    public void printPrices(){
        System.out.println(observerID + "\nIBM: " + ibmPrice + "\nAAPL: " + applPrice + "\nGOOG: " + googPrice + "\n");

    }
}
