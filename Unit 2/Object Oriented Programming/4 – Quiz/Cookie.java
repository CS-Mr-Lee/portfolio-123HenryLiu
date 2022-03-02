/**
 * @author Henry Liu
 * Mar 1, 2022
 *
 * This program creates a cookie class
 * 
 */
public class Cookie {

  /** name of the cookie */
   private String name;
   
  /** weight of the cookie in grams */
   private double weight;

  /** amount of calories */
   private int calories;
   
  /** whether it is packaged or not */
   private boolean isPackaged;
   
  /** default constructor */
   public Cookie() {
   }
     
  /** 
   * @param 
   */
   public Cookie(String name, double weight, int calories, boolean isPackaged) {
   
      this.name = name;
   
      if (weight < 0) {
         this.weight = 0;
      } else {
         this.weight = weight;
      }
      
      if (calories < 0) {
         this.calories = 0;
      } else {
         this.calories = calories;
      }
      
      this.isPackaged = isPackaged; 
   
   }
   
   public String getName() {
      return name;
   }
   
   public double getWeight() {
      return weight;
   }
   
   public int getCalories() {
      return calories;
   }
   
   public boolean isPackaged() {
      return isPackaged;
   }
   
   // mutator methods
   
   public void open() {
      isPackaged = false;
   }
   
   public int eaten(double weight) {
      int caloriesEaten;
      
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
