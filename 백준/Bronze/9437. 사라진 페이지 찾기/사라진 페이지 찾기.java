import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test05();
	}

   public static void test05() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st;
	  
	   while(true) {
		   
		   st = new StringTokenizer(br.readLine());
		   
		   int N = Integer.parseInt(st.nextToken());
		   if(N == 0) break;
		   int P = Integer.parseInt(st.nextToken());
		   
		   int[] arr = new int[3];
		   int one = (P % 2 == 0) ? P - 1 : P + 1;
		   arr[0] = one;
		   arr[1] = (P % 2 == 0) ? N - P + 1 : N - P;
		   arr[2] = (P % 2 == 0) ? N - P + 2 : N - P + 1;
		   
		   Arrays.sort(arr);
		   
		   for (int i : arr) System.out.print(i + " ");
		   System.out.println();
	   }
	   
	   
   }
}
