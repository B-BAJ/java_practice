import java.util.Arrays;
import java.util.Scanner;

public class SortNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("How many numbers do you want to enter (maximum 100): ");
        int n = sc.nextInt();

        // Check if the number is valid
        if (n < 1 || n > 100) {
            System.out.println("Please enter a number between 1 and 100.");
            return;
        }

        int[] numbers = new int[n];

        // Input numbers
        System.out.println("Enter " + n + " numbers:");

        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        // Sort from smallest to largest
        Arrays.sort(numbers);

        // Display from highest to lowest
        System.out.println("Numbers from highest to lowest:");

        for (int i = n - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }

        sc.close();
    }
}