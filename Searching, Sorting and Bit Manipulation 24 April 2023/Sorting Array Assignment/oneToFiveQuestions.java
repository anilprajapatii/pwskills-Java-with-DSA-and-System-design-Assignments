import java.lang.*;
public class oneToFiveQuestions{
    public static void Q1(){
        // Q1. Write a program to sort an array in descending order using bubble sort.
        // Output Array: {6, 5, 3, 1, 0}
        // Input Array {3,5,1,6,0}

        int[] array = {80,43,599,99,9};
        
        System.out.println("Input Array:");
        // Printing Unsorted Array 
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();

        int n = array.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] < array[j + 1]) {
                    // Swap array[j] and array[j + 1]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                    swapped = true;
                }
            }

            // If no two elements were swapped by inner loop, the array is already sorted
            if (!swapped) {
                break;
            }
        }

        System.out.println("\nOutput Array:");
        for (int value : array) {
            System.out.print(value + " ");
        }
    }
   public static void main(String[] args) {
        Q1();
   }
    
}