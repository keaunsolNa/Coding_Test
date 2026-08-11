import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test01();
	}

   public static void test01() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st;
	   StringBuilder sb = new StringBuilder();

	   int N = Integer.parseInt(br.readLine());
	   int[] arr = new int[N];
	   
	   st = new StringTokenizer(br.readLine());
	   for(int i = 0; i < N; i++)arr[i] = Integer.parseInt(st.nextToken());
	   
	   for(int m = 1; ; m++) {
		   
		   for(int k = 0; k < m; k++) {
			   int cnt = 0;
			   
			   for(int i = 0; i < N; i++) {
				   
				   if(arr[i] % m == k) cnt++;
			   }
			   
			   if(cnt >= N / 2) {
				   System.out.println(m + " " + k);
				   return;
			   }
		   }
	   }
   }
}
