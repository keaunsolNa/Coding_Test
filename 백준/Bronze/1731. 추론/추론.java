import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test02();
	}

   public static void test02() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int N = Integer.parseInt(br.readLine());
      long[] arr = new long[N];
      
      for(int i = 0; i < N; i++) arr[i] = Long.parseLong(br.readLine());
      
      if(arr[2] - arr[1] == arr[1] - arr[0]) System.out.println(arr[N-1] + (arr[1] - arr[0]));
      else System.out.println(arr[N-1] * (arr[1]/arr[0]));
   }
}
