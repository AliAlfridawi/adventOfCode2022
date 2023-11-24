import java.util.*;
import java.io.*;
public class rockPaperScissors
{
   public static void main(String[] args) throws IOException
   {
      File myObj = new File("secretSauce.txt");
      Scanner scan = new Scanner(myObj);
      int totalScore = 0;

      while(scan.hasNextLine())
      {
         String line = scan.nextLine();
         String[] played = line.split(" ");
         System.out.println(played[0] + played[1]);
/*         if(played[0].equals("A") && played[1].equals("Y"))
         {
            totalScore+=8;
         }
         else if(played[0].equals("A") && played[1].equals("X"))
         {
            totalScore+=4;
         }
         else if(played[0].equals("A") && played[1].equals("Z"))
         {
            totalScore+=3;
         }
         else if(played[0].equals("B") && played[1].equals("Y"))
         {
            totalScore+=5;
         }
         else if(played[0].equals("B") && played[1].equals("X"))
         {
            totalScore+=1;
         }
         else if(played[0].equals("B") && played[1].equals("Z"))
         {
            totalScore+=9;
         }
         else if(played[0].equals("C") && played[1].equals("Y"))
         {
            totalScore+=2;
         }
         else if(played[0].equals("C") && played[1].equals("X"))
         {
            totalScore+=7;
         }
         else if(played[0].equals("C") && played[1].equals("Z"))
         {
            totalScore +=6;
         } */
         if(played[1].equals("X"))
         {
            if(played[0].equals("A"))
            {
               totalScore+=3;
            }
            if(played[0].equals("B"))
            {
               totalScore+=1;
            }
            if(played[0].equals("C"))
            {
               totalScore+=2;
            }
         }
        else  if(played[1].equals("Y"))
        {
            if(played[0].equals("A"))
            {
               totalScore+=4;
            }
            if(played[0].equals("B"))
            {
               totalScore+=5;
            }
            if(played[0].equals("C"))
            {
               totalScore+=6;
            }
         }
         else if(played[1].equals("Z"))
         {
            if(played[0].equals("A"))
            {
               totalScore+=8;
            }
            if(played[0].equals("B"))
            {
               totalScore+=9;
            }
            if(played[0].equals("C"))
            {
               totalScore+=7;
            }
         }
      }
      System.out.print(totalScore);
   }
}