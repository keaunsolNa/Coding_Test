import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test06();
	}

   public static void test06() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st;
	   
	   int T = Integer.parseInt(br.readLine());
	   
	   while(T --> 0) {
		   
		   st = new StringTokenizer(br.readLine());
		   int n = Integer.parseInt(st.nextToken());
		   
		   long ans = 0;
		   long[] arr = new long[n];
		   for(int i = 0; i < n; i++) arr[i] = Long.parseLong(st.nextToken());
			   
		   for(int i = 0; i < n; i ++) {
			   
			   for(int j = i + 1; j < n ; j++) {
				   
				   ans += gcd(arr[i], arr[j]);
			   }
		   }
		   
		   System.out.println(ans);
	   }
	   
	   
   }

   private static long gcd(long num1, long num2){
       if(num2 == 0) return num1;
       else return gcd(num2, num1 % num2);
   }
}
