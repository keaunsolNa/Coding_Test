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
	
	private static int n, k, ans;
	private static int[] kit, day, visited;

	public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String[] arr = new String[n];
        
        for (int i = 0; i < n; i++) arr[i] = br.readLine();
        
        for (int i = 0; i < n; i++)
        {
        	
        	if (arr[i].equals("KBS1"))
        	{
        		String temp = "";
        		for (int j = i; j > 0; j--)
        		{
        			bw.write("4");
        			temp = arr[j - 1];
        			arr[j- 1] = arr[j];
        			arr[j] = temp;
        		}
        		
        		break;
        	}
        	
        	else 
        	{
        		bw.write("1");
        	}
        }

        if (arr[1].equals("KBS2")) 
        {
        	bw.flush();
        	bw.close();
        	br.close();
        	return;
        }

        for (int i = 0; i < n; i++)
        {
        	
        	if (arr[i].equals("KBS2"))
        	{
        		
        		String temp = "";
        		for (int j = i; j > 1; j--)
        		{
        			bw.write("4");
        			temp = arr[j - 1];
        			arr[j - 1] = arr[j];
        			arr[j] = temp;
        		}
        		
        		break;
        	}
        	
        	else
        	{
        		bw.write("1");
        	}
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
