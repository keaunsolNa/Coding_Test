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
	   int N = Integer.parseInt(br.readLine());
	   int[] arr = new int[N];
	   int[] answer = new int[N];
	   
	   StringTokenizer st = new StringTokenizer(br.readLine());
	   for(int i = 0; i < N; i++) arr[i] = Integer.parseInt(st.nextToken());
	   
	   int sum = 0;
	   for(int i = 0; i < N; i++) {
		   answer[i] = arr[i] * (i+1) - sum;
		   sum += answer[i];
	   }
	   
	   for (int i : answer) System.out.print(i + " ");
   }
}
