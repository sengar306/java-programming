import java.util.Map;
import java.util.TreeMap;

public class Tree_Map {
   public static void main (String args[])
   {
     TreeMap<Integer,String> t1= new TreeMap<>();
     t1.put(1,"rollno 1");
     t1.put(4,"rollno 4");
     t1.put(5,"rollno 5");
     t1.put(9,"rollno 9");
     t1.put(7,"rollno 7");
     t1.put(13,"rollno 13");
     t1.put(14,"rollno 14");
     t1.put(16,"rollno 16");
     t1.put(16,"rollno 162");
     t1.put(50,"rollno 50");

   
     
    for (Map.Entry<Integer, String> entry : t1.entrySet()) 
   {
            System.out.println(entry.getKey() + ": " + entry.getValue());
   } 
   System.out.println("lessthan and equal to the 3 : "+ t1.floorKey(3));
   System.out.println("greaterthan and equal to the 3"  +t1.ceilingKey(3));
   System.out.println("nearest lower key with respect to given key present in map : " + t1.lowerKey(3));
   System.out.println("nearest higher key present in map : "+  t1.higherKey(3));
}
}
