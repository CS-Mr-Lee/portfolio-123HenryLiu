/**
 * @author Henry Liu
 * Feb 8, 2022
 *
 * This program asks for two grocery items and 
 * their price and displays the information
 */

import java.util.*;

public class Liu_Henry_GroceryItem {
   public static void main(String[]args) {
      
      //import scanner
      Scanner sc = new Scanner(System.in);
      
     /**
      * initalize variables     
      * they represent item 1 and item and the price or the name of the item
      */
      String grocery1item;
      double grocery1price;
      String grocery2item;
      double grocery2price;
      
     /**
      * obtaining the inputs
      * if item name is too long
      * or item price is too high
      * it will warn the user and ask again
      */
      System.out.println("What is your first grocery item?");
      grocery1item=sc.nextLine();

      while (grocery1item.length()>20) {
         System.out.println("Your item name is too long");
         grocery1item=sc.nextLine();
      }
      
      System.out.println("What is the price of this item?");
      grocery1price=sc.nextDouble();
      
      while (grocery1price>99.99) {
         System.out.println("Your item is too expensive");
         grocery1price=sc.nextDouble();
      }
      
      System.out.println("What is your second grocery item?");
      sc.nextLine();
      grocery2item=sc.nextLine();
      
      while (grocery2item.length()>20) {
         System.out.println("Your item name is too long");
         grocery2item=sc.nextLine();
      }
      
      System.out.println("What is the price of this item?");
      grocery2price=sc.nextDouble();
      
      while (grocery2price>99.99) {
         System.out.println("Your item is too expensive");
         grocery2price=sc.nextDouble();
      }
      
      //outputting the data using printf and making sure the dots are alligned
      System.out.println("--------------------------");
      
      if (grocery1price<10) {
         System.out.printf("%-21s$%.2f%n", grocery1item, grocery1price);
      }
      else {
         System.out.printf("%-20s$%.2f%n", grocery1item, grocery1price);
      }
      
      if (grocery2price<10) {
         System.out.printf("%-21s$%.2f%n", grocery2item, grocery2price);
      } 
      else {
         System.out.printf("%-20s$%.2f%n", grocery2item, grocery2price);
      }
      
      System.out.print("--------------------------");
   }
}