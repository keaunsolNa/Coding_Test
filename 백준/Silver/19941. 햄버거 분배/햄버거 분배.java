import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

   public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		char[] arr = br.readLine().toCharArray();
		int answer = 0;
		for(int i = 0; i < arr.length; i++) {
			
			if(arr[i] == 'P') {
				
				int start = i - K >= 0 ? i - K : 0;
				int end = i + K < arr.length ? i + K : arr.length;
				
				for(int j = start; j <= end; j++) {
					if(j == arr.length) break;
					if(arr[j] == 'H') {
						answer++;
						arr[j] = 'X';
						break;
					}
				}
			}
		}
		
		System.out.println(answer);
   }
}