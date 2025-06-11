package jun11.Generic_Activity;
import javax.swing.text.Style;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Activity2 {
    public static void main(String[] args) {
        GenericClass<Integer, Double> obj = new GenericClass<>();
        Scanner sc = new Scanner(System.in);
        int data1;
        double data2;
        GenericClass<Integer, Double> genClass = new GenericClass<>();
        boolean isEnabled1 = true;
        boolean isEnabled2 = true;

        while (isEnabled1) {
            try {
                System.out.print("Enter Data 1: ");
                data1 = sc.nextInt();
                if (data1 < 1) {
                    System.out.println("Input positive value!");
                } else {
                    genClass.setData1(data1);
                    isEnabled1 = false;
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: " + e);
                sc.next();
            }
        }

        while (isEnabled2) {
            try {
                System.out.print("Enter Data 2: ");
                data2 = sc.nextDouble();
                if (data2 < 1) {
                    System.out.println("Input positive value!");
                } else {
                    genClass.setData2(data2);
                    isEnabled2 = false;
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: " + e);
                sc.next();
            }
        }

        System.out.println("Generic class returns: " + genClass.getData1() + " " + genClass.getData2());
    }
}
