/**
 * @author Henry Liu
 * Feb 9, 2022
 *
 * This program reads a file named champion.txt 
 * it creates a new file named MaxChampStats.txt
 * in the file the names of the champions with the highest hp and lowest armor are printed out
 */

import java.io.*;
import java.util.*;

public class Liu_Henry_ChampionFilter {
   public static void main(String[] args) {
      
     /**
      * initializing variables
      * stat represents every line
      * arrays hold each champion's name, hp, and armor
      * arrayNum is the number of a champion
      */
      String stat;
      String[] champions = new String[1000];
      double[] health = new double[1000];
      double highestHp = 0;
      int highestHpChampNum = 0;
      double[] armor = new double[1000];
      double lowestArmor = 999;
      int lowestArmChampNum = 0;
      int arrayNum = 0;
      String leagueChamps = "champions.txt";
      String filterFile = "MaxChampStats.txt";
      
      //using a try block in case reading the file doesn't work
      try {  
      
         //initializing a buffered reader to read the file
         BufferedReader in = new BufferedReader(new FileReader(leagueChamps));
         
         //a while loop to read every line of the file
         stat = in.readLine();
         while (in.readLine() != null) {
            stat = in.readLine();
            
            //assigning the champion array with the name of every champion
            if (stat.contains("\"name\":")) {
               champions[arrayNum] = stat.substring(13, (stat.length()-2));
            }
            
            //assigning the hp array with the hp of every champion
            if (stat.contains("\"hp\":")) {
               health[arrayNum] = Double.parseDouble(stat.substring(12, (stat.length()-1)));
               
               //a nested if block to detect the highest hp and the champion with it
               if (health[arrayNum] > highestHp) {
                  highestHp = health[arrayNum];
                  highestHpChampNum = arrayNum;
               }
            }
            
            //assigning the armor array with the armor level of every champion
            if (stat.contains("\"armor\":")) {
               armor[arrayNum] = Double.parseDouble(stat.substring(15, (stat.length()-1)));
               
               //a nested if block to detect the lowest armor level and the champion with it
               if (armor[arrayNum] < lowestArmor) {
                  lowestArmor = armor[arrayNum];
                  lowestArmChampNum = arrayNum;
               }
               
               // arrayNum increases by one once it gets the name, hp, and armor of a champion
               arrayNum++;
            }
         }
         
         //creating a buffered writer to write out the new file
         BufferedWriter out = new BufferedWriter(new FileWriter(filterFile, false));
         
         //writing the sentences into the file and closing it after
         out.write("The highest hp champion is " + champions[highestHpChampNum] + " with an hp of " + highestHp);
         out.newLine();
         out.write("The lowest armor champion is " + champions[lowestArmChampNum] + " with an armor amount of " + lowestArmor);
         out.newLine();
         out.close();
      }
      
      //if the file cannot be read it will print out an error
      catch (IOException e) {  
         System.out.println(e + "  Problem reading " + leagueChamps);
      }
   }
}