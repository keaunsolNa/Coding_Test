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
		long W = Integer.parseInt(st.nextToken());
		long have = 0;
		long[] byteCoin = new long[n];
		
		for(int i = 0; i < n ;i++) byteCoin[i] = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < n - 1; i++) {
			
			if(have == 0 && byteCoin[i] < byteCoin[i + 1]) {
				
				have = W / byteCoin[i];
				W -= have * byteCoin[i];
			}
			
			if(byteCoin[i] > byteCoin[i + 1]) {
				
				W += have * byteCoin[i];
				have = 0;
			}
			
		}
			
		W += have * byteCoin[n - 1];
		System.out.println(W);
   }
}