/**
 * @author Henry Liu
 * Mar 1, 2022
 *
 * This program creates a cookie class
 */
public class Cookie {

   //attributes

   /** name of the cookie */
   private String name;
   
   /** weight of the cookie in grams */
   private double weight;

   /** amount of calories */
   private int calories;
   
   /** whether it is packaged or not */
   private boolean isPackaged;
   
   //constructors
   
   /** default constructor */
   public Cookie() {
   }
     
  /** 
   * creating the cookie
   *
   * @param name, name of the cookie
   * @param weight, weight of the cookie in grams
   * @param calories, number of calories
   * @param isPackaged, cookie is packaged or not
   */
   public Cookie(String name, double weight, int calories, boolean isPackaged) {
   
      //initializing name
      this.name = name;
   
      //weight cannot be negative
      if (weight < 0) {
         this.weight = 0;
      } else {
         this.weight = weight;
      }
      
      //calories cannot be negative
      if (calories < 0) {
         this.calories = 0;
      } else {
         this.calories = calories;
      }
      
      //initializing package boolean
      this.isPackaged = isPackaged; 
   
   }
   
   //accessor methods
   
  /**
   * getting the name
   *
   * @return name, name of the cookie
   */
   public String getName() {
      return this.name;
   }

  /**
   * getting the weight
   *
   * @return weight, weight of the cookie in grams
   */
   public double getWeight() {
      return this.weight;
   }
   
  /**
   * getting the calories
   *
   * @return calories, number of calories of the vegetable
   */
   public int getCalories() {
      return this.calories;
   }
   
  /**
   * getting the package information
   *
   * @return isPackaged, says if the cookie is packaged or not
   */
   public boolean isPackaged() {
      return this.isPackaged;
   }
   
   // mutator methods
   
  /**
   * opening the cookie
   * if it's already open, it stays open
   * if it is closed, it is now open
   *
   */
   public void open() {
      isPackaged = false;
   }
   
  /**
   * eating the cookie
   *
   * @param weight, for the weight eaten
   * @return caloriesEaten, calories eaten from the cookie 
   */
   public int eaten(double weight) {
      int caloriesEaten;
      
      //cannot eat if weight eaten is too high or cookie is packaged
      if (isPackaged = true) {
         caloriesEaten = -2;
      } else if (weight > this.weight) {
         caloriesEaten = -1;
      } else {
         caloriesEaten = (int)((weight / this.weight) * calories);
         calories -= caloriesEaten;
      }
      
      return caloriesEaten;
   
   }
   
  /**
   * initializing toString method
   *
   * @return output, outputs all the information
   */
   public String toString () {
      String output = "Name: ";
      output += name;
      output += "\n";
      
      output += "Weight: ";
      output += weight;
      output += " grams\n";
      
      output += "Calories: ";
      output += calories;
      output += "\n";
      
      output += "Packaged: ";
      if (isPackaged) {
         output += "Yes\n";
      } else {
         output += "No\n";
      }
      
      return output;
   }
   
}
