/**
 * @author Henry Liu
 * Mar 1, 2022
 *
 * This program creates a human
 */
public class Human {

   //attributes
   
   /** The name of the human */
   private String name;

   /** the weight of the human in kilograms */
   private double weight;

   /** the energy level of the human as a percentage from 0 to 100 */
   private int energyLevel;
  
   //constructors
   
   /** default constructor */
   public Human() {
   }
     
  /** 
   * creating the human
   *
   * @param name, name of the human
   * @param weight, weight of the human in kilograms
   * @param energyLevel, a percentage that shows the human's energy
   */
   public Human(String name, double weight, int energyLevel) {
  
      //initializing name
      this.name = name;
      
      //weight cannot be negative
      if (weight < 0) {
         this.weight = 0;
      } else {
        this.weight = weight;
      }
     
      //energy level must be from 0 to 100 percent
      if (energyLevel < 0) {
         this.energyLevel = 0;
      } else if (energyLevel > 100) {
         this.energyLevel = 100;
      } else {
         this.energyLevel = energyLevel;
      }
      
   }
   
   // accessor methods
   
  /**
   * getting the name
   *
   * @return name, name of the human
   */
   public String getName() {
      return this.name;
   }  
   
  /**
   * getting the weight
   *
   * @return weight, human's weight in kilograms
   */
   public double getWeight() {
      return this.weight;
   }  

  /**
   * getting the energy
   *
   * @return energyLevel, human's energy as a percentage
   */
   public int getEnergyLevel() {
      return this.energyLevel;
   }  
   
   //mutator methods
   
  /**
   * the human sleeps
   * energy increases
   *
   * @param hours, number of hours the human sleeps
   */
   public void sleep(int hours) {
      if (hours > 0) {
         energyLevel += hours * 10;
      }
   }

  /**
   * the human runs
   * both weight and energy decrease
   *
   * @param km, number of kilometers run
   */
   public void run(double km) {
      if (km > 0){
         weight -= 0.001 * km;
         energyLevel -= (int)(km * 3);
      }
   }
   
  /**
   * eating a vegetable
   * weight and energy go up
   * 
   * @param veg, vegetable name
   * @param grams, number of grams eaten
   */
   public void eat(Vegetable veg, double grams) {
      
      int calIntakeVeg = veg.eaten(grams);
      
      //prints out message if vegetable cannot be eaten
      if (calIntakeVeg == -1) {
         System.out.println("I don’t have that much food");
      } else {
         weight += grams / 1000;
      
         //if successfully eaten, no message pops up
         energyLevel += (int)(calIntakeVeg / 15);
         if (energyLevel > 100) {
            energyLevel = 100;
         } else {
            this.energyLevel = energyLevel;
         }
      }
      
   }
   
  /**
   * eating a cookie
   * weight and energy go up
   * 
   * @param food, cookie name
   * @param grams, number of grams eaten
   */
   public void eat(Cookie food, double grams) {
      
      int calIntakeCookie = food.eaten(grams);
      
      //prints out message if cookie cannot be eaten
      if (calIntakeCookie == -2) {
         System.out.println("I can’t eat the bag");
      } else if (calIntakeCookie == -1) {
         System.out.println("I don’t have that much food");
      } else {
         weight += grams / 1000;
      
         //if successfully eaten, no message pops up
         energyLevel += (int)(calIntakeCookie / 15);
         if (energyLevel > 100) {
            energyLevel = 100;
         } else {
            this.energyLevel = energyLevel;
         }
      }
      
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
      output += " kilograms\n";
      
      output += "Energy level: ";
      output += energyLevel;
      output += " percent\n";
      
      return output;
   }
   
}
