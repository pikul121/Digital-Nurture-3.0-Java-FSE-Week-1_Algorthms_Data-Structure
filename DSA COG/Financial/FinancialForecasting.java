import java.util.HashMap;
import java.util.Map;

public class FinancialForecasting {

    // Method to calculate future value using recursion and memoization
    public static double calculateFutureValue(double currentValue, double growthRate, int years, Map<Integer, Double> memo) {
        if (years == 0) {
            return currentValue;
        }

        if (memo.containsKey(years)) {
            return memo.get(years);
        }

        double futureValue = calculateFutureValue(currentValue * (1 + growthRate), growthRate, years - 1, memo);
        memo.put(years, futureValue);

        return futureValue;
    }

    public static void main(String[] args) {
        double currentValue = 1000; // Initial value
        double growthRate = 0.05; // 5% growth rate
        int years = 10; // Number of years

        Map<Integer, Double> memo = new HashMap<>();
        double futureValue = calculateFutureValue(currentValue, growthRate, years, memo);
        System.out.println("Future value after " + years + " years: " + futureValue);
    }
}
