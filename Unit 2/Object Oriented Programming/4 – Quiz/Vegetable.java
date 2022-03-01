/**
 * @author Henry Liu
 * Mar 1, 2022
 *
 * This program creates a cookie class
 * 
 */
public class Vegetable {

   // name of the vegetable
   private String name;
   
   // weight of the vegetable
   private double weight;

   // amount of calories
   private int calories;
   
   public Vegetable() {
   }
   
   public Vegetable(String name, double weight, int calories) {
      
      this.name = name;
      
      if (weight < 0) {
         this.weight = 0;
      } else {
         this.weight = weight;
      }
      
      if (calories < 0) {
         this.calories = 0;
      } else (
         this.calories = calories;
      }
      
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
   
   //mutator methods
   
   public int eaten(double weight) {
      int caloriesEaten;
      
      if (weight > this.weight) {
         caloriesEaten = -1;
      } else {
         caloriesEaten = (weight / this.weight) * calories;
      }
      
      return caloriesEaten;
   }
   
   public String toString() {
      
      String output = "Name: ";
      output += name;
      output += "\n";
      
      String output = "Weight: ";
      output += weight;
      output += "\n";
      
      String output = "Calories: ";
      output += calories:
      output += "\n";
      
      return output;
   }
   
}