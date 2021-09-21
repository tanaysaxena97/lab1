package edu.neu.coe.info6205;

public class TwoSum {
    private final int n;
    public TwoSum(int n) {
        this.n = n;
    }

    @Override
    public String toString() {
        return "TwoSum(" + "n=" + n + ");";
    }

    public static void main(String[] args) {
        final String n = args[0];
        final int i = Integer.valueOf(n);
        TwoSum twoSum = new TwoSum(i);
        System.out.println(twoSum);
    }
}
