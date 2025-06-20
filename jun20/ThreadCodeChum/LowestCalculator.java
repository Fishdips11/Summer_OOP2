package jun20.ThreadCodeChum;

public class LowestCalculator implements Runnable {
    private double[] numbers;
    private double lowest;

    public LowestCalculator(double[] numbers) {
        this.numbers = numbers.clone();
    }

    @Override
    public void run() {
        lowest = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < lowest) {
                lowest = numbers[i];
            }
        }
    }

    public double getLowest() {
        return lowest;
    }
}
