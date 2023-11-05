package codsoft;
import java.util.Scanner;
public class NumberGuess {
	 public static void guessingNumberGame()
	 {
	  Scanner sc = new Scanner(System.in);
	  int number = 1 + (int)(100 * Math.random());
	  int limits = 10;
	  int attempts=0;
	  int i, guess;
	  
	  System.out.println( "A number is chosen" + " between 1 to 100." 
	  + "Guess the number" + " within 10 trials.");
	  
	  for (i = 0; i < limits; i++) {   
		  attempts++;
	   System.out.println("Guess the number:");	   
	   guess = sc.nextInt();
	
	   if (number == guess) {
	    System.out.println("Congratulations!"+ " You guessed the number.");
	    System.out.println("The number of attempt is "+attempts);
	    break;
	   }
	   else if (number > guess  && i != limits- 1) {
	    System.out.println("The number is "+ "greater than " + guess);
	   }
	   else if (number < guess && i != limits - 1) {
	    System.out.println("The number is"+ " less than " + guess);
	   }
	  }
	  if (i == limits) {
	   System.out.println("You reached limits of trials.");
	   
	   System.out.println("The number was " + number);
	   System.out.println("The number of attempt is "+limits);
	  }
	 }
	 public static void	 main(String arg[])
	 {
	 guessingNumberGame();
	 }
	}
