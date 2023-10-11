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
		int sum = 0;
		
		for(int i = 0; i < N; i++) {
			
			int temp = Integer.parseInt(st.nextToken());
			arr[i] = temp;
			sum += temp;
			
		}

		int answer = 0;
		while(sum != 0) {
			
			int num = 0;
			
			for(int i = 0; i < N; i++) {
				
				if(arr[i] % 2 == 1) {
					arr[i]--;
					num++;
				}
				
			}
			
			if(num > 0) {
				
				sum -= num;
				answer += num;
				
			}
			
			else {
				
				for(int i = 0; i < N; i++) arr[i] /= 2;
				sum /= 2;
				answer++;
				
			}
		}
		
		System.out.print(answer);
   }
}