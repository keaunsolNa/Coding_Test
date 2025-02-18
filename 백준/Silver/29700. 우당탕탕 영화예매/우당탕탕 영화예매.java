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
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        

        String[] arr = new String[n];
        for (int i = 0; i < n; i++)
        {
        	
        	String token = br.readLine();
        	arr[i] = token;
        }

        StringBuilder lineBuilder = new StringBuilder();
        while (k --> 0) lineBuilder.append("0");
        String line = lineBuilder.toString();
        
        
        int ans = 0;
        for (String str : arr)
        {
        	
        	for (int i = 0; i < m; i++)
        	{
            	String target = str.substring(i);
            	if (target.startsWith(line))
            	{
            		ans++;
            	}
        	}

        }

        bw.write(String.valueOf(ans));
        bw.flush();
        bw.close();
        br.close();
    }
}
