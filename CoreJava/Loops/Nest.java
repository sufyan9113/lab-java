package Loops;

public class Nest {

    public static void main(String[]args){

        int n=11;
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {   
                if(i==(n-1)/2 || i+j>=(n-1)/2 && i<(n-1)/2 && j<=(n-1)/2 || j-i<=(n-1)/2 && i<=(n-1)/2 && j>=(n-1)/2   ){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                } 
            }
            System.out.println();
    
        }

       /* int n=10;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i==0 && j<(n-1)/2 || i==n-1 && j<(n-1)/2 || j==0 || j==(n-1)/2 && i>0 && i<n-1){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            } 
        }
        System.out.print(" ");
        for(int j=0; j<n; j++){
            if(i==0 && j<(n-1)/2 || i==n-1 && j<(n-1)/2 || j==0 || j==(n-1)/2 && i>0 && i<n-1){
            System.out.print("*");
        }
        else{
            System.out.print(" ");
        }
    }
        System.out.println();
    
  
    }

        /*int n=9;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i==0 && j>0 && j<(n-1)/2 ||j==0 && i>0|| j==(n-1)/2 && i>0 || i==(n-1)/2  && j<=(n-1)/2){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
        }
            System.out.println();
        }

       /* int n=5;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i==0||j==0 || i==(n-1)/2){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
        }
            System.out.println();
        }

       /* int n=5;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i==0|| i==n-1||j==0 || i==(n-1)/2){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
        }
            System.out.println();
        }
        /*
        int n=5;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i==0|| i==n-1|| j==(n-1)/2){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
        }
            System.out.println();
        }

      /*  int n=6;
        for(int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                if(i==(n-1)/2|| j==0|| j==n-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }

        /*int n=10;
        for(int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                if(i==0|| i==(n-1)/2|| j==0|| j==n-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }

        /*
        int n=5;
        for(int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                if(i==0|| i==n-1|| j==0|| j==n-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }
        */
    }
    
}
