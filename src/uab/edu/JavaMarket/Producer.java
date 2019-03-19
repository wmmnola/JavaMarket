package uab.edu.JavaMarket;
import uab.edu.JavaMarket.uab.edu.JavaMarket.good.Good;

public class Producer {
    private double marginalProduction;
    private double intialProduction;
    protected Good good;
    public Producer(double initialProduction, Good g){
        this.intialProduction = initialProduction;
        this.good = g;
    }
    public double getIntialProduction(){
        return intialProduction;
    }
    public void calculateSellPrice(){

    }
}
