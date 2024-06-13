import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

   public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		while (true) {
			
			st = new StringTokenizer(br.readLine());
			int m = Integer.parseInt(st.nextToken());
			int nMin = Integer.parseInt(st.nextToken());
			int nMax = Integer.parseInt(st.nextToken());
			
			if (m == 0 && nMin == 0 && nMax == 0) break;
			
			int[] arr = new int[m];
			for (int i = 0; i < m; i++) arr[i] = Integer.parseInt(br.readLine());

			int max = 0;
			int ans = 0;
			for (int i = nMin - 1; i < nMax; i++) 
			{
				
				if (max <= arr[i] - arr[i + 1]) {
					max = arr[i] - arr[i + 1];
					ans = i + 1;
				}
				
			}
			
			sb.append(ans).append("\n");
			
		}
		
		System.out.println(sb);
		
		
		
		
   }
}