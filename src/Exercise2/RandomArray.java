package Exercise2;

import java.util.Random;

import java.util.Scanner;

public class RandomArray {
    public static void main(String[] args) {
        double[] numbers = new double[50];
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextDouble() * 100;
        }

        System.out.println("Array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("Index %d: %.2f%n", i, numbers[i]);
        }

        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("\nEnter an index (0-49) to view its value (or -1 to exit): ");
                int index = scanner.nextInt();

                if (index == -1) {
                    break;
                }

                System.out.printf("Value at index %d: %.2f%n", index, numbers[index]);

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Error: Index must be between 0 and 49");
            } catch (Exception e) {
                System.out.println("Error: Please enter a valid integer number");
                scanner.nextLine();
            }
        }

        System.out.println("Closed");
        scanner.close();
    }
}