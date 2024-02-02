//1. Write a Program(WAP) to print Alphabets A, B, C, D, E, F, G, H, using pattern programming logic
class LoopsAndPatternPrograms{
    public static void main(String args[]){
        
        int n=10; 

        // Printing "A"

       for(int i=1;i<=n;i++)
       {
        for(int j=1;j<=n;j++){
            if(i==1||j==1||j==n||i==n/2){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
        }
        System.out.println();
       }
       System.out.println("\n");

       
       // Printing "B" 
       
       for(int i=1;i<=n;i++)
       {
        for(int j=1;j<=n;j++){
            if(i==1||j==1||j==n||i==n/2||i==n){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
        }
        System.out.println();
       }
       System.out.println("\n");

       
       // Printing "C" 
       
       for(int i=1;i<=n;i++)
       {
        for(int j=1;j<=n;j++){
            if(i==1||j==1||i==n){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
        }
        System.out.println();
       }

       System.out.println("\n");
       // Printing "D" 
       
       for(int i=1;i<=n;i++)
       {
        for(int j=1;j<=n;j++){
            if(i==1 && j<n ||j==1||i==n && j<n || ((i>=2 && i<n) && j==n)){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
        }
        System.out.println();
       }

       System.out.println("\n");
       // Printing "E" 
       
       for(int i=1;i<=n;i++)
       {
        for(int j=1;j<=n;j++){
            if(i==1||j==1||i==n/2||i==n){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
        }
        System.out.println();
       }

       System.out.println("\n");
       // Printing "F" 
       
       for(int i=1;i<=n;i++)
       {
        for(int j=1;j<=n;j++){
            if(i==1||j==1||i==n/2){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
        }
        System.out.println();
       }

       System.out.println("\n");
       // Printing "G" 
       
       for(int i=1;i<=n;i++)
       {
        for(int j=1;j<=n;j++){
            if(i==1||j==1||i==n||(i==n/2 && j>=6)||(j==n && i>=5) || (j==n/2 && i>=5 && i<=6)){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
        }
        System.out.println();
       }

       System.out.println("\n");
       // Printing "H" 
       
       for(int i=1;i<=n;i++)
       {
        for(int j=1;j<=n;j++){
            if(i==n/2||j==1||j==n){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
        }
        System.out.println();
       }
    }
}
