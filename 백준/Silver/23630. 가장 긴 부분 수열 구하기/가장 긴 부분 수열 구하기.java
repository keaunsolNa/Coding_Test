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
		int[] arr2 = new int[32];
		
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			
			int temp = arr[i];
			int n = 0;
			
			while(temp > 0) {
				arr2[n] += (temp % 2);
				temp = temp / 2;
				n++;
			}
		}

		int max = arr2[0];
		for(int i = 1; i < 32; i++) 
			max = Math.max(max, arr2[i]);
		
		System.out.println(max);
   }
}