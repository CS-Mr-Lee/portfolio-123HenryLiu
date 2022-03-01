/**
 * @author Henry Liu
 * Mar 1, 2022
 *
 * This program creates a cookie class
 * 
 */
public class Cookie {

   // name of the vegetable
   private String name;
   
   // weight of the vegetable
   private double weight;

   // amount of calories
   private int calories;
   
   // whether it is packaged or not
   private boolean isPackaged;
   
   public Cookie() {
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
      } else {
         this.calories = calories;
      }
      
   }
   
   public Vegetable(String name, double weight, int calories, boolean isPackaged) {
   
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
   
   
   
   
   public void open() {
      isPackaged = false;
   }
   
   public int eaten(double weight) {
      int caloriesEaten;
      
      if (isPackaged = false) {
         caloriesEaten = -2
      } else if (weight > this.weight) {
         caloriesEaten = -1;
      } else {
         caloriesEaten = (weight / this.weight) * calories;
      }
      
      return caloriesEaten;
   
   }
   
   public String toString () {
      String output += "Name: "
      output += name;
      output += "\n";
   }
   
}