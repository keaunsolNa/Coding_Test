import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;


public class Main {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) arr[i] = Integer.parseInt(st.nextToken());
		
		int k = Integer.parseInt(br.readLine());
		
		long sum = 0;
		int total = 0;
		for(int i = 0; i < n; i++) {

			if(gcd(arr[i], k) == 1) {
				sum += arr[i];
				total++;
			}
		}
	
		double result = (double)sum / total;
		System.out.println(result);
	
	}
	
	private static int gcd(int a, int b) {

		if(a < b) {
			
			int temp = a;
			a = b;
			b = temp;
			
		}
		
		while(b > 0) {
			int temp = a % b;
			a = b;
			b = temp;
		}
		
		return a;
	}
}
