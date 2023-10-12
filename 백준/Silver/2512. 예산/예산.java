import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

   public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] arr = new int[N];
		int max = 0;
		int total = 0;
		
		for(int i = 0; i < N; i++) {
			
			arr[i] = Integer.parseInt(st.nextToken());
			max = Math.max(max, arr[i]);
			total += arr[i];
			
		}
		
		int totalMoney = Integer.parseInt(br.readLine());
		
		if(total <= totalMoney) {
			System.out.println(max);
			return;
		}
		
		while(true) {

			max--;
			if(plus(arr, max) <= totalMoney) {
				System.out.println(max);
				return;
			}
		}
   }	
	public static int plus(int[] arr, int max) {

		int total = 0;
		for(int i = 0; i < arr.length; i++) {
			
			if(arr[i] > max) arr[i] = max;
			total += arr[i];
		}
			
		return total;
	}
}