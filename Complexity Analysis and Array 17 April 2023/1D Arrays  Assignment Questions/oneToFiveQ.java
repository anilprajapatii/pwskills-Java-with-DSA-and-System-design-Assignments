public class oneToFiveQ {
    public static void Q1(){
        // Q1: Write a program to print the sum of all the elements present on even indices in the given array.
        // Input 1: arr[] = {3,20,4,6,9}
        // Output 1: 16
        // Input 1: arr[] = {4,3,6,7,1}
        // Output 1: 11
        System.out.println("-------------Q1----------------");


        int[] arr = {7,0,7,7,8};
        int result = 0;
        for (int i = 0; i < arr.length; i += 2) {
            result += arr[i];
        }
        System.out.println(result);

    }
    public static void Q2(){
        // Q2: Write a program to traverse over the elements of the array using for each loop and print all elements.
        // Input 1: arr[] = {34,21,54,65,43}
        // Input 1: arr[] = {4,3,6,7,1}
        // Output 1: 34 54
        // Output 1: 4 6

        System.out.println("-------------Q2----------------");

        int[] arr = {4,3,6,7,8};
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2==0){
                System.out.println(arr[i]+" ");
            }
        }
    }
    public static void Q3(int[] arr){
            if (arr == null || arr.length == 0) {
                throw new IllegalArgumentException("Array is empty or null");
            }
    
            int max = arr[0];
    
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }
    
            System.out.println(max);
        }
    

    public static void main(String[] args) {
        
        Q1();
        Q2();
        Q3(new int[]{4, 6, 9, 2, 7});
        
    }
}
