package uab.edu.JavaMarket;

import java.util.HashMap;
import java.util.Random;

import scpsolver.constraints.LinearSmallerThanEqualsConstraint;
import scpsolver.lpsolver.LinearProgramSolver;
import scpsolver.lpsolver.SolverFactory;
import scpsolver.problems.LinearProgram;
import uab.edu.JavaMarket.uab.edu.JavaMarket.good.Good;
import java.util.Map;

public class Consumer {
    private Good good;
    private double money;
    private int capacity;
    private int filledCapacity;
    private Map<Good, Double> marginalUtility = new HashMap<Good, Double>();
    private Map<Good, Double> quantityDemanded;
    //TODO create linear program to determine how much of each kind of good a consumer buys
    public Consumer(double money, int capacity){
        this.money = money;
        this.capacity = capacity;
    }
    public void calculateMarginalUtility(Good g){
        Random r = new Random();
        //Generates uniform random double on [-1,1]
        double offset = 2*r.nextDouble()-1;
        double baseUtil = g.getUtility();
        System.out.println(baseUtil);
        System.out.println(g);
        marginalUtility.put(g, baseUtil+offset);
    }
    public void calculateQuantityDemanded(Good g1, Good g2){
        this.calculateMarginalUtility(g1);
        this.calculateMarginalUtility(g2);
        double g1Utility = marginalUtility.get(g1);
        double g2Utility = marginalUtility.get(g2);
        double g1Price = g1.getValue();
        double g2Price = g2.getValue();
        LinearProgram p = new LinearProgram(new double[]{g1Utility, g2Utility});
        p.addConstraint(new LinearSmallerThanEqualsConstraint(new double[]{g1Price, g2Price}, this.money, "c1"));
        p.addConstraint(new LinearSmallerThanEqualsConstraint(new double[]{1.0, 1.0}, this.capacity, "c2"));
        System.out.println(p.getConstraints());
        p.setMinProblem(false);
        LinearProgramSolver s = SolverFactory.newDefault();
        double[] sol = s.solve(p);
    }

}
