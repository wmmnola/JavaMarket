package uab.edu.JavaMarket.uab.edu.JavaMarket.good;

import uab.edu.JavaMarket.Consumer;
import uab.edu.JavaMarket.Producer;

public abstract class Good {
    protected Producer[] producers;
    protected Consumer[] consumers;
    protected double totalMarginalProduction;
    protected double totalIntialProduction;
    protected double baseUtility;
    public Good(Producer[] producers, Consumer[] consumers){
        this.producers = producers;
        this.consumers = consumers;

    }
    public abstract void calculateUtility();
    //TODO find eq. point between the Supply Curve and Demand Curve
    public void calculateValue(){

    }
    public double getUtility(){
        return this.baseUtility;
    }
    public void calculateSupplyCurve(){
        for(Producer p : producers) {
            totalMarginalProduction += p.getMarginalProduction();
            totalIntialProduction += p.getIntialProduction();
        }
    }
    //TODO implement demand curve for Consumers and more generally per good
    public void calculateDemandCurve(){

    }

}
