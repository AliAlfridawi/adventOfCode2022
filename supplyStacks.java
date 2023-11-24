import java.util.*;
import java.io.*;
public class supplyStacks
{
   public static void main(String[] args) throws IOException
   {
      File myObj = new File("supplyStacksinfo.txt");
      Scanner scan = new Scanner(myObj);
      Map<Integer,ArrayList<String>> stack = new HashMap<Integer,ArrayList<String>>();
      stack.put(1, new ArrayList<String>());
      stack.put(2, new ArrayList<String>());
      stack.put(3, new ArrayList<String>());
      stack.put(4, new ArrayList<String>());
      stack.put(5, new ArrayList<String>());
      stack.put(6, new ArrayList<String>());
      stack.put(7, new ArrayList<String>());
      stack.put(8, new ArrayList<String>());
      stack.put(9, new ArrayList<String>());
      stack.get(1).add("R");
      stack.get(1).add("S");
      stack.get(1).add("L");
      stack.get(1).add("F");
      stack.get(1).add("Q");
      stack.get(2).add("N");
      stack.get(2).add("Z");
      stack.get(2).add("Q");
      stack.get(2).add("G");
      stack.get(2).add("P");
      stack.get(2).add("T");
      stack.get(3).add("S");
      stack.get(3).add("M");
      stack.get(3).add("Q");
      stack.get(3).add("B");
      stack.get(4).add("T");
      stack.get(4).add("G");
      stack.get(4).add("Z");
      stack.get(4).add("J");
      stack.get(4).add("H");
      stack.get(4).add("C");
      stack.get(4).add("B");
      stack.get(4).add("Q");
      stack.get(5).add("P");
      stack.get(5).add("H");
      stack.get(5).add("M");
      stack.get(5).add("B");
      stack.get(5).add("N");
      stack.get(5).add("F");
      stack.get(5).add("S");
      stack.get(6).add("P");
      stack.get(6).add("C");
      stack.get(6).add("Q");
      stack.get(6).add("N");
      stack.get(6).add("S");
      stack.get(6).add("L");
      stack.get(6).add("V");
      stack.get(6).add("G");
      stack.get(7).add("W");
      stack.get(7).add("C");
      stack.get(7).add("F");
      stack.get(8).add("Q");
      stack.get(8).add("H");
      stack.get(8).add("G");
      stack.get(8).add("Z");
      stack.get(8).add("W");
      stack.get(8).add("V");
      stack.get(8).add("P");
      stack.get(8).add("M");
      stack.get(9).add("G");
      stack.get(9).add("Z");
      stack.get(9).add("D");
      stack.get(9).add("L");
      stack.get(9).add("C");
      stack.get(9).add("N");
      stack.get(9).add("R");
      /*stack.get(1).add("Z");
      stack.get(1).add("N");
      stack.get(2).add("M");
      stack.get(2).add("C");
      stack.get(2).add("D");
      stack.get(3).add("P");*/
      System.out.println(stack);
      while(scan.hasNextLine())
      {
         String[] line = scan.nextLine().split(" ");
         int numberOfRemoved = Integer.parseInt(line[1]);
         int placeOfOrigin = Integer.parseInt(line[3]);
         int placeOfRelocation = Integer.parseInt(line[5]);
         ArrayList<String> removed = new ArrayList<String>();
         //System.out.println(numberOfRemoved);
         //System.out.println(placeOfOrigin);
         //System.out.println(placeOfRelocation);
         for(int i = 0; i<numberOfRemoved;i++)
         {
            removed.add(stack.get(placeOfOrigin).remove(stack.get(placeOfOrigin).size()-1));
         }
         for(int i = removed.size(); i>0;i--)
         {
            stack.get(placeOfRelocation).add(removed.get(i-1));
         }
         
      }
      System.out.println(stack);  
   }
}