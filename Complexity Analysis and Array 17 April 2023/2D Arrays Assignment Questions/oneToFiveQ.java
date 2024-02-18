import java.util.*;
import java.lang.*;

public class oneToFiveQ {
    static public void Q1() {
        // Q1: Take m and n input from the user and m * n integer inputs from user and
        // print the following:
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

    static public void Q2() {

        // Q2: write a program to print the elements above the secondary diagonal in a
        // user inputted
        // square matrix.

        Scanner scanner = new Scanner(System.in);

        // Input: Reading the size of the square matrix
        System.out.print("Enter the size of the square matrix: ");
        int n = scanner.nextInt();

        // Input: Reading the elements of the matrix
        System.out.println("Enter the elements of the matrix row-wise:");
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i + j < n - 1) {
                    System.out.print(matrix[i][j] + " ");
                }
            }
        }
    }

    static public void Q3() {

        // Q3: write a program to print the elements of both the diagonals in a user
        // inputted square matrix
        // in any order.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the square matrix: ");
        int n = scanner.nextInt();

        int[][] matrix = new int[n][n];

        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        int n1 = matrix.length;
        // Print elements of the main diagonal
        System.out.print("Main Diagonal Elements: ");
        for (int i = 0; i < n1; i++) {
            System.out.print(matrix[i][i] + " ");
        }
        System.out.println();

        // Print elements of the other diagonal
        System.out.print("Other Diagonal Elements: ");
        for (int i = 0; i < n1; i++) {
            System.out.print(matrix[i][n1 - 1 - i] + " ");
        }
        System.out.println();
    }

    static public void Q4() {
        Scanner scanner = new Scanner(System.in);

        // Input the number of rows and columns in the array
        System.out.println("Enter the number of rows:");
        int rows = scanner.nextInt();
        System.out.println("Enter the number of columns:");
        int columns = scanner.nextInt();

        // Input the elements of the array
        System.out.println("Enter the elements of the 2D array:");
        int[][] array = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
        int largest = array[0][0];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (array[i][j] > largest) {
                    largest = array[i][j];
                }
            }
        }
        System.out.println("The largest element in the 2D array is: " + largest);
    }

    static public void Q5() {
        int[][] inputMatrix = {
                { 1, 2, 3, 4, 5 },
                { 3, 4, 5, 6, 7 },
                { 7, 6, 5, 4, 3 },
                { 8, 7, 6, 5, 4 },
                { 1, 2, 37, 8, 0 }
        };

        int size = 5; // Assuming a 5x5 matrix in this example

        // Check if the matrix is square with odd dimensions
        if (inputMatrix.length != size || inputMatrix[0].length != size || size % 2 == 0) {
            System.out.println("Invalid input matrix. Please provide a square matrix with odd dimensions.");
            return;
        }

        // Find the middle index
        int middleIndex = size / 2;

        // Display middle row
        for (int j = 0; j < size; j++) {
            System.out.print(inputMatrix[middleIndex][j] + " ");
        }

        // Display middle column
        for (int i = 0; i < size; i++) {
            System.out.print(inputMatrix[i][middleIndex] + " ");
        }

        System.out.println(); // Move to the next line
    }

    public static void main(String[] args) {
        // Q1();
        // Q2();
        // Q3();
        // Q4();
        Q5();

    }
}
