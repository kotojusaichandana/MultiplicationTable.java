import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a number
        System.out.print("Enter a number to print its multiplication table: ");
        int number = scanner.nextInt();

        // Print the multiplication table
        System.out.println("Multiplication Table of " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + number * i); // Intentional error: Missing parentheses
        }

        scanner.close();
    }
}

