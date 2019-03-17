package uab.edu.JavaMarket.uab.edu.JavaMarket.good;
import java.util.Random;
import uab.edu.JavaMarket.Consumer;
import uab.edu.JavaMarket.Producer;

public class BaseGood extends Good {
    public BaseGood(Producer[] producers, Consumer[] consumers){
        super(producers, consumers);
    }

    public void calculateUtility(){
        Random r = new Random();
        //Assigns the base utility to a uniform random double on [1,5]
        this.baseUtility = 4 * r.nextDouble() + 1;
    }


}
