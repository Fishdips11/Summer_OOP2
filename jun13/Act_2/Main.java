package jun13.Act_2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cars car = new Cars();
        String element;
        int index;
        boolean test = true;

        while(test) {
            int choice = 0;
            try {
                if(choice <= 0) {
                    System.out.println("Press 1. Add car to list.");
                    System.out.println("Press 2. Edit element in list.");
                    System.out.println("Press 3. Delete element in list.");
                    System.out.println("Press 4. Display.");
                    System.out.println("Press 5. Exit.");
                    System.out.print("Enter choice: ");
                    choice = sc.nextInt();
                }
            } catch (Exception e) {
                System.out.println("Invalid");
            }
            System.out.println("");
            sc.nextLine();
            switch (choice) {
                case 1:
                    boolean tester = true;
                    while(tester) {
                        System.out.print("Enter car brand [Type: NO to stop]: ");
                        element = sc.nextLine();
                        if(element.equals("NO")) {
                            break;
                        }
                        car.addCar(element);
                    }
                    break;
                case 2:
                    System.out.print("Enter Index to change: ");
                    index = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter new value: ");
                    element = sc.nextLine();
                    car.setCarAt(index, element);
                    break;
                case 3:
                    System.out.print("Enter value to be deleted: ");
                    element = sc.nextLine();
                    car.deleteCar(element);
                    break;
                case 4:
                    car.display();
                    break;
                case 5:
                    test = false;
                    break;
                default:
                   System.out.println("Invalid!");
                   break;
            }
            System.out.println("");
        }
    }
}
