package Loops;

public class Assignment9 {
   
    public static void main(String[]args){
        //Answer 4
        int n=11;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
        if(i==0 && j>0 || j==0 && i<=(n-1)/2 && i>0 && i<(n-1)/2 || i==(n-1)/2 && j>0 && j<n-1 || j==n-1 && i>(n-1)/2 && i<n-1 || i==n-1 && j<n-1 ){
                    System.out.print("*");
                }
                else{
                System.out.print(" ");
                }
            }
    
            System.out.print("  ");
            for(int j=0; j<n; j++){
                if(j==0 && i<n-1|| j==n-1 && i<n-1 || i==n-1 && j>0 && j<n-1){
                     System.out.print("*");
                    }
                else{
                    System.out.print(" ");
                    }
            }
            System.out.print("  ");
            for(int j=0; j<n; j++){
                if(i==0 || j==0|| i==(n-1)/2){
                    System.out.print("*");
                        }
                    else{
                            System.out.print(" ");
                        }
                    }
            System.out.print("  ");
            for(int j=0; j<n; j++){
             if(i==j && j<=(n-1)/2&& i<=(n-1)/2|| i+j==n-1 && i<=(n-1)/2 && j>=(n-1)/2 || i>=(n-1)/2 && j==(n-1)/2){
                System.out.print("*");
                 }
                else{
                    System.out.print(" ");
                     }
             }
             System.out.print("  ");
            for(int j=0; j<n; j++){
            if(i==0 && j>0 && j<n-1|| j==0 && i>0 || j==n-1 && i>0||  i==(n-1)/2){
                System.out.print("*");
                 }
                else{
                    System.out.print(" ");
                     }
             }
             System.out.print("  ");
            for(int j=0; j<n; j++){
            if( j==0  || j==n-1 || i==j){
                System.out.print("*");
                 }
                else{
                    System.out.print(" ");
                     }
             }
             System.out.println();
            }
            System.out.println();

            for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
            if( i==0 && j>0 || i==n-1 && j<n-1 || i==(n-1)/2 && j>0 && j<n-1 || j==0 && i>0 && i<(n-1)/2 || j==n-1 && i>(n-1)/2 && i<n-1 ){
                System.out.print("*");
                 }
                else{
                    System.out.print(" ");
                     }
             } 
             System.out.print("  ");
            for(int j=0; j<n; j++){
            if( j==0 || j==n-1 || i==(n-1)/2 ){
                System.out.print("*");
                 }
                else{
                    System.out.print(" ");
                     }
             }
             System.out.print("  ");
            for(int j=0; j<n; j++){
            if( i==0  && j>0 && j<n-1|| i==(n-1)/2 || j==0 && i>0 || j==n-1 && i>0){
                System.out.print("*");
                 }
                else{                   
                    System.out.print(" ");
                     }
             }
             System.out.print("  ");
             for(int j=0; j<n; j++){
                if( i==0 || i==n-1 || j==(n-1)/2){
                    System.out.print("*");
                     }
                    else{                   
                        System.out.print(" ");
                         }
                 }
                 System.out.print("  ");
                 for(int j=0; j<n; j++){
                    if( j==0 || i+j==(n-1)/2 || i-j==(n-1)/2){
                        System.out.print("*");
                         }
                        else{                   
                            System.out.print(" ");
                             }
                }
                System.out.print("  ");
                 for(int j=0; j<n; j++){
                    if( j==0 || j==n-1 || i==(n-1)/2){
                        System.out.print("*");
                         }
                        else{                   
                            System.out.print(" ");
                             }
                }           
             System.out.println();
        }
    
    /* 
        int n=11;

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(j==0 || i==0 &&j<n-1  || j==n-1 && i<(n-1)/2 && i>0 || i==(n-1)/2 && j<n-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.print("  ");
            for(int j=0; j<n; j++){
                if(j==0 || j==(n-1)|| i+j==n-1 && j<=(n-1)/2 || i==j && j>=(n-1)/2){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.print("    ");
            for(int j=0; j<n; j++){
                if(i==0 && j>0 || j==0 && i>0 && i<(n-1)/2  || i==(n-1)/2 && j>0 && j<n-1 || j==n-1 && i>(n-1)/2 && i<n-1 || i==n-1 && j<n-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" "); 
                }
            }
            System.out.print("  ");
            for(int j=0; j<n; j++){
                if(j==0 || i+j==(n-1)/2 || i-j==(n-1)/2 ){
                    System.out.print("*");
                }
                else{
                    System.out.print(" "); 
                }
            }
            System.out.print("");
            for(int j=0; j<n; j++){
                if(i==0 || i==n-1 || j==(n-1)/2){
                    System.out.print("*");
                }
                else{
                    System.out.print(" "); 
                }
            }
            System.out.print("  ");
            for(int j=0; j<n; j++){
                if(j==0 || i==n-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" "); 
                }
            }
            System.out.print("  ");
            for(int j=0; j<n; j++){
                if(j==0 || i==n-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" "); 
                }
            }
            System.out.print("  ");
            for(int j=0; j<n; j++){
                if(i==0 && j>0 || j==0 && i>0 && i<(n-1)/2  || i==(n-1)/2 && j>0 && j<n-1 || j==n-1 && i>(n-1)/2 && i<n-1 || i==n-1 && j<n-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" "); 
                }
            }
            System.out.println();
        }


     /*   //Answer 3
        int n=15;
        for(int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                if(i==0 || i==n-1 || j== n-1|| j==0 || j-i>=(n-1)/2 || i+j<=(n-1)/2  ){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
*/
        
//Answer 2
    /* 
        int n=11;
      
        for(int i=0 ; i<n; i++){
            for(int j=0; j<n; j++){
                if(i==(n-1)/2 || i+j==(n-1)/2 || j-i==(n-1)/2 ){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
        }
        System.out.print("  "); 
        for(int j=0; j<n; j++){
            if(i==0 || i==j && j<=(n-1)/2 || i+j==n-1 && i<=(n-1)/2 ){
            System.out.print("*");
        }
        else{
            System.out.print(" ");
        }
    }
    System.out.print("  "); 
        for(int j=0; j<n; j++){
            if(j==0 || i==j && j<=(n-1)/2|| i+j==n-1 && j<=(n-1)/2){
            System.out.print("*");
        }
        else{
            System.out.print(" ");
        }
    }
    System.out.print("  "); 
        for(int j=0; j<n; j++){
            if(i==0 && j<=(n-1)/2|| j==0 && i<=(n-1)/2 || i+j==(n-1)/2){
            System.out.print("*");
        }
        else{
            System.out.print(" ");
        }
    }
    System.out.print("  "); 
        for(int j=0; j<n; j++){
            if(i==(n-1)/2 && j<=(n-1)/2|| j==0 && i<=(n-1)/2 || i==j && i<=(n-1)/2){
            System.out.print("*");
        }
        else{
            System.out.print(" ");
        }
    }
    System.out.println();
        }

        /*  
        // Answer 1:
        int n=11;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i==0 && j>0 && j<n-1 || j==0 && i>0 || j==n-1 && i>0|| i==(n-1)/2  ){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.print("    ");
            for(int j=0; j<n; j++){
                if(i==0 && j<n-1 || i==(n-1)/2|| i==n-1 && j<n-1 || j==0|| j==n-1 && i>0 && i<n-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
                System.out.print("    ");
            for(int j=0; j<n; j++){
                if(i==0 && j>0 || j==0 && i>0 && i<n-1  || i==n-1 && j>0){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.print("    ");
            for(int j=0; j<n; j++){
                if(i==0 && j<n-1 || i==n-1 && j<n-1 || j==0 || j==n-1 && i<n-1 && i>0 ){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.print("    ");
            for(int j=0; j<n; j++){
                if(i==0  || i==n-1 || j==0 || i==(n-1)/2 ){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.print("    ");
            for(int j=0; j<n; j++){
                if(i==0   || j==0 || i==(n-1)/2 ){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.print("    ");
            for(int j=0; j<n; j++){
                if(i==0 || j==0 || i==n-1 || j==n-1 && i>=(n-1)/2|| i==(n-1)/2 &&j>=(n-1)/2 ){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.print("    ");
            for(int j=0; j<n; j++){
                if( j==0 || j==n-1 || i==(n-1)/2  ){
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
