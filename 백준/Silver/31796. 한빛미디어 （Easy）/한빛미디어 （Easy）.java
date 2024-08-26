import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringBuilder out = new StringBuilder();
    	StringTokenizer st;

    	int n = Integer.parseInt(br.readLine());
    	int[] arr = new int[n];
    	st = new StringTokenizer(br.readLine());
    	for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(st.nextToken());
    	
    	Arrays.sort(arr);
    	
    	int sum = 1;
    	int prev = arr[0];
    	for (int i = 1; i < n; i++) {

    		if (prev * 2 <= arr[i]) 
            {
                sum++;
    		    prev = arr[i];
            }
    	}
    	
    	System.out.println(sum);
    }
}
