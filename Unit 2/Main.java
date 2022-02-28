/**
 * @author Henry Liu
 * @author Larry Li
 *
 * Feb 25, 2022
 * This program creates 2 instances of the human class 
*/

public class Main {
  
  public static void main(String[] args) {

    //create the first human, Eric
    Human Eric = new Human("Eric", 18, 23, 1.6, 17, true, false);

    //print Eric's current attributes to the console
    System.out.println(Eric.toString());
    
    //Eric goes through his daily routine by sleeping, going for a morning run, and eating 
    Eric.sleep(5);
    Eric.run(1);
    Eric.eat(2000);
    Eric.grow(0.01);
    
    //Eric tries to be happy but is unable to because he is taking chemistry
    Eric.moodChange();

    //showcases Eric's attribute changes (and lack thereof):
    System.out.println(Eric.toString());
    
    //create a second human to showcase restrictions in the code
    Human Kevin = new Human ("Kevin", -2, 83, -0.3, 273, true, true);
    System.out.println(Kevin.toString());
/** note that Kevin's age is set to zero instead of a negative number (as that would be impossible) 
  * likewise, Kevin's height is set to the minimum value of 0.2 m
  * his energy is set to the max value of 100%
  */
    
    //even though he is trying to be happy, he is unable to because he is taking chemistry
    //to showcase:
    Kevin.moodChange();
    System.out.println(Kevin.getIsHappy());

    //he is able to become happy after dropping chem
    Kevin.dropChem();
    Kevin.moodChange();
    System.out.println(Kevin.getIsHappy());

    //Kevin increases celebrates his birthday, increasing his age
    Kevin.birthday();

    //Kevin cannot grow a negative amount, sleep a negative number of hours, or run a negative distance
    Kevin.grow(-0.7);
    Kevin.sleep(-3);
    Kevin.run(-3.6);

    //to show that none of these changed any values:
    System.out.println(Kevin.toString());
  }
}
