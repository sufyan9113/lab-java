 import java.util.Scanner;
 class Exercise {
    public static void main(String[]args){

        int num;
        Scanner in= new Scanner(System.in);
        System.out.println("enter number");
        num= in. nextInt();

        for(int i=1; i<=num; i++){
            if (!(num%i==0)){
                continue;
            }
            System.out.print(i+" ");
        }

       /* for(int i=1; i<=100; i++){
            if (i%3==0){
                continue;
            }
            System.out.print(i+ " ");
        }


    /*    for(int i=0; i<5; i++){
            if (i==3){
                continue;
            }
            System.out.print(i+ " ");
        }

      /*  int num,i,count;
        System.out.println("enter number");
        Scanner in= new Scanner(System.in);
        num= in. nextInt();

        for(i=2; i<num; i++){
            if(num%i==0){
                break;
            }
        }
        if(i==num){
            System.out.println(num +" is Prime Number");
        }
        else{
            System.out.println(num +" is Non Prime Number");
        }
       

        
        
        
        /*
        int i;
        for( i=1; i<=100; i++){
            if(i%5==0 && i%7==0){
                break;
            }
            
        }
        System.out.println(i);

         /* for(int i=1; i<=3; i++){
            for (int j=1; j<=3; j++){ 
            System.out.print(j+" ");
            if(i==j)
                break;
            
            }
        }
        /* 
        int i=0; int sum=0;
        
        do{
            sum=sum+i;
            i++;
        } while(i<=10);
        System.out.println(sum);
        /* 
        for(int i=1; i<=100; i++){
            if (i%3==0 && i%5==0){
                System.out.println("FizzBuss");
                }
            else if(i%3==0){
            System.out.println("Fizz");
            }
            else if(i%5==0){
            System.out.println("Buzz");
            }
             
            else{
                System.out.println(i);
            }
            
        }
        /* 
        int num;int sum=0;
        System.out.println("enter the n number which the sum of first natural number is required");
        Scanner in= new Scanner(System.in);
        num=in.nextInt();

        for(int i=0; i<=num; i++){
            sum=sum+i;
        }
        System.out.println("the sum of first "+num+" natural number is "+sum);


    /* 
        int day;
        System.out.println("enter day number1-7");
        Scanner in= new Scanner(System.in);
        day= in. nextInt();

        switch(day){
            case 1: System.out.println("Monday");
            break;
            case 2:System.out.println("Tuesday");
            break;
            case 3:System.out.println("Wednesday");
            break;
            case 4:System.out.println("Thursday");
            break;
            case 5:System.out.println("Friday");
            break;
            case 6:System.out.println("Saturday");
            break;
            case 7:System.out.println("Sunday");
            break;
            default:System.out.println("Invalid entry");

        
        }

      /*   char c;
        System.out.println("enter lower case character");
        Scanner in= new Scanner(System.in);
        c= in.next().charAt(0);

        if(c>='a' && c<='z'){
            if(c=='a'){
        System.out.println("entered character is 'a' ");
        }
        else{
            System.out.println("enter character is not 'a' ");
        }
    }
    else{
        System.out.println("enter lower case character");
    }

/* 
        int num;
        System.out.println("enter num between 1 to 10^6");
        Scanner in= new Scanner(System.in);
        num= in.nextInt();

        if(num>1 && num<=1000000){
            if(num%2==0){
                System.out.println("Even");
            }
            else{
                System.out.println("Odd");
            }
        }
            else{
                System.out.println("enter num between 1 to 10^6 ");
            }
        

        /* 

            for(int i=1; i<=100; i++){
                if(!(i%5==0 || i%7==0)){
                System.out.println(i);
                }
            }        
       /*  int num;
        System.out.println("enter number");
        Scanner in= new Scanner(System.in);
        num= in.nextInt();

        if(num%3==0 && num%5==0){
            System.out.println("FizzBuzz");
        }
        else if(num % 3==0){
            System.out.println("Fizz");
        }
        else if(num % 5==0){
            System.out.println("Buzz");
        }
        else{
            System.out.println(num);
        }
        */

    



    }
    
}
