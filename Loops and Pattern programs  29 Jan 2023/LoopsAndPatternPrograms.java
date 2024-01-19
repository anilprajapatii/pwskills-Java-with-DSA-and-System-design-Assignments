//1. Write a Program(WAP) to print Alphabets A, B, C, D, E, F, G, H, using pattern programming logic
class LoopsAndPatternPrograms{
    public static void main(String args[]){
       int n=20; 
       for(int i=1;i<=n;i++)
       {
        for(int j=1;j<=n;j++){
            if(i==n/2 || i+j<n/2){
                System.out.print("*");
            } 
        }
        System.out.println();
       }
    }
}
//2. Write a program to print triangle using star pattern programming logic
