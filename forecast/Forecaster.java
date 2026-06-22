package forecast;

public class Forecaster {

    public static double calculateValue(double initialValue, double growthRate, int years, double[] memo) {
        if (years == 0) {
            return initialValue;
        }

        if (memo[years] != 0) {
            return memo[years];
        }

        memo[years] = (1 + growthRate) * calculateValue(initialValue, growthRate, years - 1, memo);
        return memo[years];
    }
}
