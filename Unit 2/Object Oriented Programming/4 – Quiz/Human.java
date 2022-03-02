/**
 * @author Henry Liu
 * Mar 1, 2022
 *
 * This program creates a cookie class
 * 
 */
public class Human {
   
  /** The name of the human */
   private String name;

  /** the weight of the human in kilograms */
   private double weight;

  /** the energy level of the human as a percentage from 0 to 100 */
   private int energyLevel;
  
  /**
   * 
   */
   public Human() {
   }
  
   public Human(String name, double weight, int energyLevel) {
  
      this.name = name;

      if (weight < 0) {
         this.weight = 0;
      } else {
        this.weight = weight;
      }
     
      if (energyLevel < 0) {
         this.energyLevel = 0;
      } else if (energyLevel > 100) {
         this.energyLevel = 100;
      } else {
         this.energyLevel = energyLevel;
      }
      
   }
   
   
   // accessor methods
   
   public String getName() {
      return name;
   }  
   
   public double getWeight() {
      return weight;
   }  
   
   public int getEnergyLevel() {
      return energyLevel;
   }  
   
   
   //mutator methods
   
   public void sleep(int hours) {
      if (hours > 0) {
         energyLevel += hours * 10;
      }
   }

   public void run(double km) {
      if (km > 0){
         weight -= 0.001 * km;
         energyLevel -= km * 3;
      }
   }
   
   public void eat(Vegetable veg, double grams) {
      
      int calIntakeVeg = veg.eaten(grams);
      
      if (calIntakeVeg == -1) {
         System.out.println("I don’t have that much food");
      } else {
         weight += grams / 1000;
      
         energyLevel += calIntakeVeg / 15;
         if (energyLevel > 100) {
            energyLevel = 100;
         } else {
            energyLevel = energyLevel;
         }
      }
   }
   
   public void eat(Cookie food, double grams) {
      
      int calIntakeCookie = food.eaten(grams);
      
      if (calIntakeCookie == -2) {
         System.out.println("“I can’t eat the bag");
      } else if (calIntakeCookie == -1) {
         System.out.println("I don’t have that much food");
      } else {
         weight += grams / 1000;
      
         energyLevel += calIntakeCookie / 15;
         if (energyLevel > 100) {
            energyLevel = 100;
         } else {
            energyLevel = energyLevel;
         }
      }
   }
   
   public String toString() {
      
      String output = "Name: ";
      output += name;
      output += "\n";
      
      output += "Weight: ";
      output += weight;
      output += " kilograms\n";
      
      output += "Energy level: ";
      output += energyLevel;
      output += "percent\n";
      
      return output;
   }
   
}
