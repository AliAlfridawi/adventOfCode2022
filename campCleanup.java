import java.util.*;
import java.io.*;
public class campCleanup
{
   public static void main(String[] args) throws IOException
   {
      File myObj = new File("cleanUpData.txt");
      Scanner scan = new Scanner(myObj);
      int fullyCovered=0;
      while(scan.hasNextLine())
      {  
         String line = scan.nextLine();
         String[] sections = line.split(",");
         String[] elf1i = sections[0].split("-");
         String[] elf2i = sections[1].split("-");
         ArrayList<Integer> elf1 = new ArrayList<Integer>();
         for(int i = Integer.parseInt(elf1i[0]); i<Integer.parseInt(elf1i[1])+1; i++)
         {
            elf1.add(i);
         }
         ArrayList<Integer> elf2 = new ArrayList<Integer>();
         for(int i = Integer.parseInt(elf2i[0]); i<Integer.parseInt(elf2i[1])+1; i++)
         {
            elf2.add(i);
         }
         //System.out.println(elf1);
         //System.out.println(elf2);
         String biggerElf ="";
         String smallerElf="";
         ArrayList<Integer> AGH = new ArrayList<Integer>();
         if(elf1.size()>elf2.size())
         {
            for(int i = 0; i<elf2.size();i++)
            {
               for(int j = 0; j<elf1.size();j++)
               {
                  if(elf2.get(i) == elf1.get(j))
                  {
                     AGH.add(i);
                  }
               }
            } 
            if(AGH.size()>)
               {
                  fullyCovered++;
               }
         }
         else
         {
            for(int i = 0; i<elf1.size();i++)
            {
               for(int j = 0; j<elf2.size();j++)
               {
                  if(elf2.get(j) == elf1.get(i))
                  {
                     AGH.add(i);
                  }
               }
            } 
            if(AGH.size()>0)
               {
                  fullyCovered++;
               }

         }
      }
      System.out.println(fullyCovered);
   }
}