package uab.edu.JavaMarket.uab.edu.JavaMarket.good;

import uab.edu.JavaMarket.Consumer;
import uab.edu.JavaMarket.Producer;

public abstract class Good {
    protected Producer[] producers;
    protected Consumer[] consumers;
    protected double value;
    protected double totalMarginalProduction;
    protected double totalIntialProduction;
    protected double baseUtility;
    public Good(double intialValue){
        this.value = intialValue;
    }
    public abstract void calculateUtility();
    //TODO find eq. point between the Supply Curve and Demand Curve
    public void calculateValue(){

    }
    public double getUtility(){
        return this.baseUtility;
    }
    public double getValue(){
        return this.value;
    }
    public void calculateSupplyCurve(){
    }
    //TODO implement demand curve for Consumers and more generally per good
    public void calculateDemandCurve(){

    }

}
