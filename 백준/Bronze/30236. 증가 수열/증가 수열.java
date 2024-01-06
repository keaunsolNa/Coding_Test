import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main { 
	
	public static void main(String[] args) throws IOException{ 
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int t = Integer.parseInt(br.readLine());
		
		while(t --> 0) {
			
			int n = Integer.parseInt(br.readLine());
			int[] arr = new int[n];
			
			st = new StringTokenizer(br.readLine());
			for(int i = 0; i < n; i++) arr[i] = Integer.parseInt(st.nextToken());
			
			int[] arrr = new int[n];
			
			for(int i = 0; i < n; i++) {
				
				for(int j = 1; ; j++) {
					
					if(i == 0 && j != arr[i]) { arrr[i] = j; break; }
					else if(j != arr[i] && j > arrr[i - 1]) { arrr[i] = j; break; }
				}
			}
			
			System.out.println(arrr[n - 1]);
		}
	} 
}