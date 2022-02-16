/**
 * @author Henry Liu
 * Feb 9, 2022
 *
 * This program encrypts a line of code
 * the first and last characters of a word are switched
 * middle characters are changed to the letter two
 * spaces ahead in the ASCII table
 */
import java.util.*;

public class Liu_Henry_Encryption {
   public static void main(String[] args) {
      
      //calling the scanner
      Scanner in = new Scanner(System.in);
      
     /** creating the variables
      * the input represents what the user will type in
      * input length is the length of the whole input
      * the string array hold the value of every word
      * singleWord represents specific words of the word array
      * word length is the length of every word
      * the characters represent the values of the letters beteen
      * codeNum is the number of that value on the list of the ASCII table
      */
      String input;
      int inputLength;
      String[] word;
      String singleWord;
      int wordLength;
      char oldValue;
      int codeNum;
      char newValue;
      
      //asking the user for the input line
      System.out.print("Enter a line to be encrypted: ");
      input = in.nextLine();
      inputLength = input.length();
      
      //splitting each word with a space
      word = input.split(" ");
      
      //encrypting the whole message with a for loop
      System.out.print("The line encryption is: ");
      for (int i = 0; i < word.length; i++) {
        /** 
         * finds the first and last letters of a word
         * prints the last letter first
         */
         singleWord = word[i];
         wordLength = singleWord.length() - 1;
         System.out.print(singleWord.charAt(wordLength));
         
         //a nested for loop for the inner characters
         for (int j = 1; j < wordLength; j++) {
            
           /**
            * first finds the ASCII number of a character
            * adds two and converts it to a new character
            */
            oldValue = singleWord.charAt(j);
            codeNum = (int)oldValue+2;
            newValue = (char)codeNum;
            System.out.print(newValue);
         }
         
         //printing the first letter of the word at the end
         System.out.print(singleWord.charAt(0) + " ");
      }
   }
}