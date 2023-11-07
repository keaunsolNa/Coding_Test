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
		int now = 0;
		boolean freeze = true;
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			
			if(arr[i] == 0 && freeze) {
				
				freeze = false;
				
			} else if(arr[i] == 0 && !freeze) {
				
				now = 0;
				
			}
		
			if(arr[i] != 0) {
				
				freeze = true;
				now++;
			}
			
			max = Math.max(max, now);
		}
		
		System.out.println(max);
   }
}