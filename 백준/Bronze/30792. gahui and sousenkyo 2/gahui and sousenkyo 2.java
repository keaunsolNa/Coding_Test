import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int pick = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		Integer[] arr = new Integer[n];
		arr[0] = pick;
		
		for(int i = 1; i < n; i++) arr[i] = Integer.parseInt(st.nextToken());
		Arrays.sort(arr, Collections.reverseOrder());
		
		for(int i = 0; i < n; i++) 
			if(arr[i] == pick) System.out.println(i + 1);
    }
}