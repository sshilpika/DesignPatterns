/**
 * Created by Shilpika on 3/2/2015.
 */
public class GrabStocks {
    public static void main(String args[]){
        StockGrabber sg = new StockGrabber();
        Observer o1 = new StockObserver(sg);
        sg.setIBMPrice(197.0);
        sg.setAPPLPrice(122.0);
        sg.setGOOGPrice(100.11);

        StockObserver observer2 = new StockObserver(sg);

        sg.setIBMPrice(197.0);
        sg.setAPPLPrice(122.0);
        sg.setGOOGPrice(100.11);

        sg.unregister(observer2);

        sg.setIBMPrice(196.0);
        sg.setAPPLPrice(121.0);
        sg.setGOOGPrice(101.11);

    }
}
