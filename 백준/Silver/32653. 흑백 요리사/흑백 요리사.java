import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        
        int n = Integer.parseInt(br.readLine());
    	st = new StringTokenizer(br.readLine());
    	long[] arr = new long[n];
    	for (int i = 0; i < n; i++)
        {
        	arr[i] = Integer.parseInt(st.nextToken());
        }

    	long lcm = lcm(arr);
    	while (!solve(arr, lcm))
    	{
    		lcm *= 2;
    	}
        
    	bw.write(String.valueOf(lcm));
        bw.flush();
        bw.close();
        br.close();
    }
    
    private static long gcd(long num1, long num2)
    {
    	
    	if (num2 == 0) return num1;
    	else return gcd(num2, num1 % num2);
    }
    
    private static long lcm(long[] arr)
    {
    	
    	if (arr.length == 1) return arr[0];
    	
    	long gcd = gcd(arr[0], arr[1]);
    	long lcm = arr[0] * arr[1] / gcd;
    	
    	for (int i = 2; i < arr.length; i++)
    	{
    		gcd = gcd(lcm, arr[i]);
    		lcm = lcm * arr[i] / gcd;
    	}
    	
    	return lcm;
    }
    
    private static boolean solve(long[] arr, long lcm)
    {
    	
    	for (long l : arr)
    	{
    		if (lcm / l % 2 != 0) return false;
    	}
    	
    	return true;
    }
}
