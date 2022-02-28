/**
 * @author Henry Liu
 * @author Larry Li
 * Feb 25, 2022
 *
 * This program creates a human class
 * It has attributes, a contructor, and several methods
 */
public class Human {

  /** The name of the human */
  private String name;

  /** the age of the human in years */
  private int age;

  /** the weight of the human in kg */
  private double weight;

  /** the height of the human in cm */
  private double height;

  /** the energy level of the human as a percentage from 0 to 100 */
  private int energyLevel;

  /** true if the human is currently in a chemistry class */
  private boolean isTakingChem;

  /** true if the human is happy; always false when isTakingChem is true */
  private boolean isHappy;

  /** making the method that assigns attributes
    * if and else statements ensure values don't cross boundary limits 
    *
    * @param name
    * @param age
    * @param weight
    * @param height
    * @param energyLevel
    * @param isTakingChem
    * @param isHappy
    */
  public Human(String name, int age, double weight, double height, int energyLevel, boolean isTakingChem, boolean isHappy) {
    
    this.name = name;

    if (age < 0) {
      this.age = 0;
    } else {
      this.age = age;
    }

    if (weight < 0) {
      this.weight = 0;
    } else {
      this.weight = weight;
    }
    
    if (height < 0.2) {
      this.height = 0.2;
    } else {
      this.height = height;
    }
    
    if (energyLevel < 0) {
      this.energyLevel = 0;
    } else if (energyLevel > 100) {
      this.energyLevel = 100;
    } else {
      this.energyLevel = energyLevel;
    }

    this.isTakingChem = isTakingChem;

    if (isTakingChem = true) {
      this.isHappy = false;
    } else {
      this.isHappy = isHappy;
    }

  }

  //accessor methods

  /** method for the name */
  public String getName() {
    return name;
  }

  /** method for the age */
  public double getAge() {
    return age;
  }

  /** method for the weight */
  public double getWeight() {
    return weight;
  }

  /** method for the height */
  public double getHeight() {
    return height;
  }

  /** method for the energy level */
  public int getEnergyLevel() {
    return energyLevel;
  }

  /** method for chemistry taking status */
  public boolean getIsTakingChem() {
    return isTakingChem;
  }

  /** method to get happiness level */
  public boolean getIsHappy() {
    return isHappy;
  }

  //mutator methods
  
  /** age increases by one year every birthday */
  public void birthday() {
    age++;
  }

  /** weight goes up by one kg every 7000 calories eaten 
    */
  public void eat(double calories) {
    weight += calories / 7000;
  }

  /** height of the human increases */
  public void grow(double changeInHeight) {
    if (changeInHeight > 0) {
      height += changeInHeight;
    }
  }

  /** the human is unhappy if they are taking chemistry */
  public void takeChem(){
    isTakingChem = true;
    isHappy = false;
  }

  /** the human drops chemistry, and now they're able to be happy */
  public void dropChem(){
    isTakingChem = false;
  }

  /** human's mood changes, but they'll never be happy if they take chem */
  public void moodChange(){
    isHappy = !isHappy;
    if (isTakingChem) {
      isHappy = false;
    }
  }

  /** energy increases with more sleep */
  public void sleep(int hours) {
    if(hours > 0){
      energyLevel += hours * 10;
    }
  }

  /** weight and energy decrease for every km run */
  public void run(double km) {
    if(km > 0){
      weight -= 0.001 * km;
      energyLevel -= km * 10;
    }
  }

  /** String method to output all parameters */
  public String toString() {
    String output = "Name: ";
    output += name;
    output += "\n";
    
    output += "Age: ";
    output += age;
    if (age == 1) {
         output += " year old\n";
    } else {
         output += " years old\n";
    }
   
    output += "Weight: ";
    output += weight;
    output += " kg\n";
        
    output += "Height: ";
    output += height;
    output += " m\n";

    output += "Energy Level: ";
    output += energyLevel;
    output += " %\n";
    
    output += "Is taking chemistry: ";
    if (isTakingChem) {
      output += " Yes\n";
    } else {
      output += " No\n";
    }
    output += "Is happy: ";
    if (isHappy) {
      output += " Yes\n";
    } else {
      output += " No\n";
    }
    
    return output;
  }
}