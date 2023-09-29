import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringBuilder sb = new StringBuilder();
	   
	   int N = Integer.parseInt(br.readLine());
	   int K = Integer.parseInt(br.readLine());
	   
	   long first = 1;
	   long last = K;
		
	   while(first < last) {
			
		   long mid = (first + last) / 2;	
		   long count = 0;
			
		   for(int i = 1; i <= N; i++) 
			   count += Math.min(mid / i, N);
			
		   if(K <= count) 
			   last = mid;
		   else 
			   first = mid + 1;
	   }
		
	   System.out.println(first);
	}
}
