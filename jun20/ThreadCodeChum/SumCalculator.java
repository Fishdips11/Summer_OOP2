package jun20.ThreadCodeChum;

public class SumCalculator implements Runnable {
    private double[] numbers;
    private double sum = 0;

    public SumCalculator(double[] numbers) {
        this.numbers = numbers;
    }

    @Override
    public void run() {
        for(int i = 0; i < 4; i++) {
            sum += numbers[i];
        }
    }

    public double getSum() {
        return sum;
    }
}