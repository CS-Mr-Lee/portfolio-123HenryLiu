/**
 * @author Henry Liu
 * Mar 1, 2022
 *
 * This program creates a vegetable class
 */
public class Vegetable {
   
   //attributes

   /** name of the vegetable */
   private String name;
   
   /** weight of the vegetable in grams */
   private double weight;

   /** amount of calories */
   private int calories;
  
   //constructors
   
   /** default constructor */
   public Vegetable() {
   }
   
  /**
   * creating the vegetable
   *
   * @param name, name of the vegetable
   * @param weight, weight in grams
   * @param calories, number of calories
   */
   public Vegetable(String name, double weight, int calories) {
      
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
      
   }
   
   //accessor methods
   
  /**
   * getting the name
   *
   * @return name, name of the vegetable
   */
   public String getName() {
      return this.name;
   }
   
  /**
   * getting the weight
   *
   * @return weight, weight of the vegetable in grams
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
   
   //mutator methods
   
  /**
   * eating the vegetable
   *
   * @param weight, for the weight eaten
   * @return caloriesEaten, calories eaten from the vegetable 
   */
   public int eaten(double weight) {
      int caloriesEaten;
      
      //weight eaten cannot be more than vegetable's weight
      if (weight > this.weight) {
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
   public String toString() {
      
      String output = "Name: ";
      output += name;
      output += "\n";
      
      output += "Weight: ";
      output += weight;
      output += " grams\n";
      
      output += "Calories: ";
      output += calories;
      output += "\n";
      
      return output;
   }
   
}
