package jun20.ThreadCodeChum;

import java.util.*;
import java.text.*;
public class Main {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");
        Scanner scanner = new Scanner(System.in);
        double[] numbers = new double[4];

        System.out.print("Enter 4 numbers : ");
        for(int i = 0; i < 4; i++) {
            numbers[i] = scanner.nextDouble();
        }

        SumCalculator sumCalculator = new SumCalculator(numbers);
        AverageCalculator averageCalculator = new AverageCalculator(numbers);
        LowestCalculator lowestCalculator = new LowestCalculator(numbers);
        RankingCalculator rankingCalculator = new RankingCalculator(numbers);


        Thread sumThread = new Thread(sumCalculator);
        Thread averageThread = new Thread(averageCalculator);
        Thread lowestThread = new Thread(lowestCalculator);
        Thread rankingThread = new Thread(rankingCalculator);


        sumThread.start();
        averageThread.start();
        lowestThread.start();
        rankingThread.start();

        try {
            sumThread.join();
            averageThread.join();
            lowestThread.join();
            rankingThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        double[] sorted = rankingCalculator.getSortedNumbers();
        System.out.println("Sum: " + df.format(sumCalculator.getSum()));
        System.out.println("Average: " + df.format(averageCalculator.getAverage()));
        System.out.println("Lowest: " + df.format(lowestCalculator.getLowest()));
        System.out.print("Sorted Values (Descending): ");
        for(double num : sorted) {
            System.out.print(" " + df.format(num));
        }



    }
}