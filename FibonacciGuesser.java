import java.util.Scanner;
import java.util.*;

class FibonacciGuesser {

 public static int fibonacci (int theNumber) {
      //base case
      if(theNumber < 2 ){
         return theNumber;
      }
      //recursive
      int returnThis = fibonacci(theNumber - 1) + fibonacci(theNumber - 2);
      return returnThis;
   }
   
   public static void main (String[] args) {
       Scanner scan = new Scanner(System.in);
       
       String nextGuess = null;
       int scannedInt = 0;
       int finalInt = 0;
       boolean keepGoing = true;
       while(keepGoing) {
         System.out.print("Please enter a valid integer between 1 and 45 to guess the fibonacci of: " );
         //nextGuess = scan.nextLine();
         //Check for an int.
         if(scan.hasNextInt()) {
            scannedInt = scan.nextInt();
            nextGuess = scan.nextLine();
            //Check for the right in
            if(scannedInt > 0 && scannedInt <= 45) {
               System.out.println(scannedInt + " is a valid number!");
               finalInt = scannedInt;
               keepGoing = false;
            }
         }
         else {
            //Store but don't use it.
            nextGuess = scan.nextLine();
         }
      } 
      
      nextGuess = null;
      
      int computerGuess = fibonacci(finalInt);
      boolean keepGuessing = true;
      int myGuess = 0;
      String throwawayLine = null;
      for(int i = 3; i >= 1; i--) {
      if(i >= 2) {
         System.out.println("Can you guess the final fibonacci of " + finalInt + "? You have " + i  + " guesses left.");
      }
      else {
         System.out.println("Can you guess the final fibonacci of " + finalInt + "? You have " + i  + " guess left.");
      }
         
         while(keepGuessing) {
            System.out.print("Guess an integer: " );
            if(scan.hasNextInt()) {
               myGuess = scan.nextInt();
               keepGuessing = false;
            }
            else {
               //Store but don't use it.
               throwawayLine = scan.nextLine();
            }
         } //Ended the while loop
         keepGuessing = true;
         if(myGuess == computerGuess) {
            System.out.println("You win! " + myGuess +  " was correct.");
            i = 0;
         }
         else {
            System.out.println("Please try again!");
         }
      }
     
      System.out.println("The correct answer was " + computerGuess);
    } //end MAIN


}