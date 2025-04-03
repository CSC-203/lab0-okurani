import java.util.*;

public class Lab00
{
   public static void main(String[] args)
   {
      //declaring and initializing some variables
      float x = 5f;
      String y = "hello";
      double z = 9.8;

      //printing the variables
      System.out.println("x: "+x +" y: " + y + " z: " + z);

      //make an array
      int[] nums = {3, 6, -1, 2};
      // could also use int item
      for (int i = 0; i < nums.length; i++) {
         System.out.println(nums[i]);
      }


      // calling a function
      int numFound = char_count(y, 'l');
      System.out.println("Found:" + numFound);

      // counting for loop
      for (int i = 1; i < 11; i++) {
         System.out.print(i + " ");
      }
   }

   // defining count_char function
   public static int char_count(String s, char c) {
      int count = 0;
      for (char ch: s.toCharArray()) {
         if (ch == c) {
            count++;
         }
      }
      return count;
   }

}