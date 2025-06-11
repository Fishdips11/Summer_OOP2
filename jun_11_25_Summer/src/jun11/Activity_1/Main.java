package jun11.Activity_1;

import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Student s = new Student();
        int num = 1;
        boolean isEnabled = true;

        System.out.print("Enter name: ");
        String name = sc.nextLine();
        s.setName(name);

        while(isEnabled) {
            try {
                System.out.print("Enter number: ");
                num = sc.nextInt();

                if(num < 1) {
                    System.out.println("Invalid number. Input positive number!");
                } else {
                    s.setNum(num);
                    isEnabled = false;
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: " + e);
                sc.next();
            }
        }
        s.display();
    }
}