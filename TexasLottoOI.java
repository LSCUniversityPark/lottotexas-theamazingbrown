/* Program: Texas Lotto
 * Author: Omar Imam
 * Date Last Modified: 2/28/2017
 * Purpose: The purpose of this program is to generate a random lotto number, to ask the user for their 'guess numbers',
 * and then to check the guess numbers against the lotto numbers to see if any of the digits match. The program then outputs the
 * amount of money that the lotto player has won.
 */

// Package Information
package com.eclipse.omarimam;

// Import Scanner Utility
import java.util.Scanner;

// Define Class
public class TexasLottoOI {
	// Main Method
  public static void main(String[] args) {
	  
    // Generate a lottery as a three-digit string
    String lottery = "" + (int)(Math.random() * 10)
    		+ (int)(Math.random() * 10) 
    		+ (int)(Math.random() * 10);
    
    // Create new scanner object
    Scanner input = new Scanner(System.in);
    
    // Prompt user to enter guess pick
    System.out.print("Enter your lottery pick (three digits): ");
    String guess = input.nextLine();
    
    // Get digits from lottery
    char lotteryDigit1 = lottery.charAt(0); 
    char lotteryDigit2 = lottery.charAt(1); 
    char lotteryDigit3 = lottery.charAt(2);
    
    // Get digits from guess
    char guessDigit1 = guess.charAt(0);
    char guessDigit2 = guess.charAt(1);
    char guessDigit3 = guess.charAt(2);
    
    // Prints lottery number to screen
    System.out.println("The lottery number is " + lottery);
    
    // Check the guess for exact match
    if (guess.equals(lottery))
      System.out.println("Exact match: you win $21,000,000");
    // Check the guess for 3-digit match
    else if ((guessDigit1 == lotteryDigit1 || guessDigit1 == lotteryDigit2 || guessDigit1 == lotteryDigit3) 
    		&& (guessDigit2 == lotteryDigit1 || guessDigit2 == lotteryDigit2 || guessDigit2 == lotteryDigit3)
    		&& (guessDigit3 == lotteryDigit1 || guessDigit3 == lotteryDigit2 || guessDigit3 == lotteryDigit3)){
    	System.out.println("Match all digits: you win $2,128");
    }
    // Check the guess for 2-digit match
    else if (((guessDigit1 == lotteryDigit1 || guessDigit1 == lotteryDigit2 ||  guessDigit1 == lotteryDigit3)
    		&& ((guessDigit2 == lotteryDigit1 || guessDigit2 == lotteryDigit2 || guessDigit2 == lotteryDigit3) 
    		|| (guessDigit3 == lotteryDigit1 || guessDigit3 == lotteryDigit2 || guessDigit3 == lotteryDigit3)) 
    		|| (guessDigit2 == lotteryDigit1 || guessDigit2 == lotteryDigit2 || guessDigit2 == lotteryDigit3)
    		&& (guessDigit3 == lotteryDigit1 || guessDigit3 == lotteryDigit2 || guessDigit3 == lotteryDigit3))){
    	System.out.println("Match 2 digits: you win $60");
    }
    // Check the guess for 1-digit match
    else if ((guessDigit1 == lotteryDigit1 || guessDigit1 == lotteryDigit2 || guessDigit1 == lotteryDigit3)
    		|| (guessDigit2 == lotteryDigit1 || guessDigit2 == lotteryDigit2 || guessDigit2 == lotteryDigit3)
    		|| (guessDigit3 == lotteryDigit1 || guessDigit3 == lotteryDigit2 || guessDigit3 == lotteryDigit3)){
    	System.out.println("Match 1 digit: you win $3");
    }
    // If no matches are found:
    else {
      System.out.println("Sorry, no match"); 
      }
  }
}