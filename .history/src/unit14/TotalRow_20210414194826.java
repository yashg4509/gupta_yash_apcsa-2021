//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;

public class TotalRow
{
    public static List<Integer> getRowTotals( int[][] m )
    {
      List<Integer> result = new ArrayList<Integer>();
      int rows = m.length;  
      int cols = m[0].length; 
      int sumRow = 0; 
        
      for(int i = 0; i < rows; i++){  
          sumRow = 0;  
          for(int j = 0; j < cols; j++){  
            sumRow = sumRow + m[i][j];  
          }  

          result.add(sumRow);
      }  
        
    }
    
}
