package jun20.ThreadCodeChum;

import java.util.Arrays;

public class RankingCalculator implements Runnable {
    private double[] numbers;
    private double[] sortedNumbers;

    public RankingCalculator(double[] numbers) {
        // Clone to avoid modifying shared array
        this.numbers = numbers.clone();
    }

    @Override
    public void run() {
        sortedNumbers = numbers.clone();
        for (int i = 0; i < sortedNumbers.length - 1; i++) {
            for (int j = 0; j < sortedNumbers.length - i - 1; j++) {
                if (sortedNumbers[j] < sortedNumbers[j + 1]) {
                    double temp = sortedNumbers[j];
                    sortedNumbers[j] = sortedNumbers[j + 1];
                    sortedNumbers[j + 1] = temp;
                }
            }
        }
    }
    public double[] getSortedNumbers() {
        return sortedNumbers;
    }
}

