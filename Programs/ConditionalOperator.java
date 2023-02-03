 class ConditionalOperator {

    public static void main(String[]args){
     
        int age=18;
        if(age>=18 && age <60){
            if(age >=18 && age <20){
                System.out.println("you are in early 20's");
            }
            else if(age >=20 && age <30){
            System.out.println("you are in 20's");
        }
            else if(age >=30 && age <40){
            System.out.println("you are in 30's");
            }
            else if(age >=40 && age <50){
                System.out.println("you are in 40's");
            }
            else {
            System.out.println("you are in 50's");
            }
        }
        else if(age >=60){
            System.out.println("you are old");
        }
        else if(age >=16 && age <18){
            System.out.println("you are teen");
        }
        
        else{
            System.out.println("you are kid");
        }
    }
    
}
