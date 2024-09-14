import java.util.*;

class Solution {
    
    private static boolean[] available;
    private static String[][] parkOut;
    public int solution(int[] mats, String[][] park) {
        
        parkOut = park;
        available = new boolean[mats.length];
        int n = parkOut.length;
        int s = mats.length - 1;
        
        if (mats.length == 0) return -1;
        
        Arrays.sort(mats);
        
        for (int i = 0; i < n; i++)
        {
            if (available[s]) break;
            
            for (int j = 0; j < parkOut[i].length; j++)
            {
                
                if (available[s]) break;
                if (parkOut[i][j].equals("-1"))   
                {
                    for (int a = 0; a < mats.length; a++)
                    {
                        if (!available[a])
                        {
                            if (checkRange(i, j, mats[a] - 1)) available[a] = true;
                        }
                    }
                }
            }
        }

        if (!available[0]) return -1;
        
        int max = 0;
        for (int i = 0; i < s + 1; i++)
        {
            if (available[i]) max = Math.max (max, mats[i]);
        }
        
        return max;
        
    }
    
    private static boolean checkRange(int x, int y, int term) {
        
        if (x - term < 0) return false;
        if (y - term < 0) return false;
        
        for (int i = x - term; i <= x; i++)
        {
            for (int j = y - term; j <= y; j++)
            {
                if (!parkOut[i][j].equals("-1")) return false;
            }
        }
        
        return true;
    }
}