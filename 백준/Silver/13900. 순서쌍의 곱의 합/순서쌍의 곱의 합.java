import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test03();
	}

   public static void test03() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st;
	   
	   int N = Integer.parseInt(br.readLine());
	   st = new StringTokenizer(br.readLine());
	   int[] arr = new int[N];
	   for(int i = 0; i < N; i++) arr[i] = Integer.parseInt(st.nextToken());
	   
	   long sum = 0;
	   
	   for(int i = 0; i < N; i++) sum += arr[i];

	   long min;
	   long total = 0;
	   for(int i = 0; i < N; i++) {
		   
		   sum -= arr[i];
		   min = sum * arr[i];
		   total += min;
	   }
	   
	   System.out.println(total);
   }
}
