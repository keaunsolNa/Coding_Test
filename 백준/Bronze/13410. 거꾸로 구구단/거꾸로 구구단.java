import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test07();
	}

   public static void test07() throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringTokenizer st = new StringTokenizer(br.readLine());
       
       int N = Integer.parseInt(st.nextToken());
       int K = Integer.parseInt(st.nextToken());
       int max = Integer.MIN_VALUE;
       
       for(int i = 1; i <= K; i++) {
    	   int base = N * i;
    	   int reverse = Integer.parseInt(new StringBuilder(String.valueOf(base)).reverse().toString());
    	   
    	   max = Math.max(max, reverse);
       }
       
       System.out.println(max);
   }
}
