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
		int[] arr = new int[N + 1];
		int[] ans = new int[N + 1];
		for(int i = 1; i <= N; i++) arr[i] = Integer.parseInt(st.nextToken());

		int idx = -1;
		
		for(int i = N; i >= 2; i--) {
			
			ans[i] = idx;
			if(arr[i - 1] != arr[i]) idx = i;
			
		}
		
		ans[1] = idx;
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i <= N; i++) sb.append(ans[i] + " ");
		System.out.println(sb);
   }
}