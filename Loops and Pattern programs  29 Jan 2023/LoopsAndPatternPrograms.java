//1. Write a Program(WAP) to print Alphabets A, B, C, D, E, F, G, H, using pattern programming logic
class Q1{
    public void alphabets(){
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

class Q2{
    public void triangle(){
        int n = 10;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                if (k % 2 == 0) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}

class Q3{
    public void temple(){
        // int n = 10;
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= n - i; j++) {
        //         System.out.print(" ");
        //     }
        //     for (int k = 1; k <= (2 * i - 1); k++) {
        //         if (k % 2 == 0) {
        //             System.out.print(" ");
        //         } else {
        //             System.out.print("*");
        //         }
        //     }
        //     System.out.println();
        // }
    }
}

class Q4{
    public void PWSKILLS(){
        int n=10;
        for(int i=1;i<=n;i++)
       {
        for(int j=1;j<=n;j++){
            if(i==1||j==1||i==n/2||j==n && i<n/2){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
        }
        System.out.println();
       }

       System.out.println();

       for(int i=1;i<=n;i++)
       {
        for(int j=1;j<=n;j++){
            if(j==1||j==n||i==j && i>5||i==8 && j==4){
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

class LoopsAndPatternPrograms{
    public static void main(String args[]){
        
    Q1 obj1 = new Q1();
    obj1.alphabets();

    Q2 obj2 = new Q2();
    obj2.triangle();

    Q3 obj3 = new Q3();
    obj3.temple();

    Q4 obj4 = new Q4();
    obj4.PWSKILLS();
        
}
}
