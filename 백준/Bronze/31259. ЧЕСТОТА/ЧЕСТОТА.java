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
	
	public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = new int[26];
        int max = 0;
        while (true)
        {

        	try
        	{
        		
        		String input = br.readLine().toUpperCase();
        		
        		for (char c : input.toCharArray())
        		{
        			
        			if ((int) c >= 65 && (int) c <= 90)
        			{
        				arr[c - 'A']++;
        				max = Math.max(arr[c - 'A'], max);
        			}
        		}
        		
        		if (input.endsWith("@")) 
        		{
        			break;
        		}
        	} catch (Exception e) {
        		break;
        	}
        }

        String[] strArr = new String[max];
        for (int i = 0; i < max; i++)
        {
        
        	StringBuilder sb = new StringBuilder();
        	int idx = 0;
        	for (int t : arr)
        	{
        		if (t > i) sb.append((char) (idx + 'A'));
        		else sb.append(" ");
        		idx++;
        	}
        	
        	strArr[i] = sb.toString();
        }

        for (int i = max - 1; i >= 0; i--) bw.write(strArr[i] + "\n");
        
        bw.write("--------------------------\n");
        bw.write("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
        
        bw.flush();
        bw.close();
        br.close();
    }
}
