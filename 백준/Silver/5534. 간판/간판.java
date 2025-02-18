import java.io.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.StringTokenizer;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Main {
	
	private static int t, s;
	private static String target, temp;
	public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        int cnt = 0;
        target = br.readLine();
        t = target.length();
        
        while (n --> 0)
        {
        	
        	temp = br.readLine();
        	s = temp.length();
        	
        	for (int i = 1; i <= s / (t - 1); i++)
        	{
        		if (compare(i))
        		{
        			cnt++;
        			break;
        		}
        	}
        }

        bw.write(String.valueOf(cnt));
        bw.flush();
        bw.close();
        br.close();
    }
	
	private static boolean compare(int term)
	{
		
		for (int i = 0; i < s - t + 1; i++)
		{
			int idx = i, j;
			
			for (j = 0; j < t && idx < s; j++, idx += term) 
			{
				if (target.charAt(j) != temp.charAt(idx)) break;
			}
			if (j == t) return true;
		}
		
		return false;
	}
}
