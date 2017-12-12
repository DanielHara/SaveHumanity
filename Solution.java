import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    
    static void virusIndices(String p, String v)
    {
        String output = "";
        
        int i;
        int k;
        boolean hasMatch;
 
        hasMatch = false;
        
        int N_Diff;
        
        
        int p_length = p.length();
        int v_length = v.length();
        
        for (i=0; i<=p_length - v_length;i++)
        {
            N_Diff = 0;
            
            for (k = i; k <= i + v_length - 1; k++)
            {
                if (p.charAt(k) != v.charAt(k-i))
                {
                    N_Diff++;
                
                    if (N_Diff >= 2)
                        break;
                }
            }
            
            if (N_Diff < 2)
            {
                output = output.concat(i+ " ");
                hasMatch = true;
            }

        }
      
        if (!hasMatch)
            output = "No Match!";
        
        System.out.println(output);
        return;
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            String p = in.next();
            String v = in.next();
            virusIndices(p, v);
        }
        in.close();
    }
}
