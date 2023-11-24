import java.util.*;
import java.io.*;
public class calorieCounting 
{
   public static void main(String[] args) throws IOException
   {
      File myObj = new File("snacks.txt");
      Scanner scan = new Scanner(myObj);
      ArrayList<Integer> cal = new ArrayList<Integer>();
      int curCal = 0;
      int x =0;
      while(scan.hasNextInt())
      {
         String line = scan.nextLine();
         if(line=="")
         {
            cal.add(curCal);
            curCal=0;
         } 
         else
         {
            
            x = Integer.parseInt(line);
            curCal += x;
         }   
      }
      System.out.println(cal);
      ArrayList<Integer> topThree = new ArrayList<Integer>();
      int curMax = 0;
      int curIndex = 0;
      int totalMax = 0;
      for(int j =0; j<3;j++)
      {
      for(int i = 0; i<cal.size(); i++)
      {
         if(cal.get(i)>curMax)
         {
            curMax=cal.get(i);
            curIndex=i;
         }
      }
         totalMax+=curMax;
         cal.remove(curIndex);
         curMax=0;
      }
      System.out.println(totalMax);
      System.out.println(Collections.max(cal));
   }
}