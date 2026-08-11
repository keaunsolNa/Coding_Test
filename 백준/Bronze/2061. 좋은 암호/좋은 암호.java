import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test01();
	}

   public static void test01() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st = new StringTokenizer(br.readLine());
	   boolean[] prime = new boolean[1000001];
	   
	   String PQ = st.nextToken();
	   int K = Integer.parseInt(st.nextToken());
	   int r = Integer.MAX_VALUE;
	   
	   for(int i = 2; i <= 1000000; i++) {
		   
		   if(prime[i]) continue;
		   for(int j = i + i; j <= 1000000; j += i) prime[j] = true;
		   
	   }
	   
       for (int i = 2; i <= K; i++) {
    	   
           if (prime[i]) continue;
           int m = 0;
           
           for (int j = 0; j < PQ.length(); j++) m = (m * 10 + PQ.charAt(j) - '0') % i;
           
           if (m == 0) {
               r = i;
               break;
           }
       }
       
       if (r < K) System.out.println("BAD " + r);
       else System.out.println("GOOD");
   }
}
