package uab.edu.JavaMarket;

import java.util.Random;
import uab.edu.JavaMarket.uab.edu.JavaMarket.good.Good;
import java.util.Map;

public class Consumer {
    private Good good;
    private double money;
    private int capacity;
    private int filledCapacity;
    private Map<Good, Double> marginalUtility;
    private Map<Good, Double> quantityDemanded;
    //TODO create linear program to determine how much of each kind of good a consumer buys
    public Consumer(double money, int capacity){
        this.money = money;
    }
    public void calculateMarginalUtility(Good g){
        Random r = new Random();
        //Generates uniform random double on [-1,1]
        double offset = 2*r.nextDouble()-1;
        double baseUtil = g.getUtility();
        marginalUtility.put(g, baseUtil+offset);
    }

}
