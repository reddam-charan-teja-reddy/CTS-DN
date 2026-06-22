package forecast;

public class Test {
    public static void main(String[] args) {
        double initialValue = 10000;
        double growthRate = 0.08;
        int years = 5;

        double[] memo = new double[years + 1];
        double memoizedValue = Forecaster.calculateValue(initialValue, growthRate, years, memo);
        System.out.printf("Predicted value after %d years (Memoized): ₹%.2f%n", years, memoizedValue);
    }
}