package uab.edu.JavaMarket;

public abstract class Good {
    private Producer[] producers;
    private Consumer[] consumers;
    private double totalMarginalProduction;
    private double totalIntialProduction;
    public Good(Producer[] producers, Consumer[] consumers){
        this.producers = producers;
        this.consumers = consumers;

    }
    public void calculateValue(){

    }
    public void calculateSupplyCurve(){
        for(Producer p : producers) {
            totalMarginalProduction += p.getMarginalProduction();
            totalIntialProduction += p.getIntialProduction();
        }
    }
    public void calculateDemandCurve(){

    }

}
