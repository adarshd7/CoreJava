package main;
import java.util.*;
public class GuessNumber {
    public static void main(String[] args) {
            int myGuess;
            int computerGuess;
            int guessCount=0;
            Random random = new Random();
            boolean guess=false;
            Scanner sc =new Scanner(System.in);
            computerGuess=random.nextInt(100)+1;
            while(!guess){
                System.out.println("enter ur Integer guess");
                myGuess = sc.nextInt();
                guessCount++;
                if(myGuess >= 1 && myGuess <= 100){
                    if(myGuess==computerGuess){
                    System.out.println("you guessesd correct"+guessCount);
                    guess=true;
                    }else if(myGuess>computerGuess){
                        System.out.println("Your Guess was too high");
                    }
                }else{
                        System.out.println("your guess was too low");
                    }
            }
    }
}
