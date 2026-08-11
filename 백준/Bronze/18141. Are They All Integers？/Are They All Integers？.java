import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test10();
	}

   public static void test10() throws IOException {
	   
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   int n = Integer.parseInt(br.readLine());
	   int[] arr = new int[n];
	   StringTokenizer st = new StringTokenizer(br.readLine());
	   
	   for(int i = 0; i < n; i++) arr[i] = Integer.parseInt(st.nextToken());
	   
	   for(int i = 0; i < n; i++) {
		   
		   for(int j = 0; j < n; j++) {
			   
			   if(i == j) continue;
			   
			   for(int k = 0; k < n; k++) {
				   
				   if(i == k || j == k) continue;
				   
				   int temp = (arr[i] - arr[j]) / arr[k];
				   if(temp != (double)(arr[i] - arr[j]) / arr[k]) {
					   System.out.println("no");
					   System.exit(0);
				   }
			   }
		   }
	   }
	   
	   System.out.println("yes");
   }
}
