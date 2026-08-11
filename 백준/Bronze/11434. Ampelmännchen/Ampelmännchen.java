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
	   StringBuilder sb = new StringBuilder();
	   
	   int K = Integer.parseInt(br.readLine());
	   
	   for(int i = 1; i <= K; i++) {
		   
		   st = new StringTokenizer(br.readLine());
		   
		   int n = Integer.parseInt(st.nextToken());
		   int W = Integer.parseInt(st.nextToken());
		   int E = Integer.parseInt(st.nextToken());
		   
		   int ans = 0;
		   
		   for(int j = 0; j < n; j++) {
			   st = new StringTokenizer(br.readLine());
			   
			   int a = Integer.parseInt(st.nextToken());
			   int b = Integer.parseInt(st.nextToken());
			   int c = Integer.parseInt(st.nextToken());
			   int d = Integer.parseInt(st.nextToken());
			   
			   
			   ans += Math.max(a * W + c * E, E * d + b * W);
		   }
		   
		   System.out.print("Data Set " +  i + ":");
		   System.out.println();
		   System.out.println(ans);
		   System.out.println();
	   
	   }	   
   }
}
