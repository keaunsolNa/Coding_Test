import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test02();
	}

   public static void test02() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st;
	   
	   int N = Integer.parseInt(br.readLine());
	   
	   int[] arr = new int[N];
	   st = new StringTokenizer(br.readLine());
	   for(int i = 0; i < N; i++) arr[i] = Integer.parseInt(st.nextToken());

	   long total = 0;
	   long elseTotal = 0;
	   st = new StringTokenizer(br.readLine());
	   for(int i = 0; i < N; i++) {
		   
		   total += arr[i];
		   elseTotal += (Integer.parseInt(st.nextToken()) == 1) ? 0 : arr[i];
	   }
	   
	   System.out.println(total);
	   System.out.println(elseTotal);
   }
}
