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

   /** the weight of the human in kg */
   private double weight;

   /** the energy level of the human as a percentage from 0 to 100 */
   private int energyLevel;
  
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
   
   public String getName() {
      return name;
   }  
   
   public double getWeight() {
      return weight;
   }  
   
   public int energyLevel() {
      return energyLevel;
   }  

   public void sleep(int hours) {
      if(hours > 0){
         energyLevel += hours * 10;
      }
   }

   public void run(double km)
      if(km > 0){
         weight -= 0.001 * km;
         energyLevel -= km * 3;
      }
   }
   
}