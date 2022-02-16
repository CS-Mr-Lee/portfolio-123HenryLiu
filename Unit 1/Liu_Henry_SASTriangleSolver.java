/**
 * @author Henry Liu
 * Feb 9, 2022
 *
 * This program asks for two sides and the angle between them
 * of a triangle and gives back the smallest angle in degrees
 */

import java.util.*;

public class Liu_Henry_SASTriangleSolver {
   public static void main(String []args) {
      
      //import scanner
      Scanner sc = new Scanner(System.in);
      
     /** 
      * initializing the side lengths and the angle
      * the two side are represented by doubles
      * the angle input is in degrees
      * the same angle is represented in radians
      */
      double firstSide;
      double secondSide;
      double midAngle;
      
      //asking the user for info
      System.out.println("For a triangle, list two of the sides and the angle between them");
      System.out.print("First side length: ");
      firstSide = sc.nextDouble();
      System.out.print("Second side length: ");
      secondSide = sc.nextDouble();
      System.out.print("Angle in between in radians: ");
      midAngle = sc.nextDouble();
      
      //using the method
      System.out.print("\nThe smallest angle of your triangle is " + smallestAngle(firstSide, secondSide, midAngle) + " degrees");
   }
   
  /**
   * This method takes the side lengths and the angle
   * it finds the other two angles
   * finally it finds the smallest angle
   *
   * @param side1 one of the sides 
   * @param side2 the other side
   * @param angle3 the angle in between 
   * @return smalAngle the smallest angle
   */
   public static double smallestAngle(double side1, double side2, double angle3) {
      
     /**
      * initializing the other side and angles
      * eqlValue is used for sine law
      * smalAngle is the angle in radians
      * angleDeg is the angle in degrees
      */
      double side3;
      double angle1;
      double angle2;
      double eqlValue;
      double smalAngle;
      double angleDeg;
      
     /**
      * calculating the values
      * first using cosine law to find the missing side
      * then using sine law to find the other two angles
      */
      side3 = Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2) - 2 * side1 * side2 * Math.cos(angle3));
      eqlValue = Math.sin(angle3)/side3;
      angle1 = Math.asin(eqlValue * side1);
      angle2 = Math.asin(eqlValue * side2);
      
      //finding the smallest angle using if and else statements
      if ((angle1 <= angle2) && (angle1 <= angle3)) {
         smalAngle = angle1;
      }
      
      else if ((angle2 <= angle1) && (angle2 <= angle3)) {
         smalAngle = angle2;
      }
      
      else {
         smalAngle = angle3;
      }
      
      //converting the angle to degrees
      angleDeg = Math.toDegrees(smalAngle);
      
      //getting the return value
      return angleDeg;
   }
}