import java.util.Random;
import java.util.Scanner;

public class NumberGame{

  public static void main(String args[]){

    Random rand = new Random();

    Scanner scan = new Scanner(System.in);

    int randnum = rand.nextInt(100) + 1;  //0 to 99 only ,100 is not included so +1
    
    int guessCount = 0;
    while(true){
      System.out.println("Enter your guess (1-100):");

      int userGuess = scan.nextInt();
      guessCount++;

      if(userGuess == randnum){
        System.out.println("Correct! You Win!");
        System.out.println("It took you "+guessCount+" times");
        break;
      }
      else if(userGuess < randnum){
        System.out.println("Hey No! The number is higher. Guess again.");
      }
      else{
        System.out.println("Hey No! The number is lower. Guess again.");
      }
    }
  }
}