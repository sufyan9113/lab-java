package String;
public  class StringType 
{
    public static void main(String[]args)
    {
        String brand="pwskill";
        System.out.println(brand);
        brand.concat("Bengaluru");
        System.out.println(brand);
        
        StringBuilder brand1= new StringBuilder("pwSkill");
        System.out.println(brand1);

        brand1.append("Benguluru");
        System.out.println(brand1);

    }
    
}
