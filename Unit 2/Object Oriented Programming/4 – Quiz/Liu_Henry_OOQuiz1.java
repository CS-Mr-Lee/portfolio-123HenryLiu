/**
 * @author Henry Liu
 * Mar 1, 2022
 *
 * Main method to run the human, cookie, and vegetable class
 */
public class Liu_Henry_OOQuiz1 {
   public static void main(String[] args) {
   
      Human hungryPerson = new Human("Chris", 50, 82);

      Vegetable purpleVeggie = new Vegetable("Rotten Eggplant", 535.7, 127);
      
      Cookie chocoChip = new Cookie("Chips Ahoy Ripoff", -20, -240, false); 
      
      Cookie healthyCookie = new Cookie("Oatmeal Cookie", 15, 90, true); 
      
      Cookie perfectDesert = new Cookie("Marshmallow S'mores", 22.5, 350, false); 
      
      System.out.print(hungryPerson.eat(healthyCookie, 9));
      
      System.out.print(hungryPerson.eat(purpleVeggie, 550));

      hungryPerson.eat(perfectDesert, 18);
   }
}
