import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

   public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		double[] arr = new double[n];
		double total = 0;
		
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			total += arr[i];
		}
			
		Arrays.sort(arr);
		
		double sum = 0;
		if(n - m - k >= 0) for(int i = n - 1; i >= n - m - k; i--) sum += arr[i];
		else for(int i = 0; i < n; i++) sum += arr[i];
		
		System.out.println(sum / total * 100);
   }
}