import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test07();
	}

   public static void test07() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringBuilder sb = new StringBuilder();
	   int N = Integer.parseInt(br.readLine());
	   
	   long[] file = new long[N];
	   StringTokenizer st = new StringTokenizer(br.readLine());
	   for(int i = 0; i < N; i++) file[i] = Integer.parseInt(st.nextToken());
	   long cluster = Integer.parseInt(br.readLine());
		   
	   long ans = 0;
	   for(int i = 0; i < N; i++) {
		   if(file[i] != 0) {
			   
			   if(file[i] <= cluster) ans += cluster;
			   else ans += (file[i] % cluster == 0) ? (file[i] / cluster) * cluster : (file[i] / cluster + 1) * cluster;
		   }
	   }
	   
	   System.out.println(ans);
	   
   }
}
