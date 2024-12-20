import java.io.*;
import java.util.*;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        long sum = 0;
        for (int i = 0; i < n; i++)
        {
        	arr[i] = Integer.parseInt(br.readLine());
        	sum += arr[i];
        }
        
        int[] ans = new int[2];
        ans[0] = 0;
        
        for (int i = 0; i < n; i++)
        {
        	
        	if (arr[i] == sum - arr[i]) 
        	{
        		ans[0] = 1;
        		ans[1] = arr[i];
        	}
        }

        
        bw.write(ans[0] == 1 ? String.valueOf(ans[1]) : "BAD");
        bw.flush();
        bw.close();
        br.close();
   
    }

    
}
