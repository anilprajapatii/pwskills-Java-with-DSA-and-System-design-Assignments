public class oneToFiveQ {
    public static void Q1(){
        // Q1: Write a program to print the sum of all the elements present on even indices in the given array.
        // Input 1: arr[] = {3,20,4,6,9}
        // Output 1: 16
        // Input 1: arr[] = {4,3,6,7,1}
        // Output 1: 11
        int[] arr = {7,0,7,7,8};
        int result = 0;
        for (int i = 0; i < arr.length; i += 2) {
            result += arr[i];
        }
        System.out.println(result);

    }

    public static void main(String[] args) {
        Q1();
    }
}
