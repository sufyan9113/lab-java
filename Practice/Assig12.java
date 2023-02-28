package Practice;
import java.util.Scanner;

public class Assig12 

{
    public static void main(String[]args)
    {
        Umpire u=new Umpire();
        System.out.println("Game Started");
        u.collectNumFromGuesser();
        u.collectNumFromPlayers();
        u.compareResult();
    }
}

    class Guesser
    {
        int guessNum;

        public int guessingNum()
        {

           System.out.println("Guesser Guess Number");
           Scanner s=new Scanner(System.in);
            guessNum=s.nextInt();
           return guessNum;

        }
    }

    class Player
    {
        int guessNum;

        public int guessingNum()
        {
            System.out.println("Player Guess Number");
            Scanner s= new Scanner(System.in);
            guessNum=s.nextInt();
            return guessNum;
        }
    }

    class Umpire
    {
        int numFromGuesser;
        int numFromPlayer1;
        int numFromPlayer2;
        int numFromPlayer3;

        public void collectNumFromGuesser()
        {
            Guesser g= new Guesser();
            numFromGuesser=g.guessingNum();
        }
        public void collectNumFromPlayers()
        {
            Player p1= new Player();
            Player p2= new Player();
            Player p3= new Player();
            numFromPlayer1=p1.guessingNum();
            numFromPlayer2=p2.guessingNum();
            numFromPlayer3=p3.guessingNum();
        }
        public void compareResult()
        {
            if(numFromGuesser==numFromPlayer1)
            {
                if(numFromGuesser==numFromPlayer2 && numFromGuesser==numFromPlayer3 )
                {
                    System.out.println("All Won");
                }
                else if(numFromGuesser==numFromPlayer2)
                {
                    System.out.println("Player 1 & 2 Won");
                }
                else if(numFromGuesser==numFromPlayer3)
                {
                    System.out.println("Player 1 & 3 Won");
                }
                else
                {
                    System.out.println("Player 1 Won");
                }
            }
            else if(numFromGuesser==numFromPlayer2)
            {
                if(numFromGuesser==numFromPlayer3)
                {
                System.out.println("Player 2 & 3 Won");
                }
                else
                {
                    System.out.println("Player 2 Won"); 
                }
            }
            else if(numFromGuesser==numFromPlayer3)
            {
                System.out.println("Player 3 Won"); 
            }
            else
            {
                System.out.println("All Lost");  
            }
        }


    }
    



