import java.util.*;
import java.lang.*;
public class oneToFiveQ {
    static public void Q1(){
        // Q1: Take m and n input from the user and m * n integer inputs from user and print the following:
        // number of positive numbers
        // number of negative numbers
        // number of odd numbers
        // number of even numbers
        // number of 0.
        Scanner scanner = new Scanner(System.in);

        // Taking input for m and n
        System.out.print("Enter the number of rows (m): ");
        int m = scanner.nextInt();
        System.out.print("Enter the number of columns (n): ");
        int n = scanner.nextInt();

        // Taking m * n integer inputs
        int[][] matrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Enter element at position (" + (i + 1) + ", " + (j + 1) + "): ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Analyzing and printing the results

        int positiveCount = 0;
        int negativeCount = 0;
        int oddCount = 0;
        int evenCount = 0;
        int zeroCount = 0;

        for (int[] row : matrix) {
            for (int num : row) {
                if (num > 0) {
                    positiveCount++;
                } else if (num < 0) {
                    negativeCount++;
                } else {
                    zeroCount++;
                }

                if (num % 2 == 0) {
                    evenCount++;
                } else {
                    oddCount++;
                }
            }
        }

        System.out.println("Number of positive numbers: " + positiveCount);
        System.out.println("Number of negative numbers: " + negativeCount);
        System.out.println("Number of odd numbers: " + oddCount);
        System.out.println("Number of even numbers: " + evenCount);
        System.out.println("Number of zeros: " + zeroCount);
    }
    public static void main(String[] args) {
        Q1();
    }
}
