/**
 * @author Henry Liu
 * Feb 9, 2022
 *
 * This program constantly asks the user for a numerator and divisor and prints the quotient
 * if the user inputs a value other than a number, it will ask again 
 * if the user inputs a q, the program ends
 */

import java.util.*;

public class Liu_Henry_FoolProof {
   public static void main(String[] args) {
      
      //importing scanner
      Scanner sc = new Scanner(System.in);
      
     /**
      * initializing variables
      * numerator and divisor are strings but will be converted to double later
      * ans represents the quotient to the question
      * the constant loop is always true simply to loop the question
      * pass and pass2 the boolean value that allows the question to continue
      * if they are false, the user will be asked for the numerator/denominator again
      */
      String num;
      String den; 
      double ans; 
      final boolean loop = true;
      boolean pass;
      boolean pass2;
      
     /**
      * a do while loop to repeat the question with 
      * a boolean constant as the condition
      * it is always true and will continuously loop 
      * no matter what unless the program stops
      */
      do {
      
        /**
         * a do while loop for the numerator
         * if the numerator has a q at the front, the program ends
         * if the numerator is not a number, it asks the user again
         * it will only continue if the numerator is a valid numer
         */
         do {   
            
            //asking for the numerator
            pass = true;
            System.out.print("Enter the numerator: ");
            num = sc.nextLine();
            
            try {
            
               //checking if the numerator is a q, and exiting the program if it is
               if (num.charAt(0) == 'Q' || num.charAt(0) == 'q') {
                  System.exit(0);
               }
               
              /** 
               * if the numerator input can be turned into a number
               * it is valid and it will not trigger the catch block
               * therefore the program can move on               
               */
               else {
                  double validNum = (Double.parseDouble(num));
                  pass = true;
               }
            }
            
            //warning the user if the numerator is invalid
            catch (NumberFormatException e) {
               System.out.println("You entered bad data.");
               pass = false;
               System.out.println("Please try again.\n\n");
            }
         } while (pass == false);
         
        /**
         * using another do while block for the divisor
         * if the divisor is 0, it will ask the user to input a different divisor
         * if the divisor is not a number, it will ask the user for a number
         * it will only continue if a valid number is input by the user
         */  
         do {
            
            //asking for the divisor 
            pass2 = true;
            System.out.print("Enter the divisor: ");
            den = sc.nextLine();
         
            try {
            
               //a warning if the divisor is 0
               if (Double.parseDouble(den) == 0) {
                  pass2 = true;
                  System.out.println("You can't divide " + num + " by 0\n\n");
                  
               }
            
               //otherwise the program runs normally
               else {
                  pass2 = true;
                  ans = (Double.parseDouble(num)/Double.parseDouble(den));
                  System.out.printf("%s / %s is %.2f%n%n%n", num, den, ans);
               }
            }
            
            //catch block if the divisor is not a number
            catch (NumberFormatException e) {
               System.out.println("You entered bad data.");
               System.out.println("Please try again.\n\n");
               pass2 = false;
            }
         } while (pass2 == false);
      } while (loop);
   }
}