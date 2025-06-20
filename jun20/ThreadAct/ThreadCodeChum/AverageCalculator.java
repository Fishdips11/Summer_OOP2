package jun20.ThreadCodeChum;

public class AverageCalculator implements Runnable {
    private double[] numbers;
    private double average;

    public AverageCalculator(double[] numbers) {
        this.numbers = numbers;
    }

    @Override
    public void run() {
        double sum = 0;
        for(int i = 0; i < 4; i++) {
            sum += numbers[i];
        }
        average = sum / 4;
    }

    public double getAverage() {

        return average;
    }
}