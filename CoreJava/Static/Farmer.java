package Static;
import java.util.Scanner;
public class Farmer {


        public static void main(String[] args) {
            Input i= new Input();
            Input j= new Input();
            i.Inputdata();
            i.IntrestCalculator();
            j.Inputdata();
            j.IntrestCalculator();

        }
    
}

class Input{
    int pa;
    float tp;
    static float ri;
    float intrst;

    static{
        ri=8.5f;
    }

    void Inputdata(){
        Scanner s= new Scanner(System.in);
        System.out.println("enter Principle Amount");
        pa=s.nextInt();
        System.out.println("enter Time duration");
        tp=s.nextFloat();
    
    }
    void IntrestCalculator(){
        intrst=(float)(pa*ri*tp)/100;
        System.out.println("interest Amount = : "+intrst);
    }

}
