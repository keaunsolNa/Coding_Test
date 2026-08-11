import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test08();
	}

   public static void test08() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	   int N = Integer.parseInt(br.readLine());
	   int[] arr = new int[N];
	   
		   
	   double total = 0;
	   for(int i = 0; i < N; i++) {
		   arr[i] = Integer.parseInt(br.readLine());
		   total += arr[i];
	   }
	   
	   double avr = total / (double) N;
	   total = 0;
	   for(int i = 0; i < N; i++) total += Math.abs(arr[i] - avr);
	   
	   System.out.println((int)(total / 2));
	   
   }
}
