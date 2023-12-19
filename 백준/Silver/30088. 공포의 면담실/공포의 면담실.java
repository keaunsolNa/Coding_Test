import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

   public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		long[] arr = new long[n + 1];
		for(int j = 1; j <= n; j++) {

			StringTokenizer st = new StringTokenizer(br.readLine());
			int person = Integer.parseInt(st.nextToken());
			long hab = 0;
			
			for(int i = 0; i < person; i++) hab += Integer.parseInt(st.nextToken());
			arr[j] = hab;
		}

		Arrays.sort(arr);
		
		long ans = 0;
		for(int i = 1; i <= n; i++) arr[i] = arr[i] + arr[i - 1];
		for(int i = 1; i <= n; i++) ans += arr[i];
		System.out.println(ans);
   }
}