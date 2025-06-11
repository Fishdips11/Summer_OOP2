package jun11.Practice;

import java.io.*;
import java.util.Scanner;

public class BufferedFileHandlingExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String filename = "user_input.txt";

        System.out.print("How many lines of text do you want to enter? ");
        int lineCount = Integer.parseInt(scanner.nextLine());

        // Write using BufferedWriter in try-with-resources
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (int i = 1; i <= lineCount; i++) {
                System.out.print("Enter line " + i + ": ");
                String input = scanner.nextLine();
                writer.write(input);
                writer.newLine();
            }
            System.out.println("All lines saved to " + filename);
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }

        // Read using BufferedReader in try-with-resources
        System.out.println("\nContent of the file:");
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            int lineNum = 1;
            while ((line = reader.readLine()) != null) {
                System.out.println("Line " + lineNum + ": " + line);
                lineNum++;
            }
        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }

        scanner.close();
    }
}
//package jun11.Practice;
//
//import java.io.*;
//import java.util.Scanner;
//
//public class BufferedFileHandlingExample {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String filename = "user_input.txt";
//
//        System.out.print("How many texts do you want to enter? ");
//        int count = Integer.parseInt(scanner.nextLine());
//
//        // Use StringBuilder to build comma-separated string
//        StringBuilder inputBuilder = new StringBuilder();
//
//        for (int i = 1; i <= count; i++) {
//            System.out.print("Enter text " + i + ": ");
//            String input = scanner.nextLine();
//            inputBuilder.append(input);
//            if (i < count) {
//                inputBuilder.append(", ");
//            }
//        }
//
//        // Write to file using BufferedWriter
//        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
//            writer.write(inputBuilder.toString());
//            System.out.println("Text saved to " + filename);
//        } catch (IOException e) {
//            System.out.println("Error writing to file: " + e.getMessage());
//        }
//
//        // Read from file using BufferedReader
//        System.out.println("\nContent of the file:");
//        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
//            String line = reader.readLine();
//            if (line != null) {
//                System.out.println(line);
//            }
//        } catch (IOException e) {
//            System.out.println("Error reading from file: " + e.getMessage());
//        }
//
//        scanner.close();
//    }
//}
//
