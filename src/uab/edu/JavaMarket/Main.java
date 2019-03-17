package uab.edu.JavaMarket;

import uab.edu.JavaMarket.uab.edu.JavaMarket.good.BaseGood;

public class Main {

    public static void main(String[] args) {
        Producer[] producers = {new Producer()};
        Consumer[] cons = {new Consumer(100,20)};
        BaseGood g1 = new BaseGood(producers, cons);
    }
}
