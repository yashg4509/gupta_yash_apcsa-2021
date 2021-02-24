//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class TriangleFiveRunner {
   public static void main(String args[]) {
      int total = 0;

      for(int i = 1; i <= 7; i = i + 2)
      
         for(int x = 1; x <= i; x = x + 3)
      
            total = total + x;
      
      System.out.println(total);

   }
}