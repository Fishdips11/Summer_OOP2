package jun11.GenericNumber;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Activity4 {
    public static void main(String[] args) {
        NumberHolder<Double> numHolder = new NumberHolder<>();
        Scanner sc = new Scanner(System.in);
        double num1;
        double num2;
        boolean isEnabled = true;

        while (isEnabled) {
            try {
                System.out.print("Enter Number 1: ");
                num1 = sc.nextDouble();
                if (num1 < 1) {
                    System.out.println("Input positive value!");
                } else {
                    numHolder.setNumber1(num1);
                    isEnabled = false;
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: " + e);
                sc.next();
            }
        }

        isEnabled = true;
        while (isEnabled) {
            try {
                System.out.print("Enter Data 2: ");
                num2 = sc.nextDouble();
                if (num2 < 1) {
                    System.out.println("Input positive value!");
                } else {
                    numHolder.setNumber2(num2);
                    isEnabled = false;
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: " + e);
                sc.next();
            }
        }

        DecimalFormat dc = new DecimalFormat("0.00"); // we can use this for formatting ("#,###.00");
        DecimalFormat dfCash = new DecimalFormat("#,###.00");
        System.out.println("Sum of Integers: " + dc.format(numHolder.sum()));
        System.out.println("Sum of Integers: " + dfCash.format(numHolder.sum()));
    }
}
