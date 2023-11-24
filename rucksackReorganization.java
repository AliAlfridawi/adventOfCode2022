import java.util.*;
import java.io.*;
public class rucksackReorganization
{
   public static void main(String[] args) throws IOException
   {
      File myObj = new File("rucksackInfo.txt");
      Scanner scan = new Scanner(myObj);
      ArrayList<String> total = new ArrayList<String>();
      int x = 0; 
      int score = 0;
      /*while(scan.hasNextLine())
      {
         String line = scan.nextLine();
         int halfLen = line.length()/2;
         String parOne = line.substring(0,halfLen);
         String parTwo = line.substring(halfLen);
         String theLetter = "";
         for(int i = 0; i<parOne.length();i++)
         {
            for(int j = 0; j<parTwo.length();j++)
            {
               if(parOne.substring(i,i+1).equals(parTwo.substring(j,j+1)))
               {
                  theLetter=parOne.substring(i,i+1);
               }
            }
         }
         total.add(theLetter);
      }
      int score = 0;
      System.out.println(total);
      String lowerCase = "abcdefghijklmnopqrstuvwxyz";
      String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
      for(int i = 0; i<total.size();i++)
      {
         for(int j = 0; j<lowerCase.length();j++)
         {
            if(total.get(i).equals(lowerCase.substring(j,j+1)))
            {
               score+=j+1;
            }
            else if(total.get(i).equals(upperCase.substring(j,j+1)))
            {
               score += j+27;
            }
         }
      }*/
      while(scan.hasNextLine())
      {
         try{
            String elf1 = scan.nextLine();
            String elf2 = scan.nextLine();
            String elf3 = scan.nextLine();
            ArrayList<String> inCommon = new ArrayList<String>();
            
            String letterInCommon = "";
            for(int i = 0; i<elf1.length();i++)
            {
               for(int j =0; j<elf2.length(); j++)
               {
                  if(elf1.substring(i,i+1).equals(elf2.substring(j,j+1)))
                  {
                     inCommon.add(elf1.substring(i,i+1));
                  }
               }
            }
            for(int i = 0; i<inCommon.size(); i++)
            {
               for(int j =0; j<elf3.length();j++)
               {
                  if(inCommon.get(i).equals(elf3.substring(j,j+1)))
                  {
                     letterInCommon=inCommon.get(i);
                  }
               }
            }
            total.add(letterInCommon);
         }
         catch( Exception e)
         {
            System.out.println("Poopoo");
         }
         
      }
      String lowerCase = "abcdefghijklmnopqrstuvwxyz";
         String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
         for(int i = 0; i<total.size();i++)
         {
            for(int j = 0; j<lowerCase.length();j++)
            {
               if(total.get(i).equals(lowerCase.substring(j,j+1)))
               {
                  score+=j+1;
               }
               else if(total.get(i).equals(upperCase.substring(j,j+1)))
               {
                  score += j+27;
               }
         } 

      System.out.println(score);
      
   }
}
}