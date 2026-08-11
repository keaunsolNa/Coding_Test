import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test10();
	}

   public static void test10() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringBuilder sb = new StringBuilder();
	   StringTokenizer st;
	   
	   int k = Integer.parseInt(br.readLine());
	   
	   for(int i = 1; i <= k; i++) {
		   
		   st = new StringTokenizer(br.readLine());
		   int C = Integer.parseInt(st.nextToken());
		   int B = Integer.parseInt(st.nextToken());
		   int n = Integer.parseInt(st.nextToken());
		   int r = Integer.parseInt(st.nextToken());
		   
		   st = new StringTokenizer(br.readLine());
		   boolean[] index = new boolean[C + 1];
		   for(int j = 0; j < B; j++) index[Integer.parseInt(st.nextToken())] = true;
			   
		   long total = 0;
		   for(int j = 0; j < n; j++) {
			   st = new StringTokenizer(br.readLine());
			   int idx = Integer.parseInt(st.nextToken());
			   int pay = Integer.parseInt(st.nextToken());
			   
			   if(index[idx] == true) total += (pay * r / 100);
			   
		   }
		   
		   System.out.println("Data Set " + i + ":");
		   System.out.println(total);
		   System.out.println();
	   }
	   
	   
   }
}
