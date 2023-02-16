package Projects;
import java.util.*;


class GuesserGame
{
        public static void main(String[]args)
        {
        System.out.println("Game Started");

        Umpire u=new Umpire();
        u.collectNumFromGuesser();
        u.collectNumFromPlayers();
        u.compare();

        }
}

class Guesser
{
        int guessnum;
        int guessnum()
        {
        System.out.println("Guesser Guess number");
        Scanner scan= new Scanner(System.in);
        guessnum=scan.nextInt();
        return guessnum;      
        }
}

class Player
{
        int guessnum;
        int guessnum()
        {
        System.out.println("Player Guess number");
        Scanner scan= new Scanner(System.in);
        guessnum= scan.nextInt();
        return guessnum;    
        }

}

class Umpire
{
        int numFromGuesser;
        int numFromPlayer1;
        int numFromPlayer2;
        int numFromPlayer3;

        void collectNumFromGuesser()
        {
        Guesser g=new Guesser();
        numFromGuesser= g.guessnum();
        }

        void collectNumFromPlayers()
        {
        Player p1=new Player();
        Player p2=new Player();
        Player p3=new Player();

        numFromPlayer1=p1.guessnum();
        numFromPlayer2=p2.guessnum();
        numFromPlayer3=p3.guessnum();

        }

        void compare()
        {
        if(numFromGuesser==numFromPlayer1)
        {
        if(numFromGuesser==numFromPlayer2 && numFromGuesser==numFromPlayer3)
        {
        System.out.println("All players Won");    
        }
        else if(numFromGuesser==numFromPlayer2)
        {
        System.out.println("Player 1 and Player 2 Won");        
        }
        else if(numFromGuesser==numFromPlayer3)
        {
        System.out.println("Player 1 and Player 3 Won");       
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
        System.out.println("Player 2 and Player 3 Won");   
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