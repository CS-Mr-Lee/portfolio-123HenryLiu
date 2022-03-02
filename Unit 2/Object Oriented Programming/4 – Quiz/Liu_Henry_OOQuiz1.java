/**
 * @author Henry Liu
 * Mar 1, 2022
 *
 * This program creates a cookie class
 * 
 */
public class Liu_Henry_OOQuiz1 {
   public static void main(String[] args) {
   
      Human person = new Human("Chris", 50, 88);
      System.out.println(person.toString());

      Vegetable purpleVeggie = new Vegetable("Rotten Eggplant", 535.7, 127);
      System.out.println(purpleVeggie.toString());
      
      Cookie chocoChip = new Cookie("Chips Ahoy Ripoff", -20, -240, false); 
      System.out.println(chocoChip.toString());
      
      Cookie healthyCookie = new Cookie("Oatmeal Cookie", 15, 90, true); 
      System.out.println(healthyCookie.toString());
      
      Cookie perfectDesert = new Cookie("Marshmellow Smores", 22.4, 350, false); 
      System.out.println(perfectDesert.toString());*/
      
      person.eat(healthyCookie, 9);
      
      person.eat(purpleVeggie, 550);
      
      person.eat(perfectDesert, 18);
   }
}
