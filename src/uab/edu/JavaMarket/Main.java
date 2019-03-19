package uab.edu.JavaMarket;

import uab.edu.JavaMarket.uab.edu.JavaMarket.good.BaseGood;

public class Main {

    public static void main(String[] args) {
        BaseGood g1 = new BaseGood(10);
        BaseGood g2 = new BaseGood(2);
        Producer[] producers = {new Producer(5, g1)};
        Consumer c = new Consumer(100, 10);
        c.calculateQuantityDemanded(g1, g2);
    }
}
