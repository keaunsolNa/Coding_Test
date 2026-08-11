import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test04();
	}

   public static void test04() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st;
	   
	   int N = Integer.parseInt(br.readLine());
	   int[] arr = new int[N];
	   
	   st = new StringTokenizer(br.readLine());
	   for(int i = 0; i < N; i++) {
		   int temp = Integer.parseInt(st.nextToken());
		   
		   arr[temp - 1]++;
		   
		   if(arr[temp - 1] > 1) {
			   System.out.println(temp);
			   return;
		   }
	   }
	   
   }
}
