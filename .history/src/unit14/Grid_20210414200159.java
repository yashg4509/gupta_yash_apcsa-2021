package unit14;

import java.lang.Math;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Grid
{
   private String[][] grid;
   String [] values;
   
   
   //load vals into the rows x cols grid randomly
    public Grid(int rows, int cols, String[] vals)
    {
        grid = new String[rows][cols];
        for(rows = 0;  rows < grid.length; rows++)
        {
          for( cols = 0; cols < grid[rows].length; cols++)
              {
                  grid[rows][cols] = vals[(int)(Math.random()*5)];    
              }
       }
                   
     
        
    }

    //find out which of the vals occurs the most
    public String findMax(String[] vals)
    {

		HashMap<String, Integer> hs = new HashMap<String, Integer>();

		for (int i = 0; i < vals.length; i++) {
			// If word already exist in HashMap then increase it's count by 1
			if (hs.containsKey(vals[i])) {
				hs.put(vals[i], hs.get(vals[i]) + 1);
			}
			// Otherwise add word to HashMap
			else {
				hs.put(vals[i], 1);
			}
		}

		// Create set to iterate over HashMap
		Set<Map.Entry<String, Integer> > set = hs.entrySet();
		String key = "";
		int value = 0;

		for (Map.Entry<String, Integer> me : set) {
			// Check for word having highest frequency
			if (me.getValue() > value) {
				value = me.getValue();
				key = me.getKey();
			}
		}

		// Return word having highest frequency
		return key;


}

// This code is contributed by Divyank Sheth

    }

    //returns a count of how many times val occurs in the matrix
    private int countVals( String val )
    {
        return 0;
    }

    //display the grid
    public String toString()
    {
        String output="";
            for(int rows = 0; rows < grid.length; rows++)
        {
            for(int cols = 0; cols < grid[rows].length; cols++){    
                output += (grid[rows][cols] + "  "  ); 
                
            }
               output += "\n";
        }

        
        return output;
    }
}