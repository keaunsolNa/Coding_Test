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
		test04();
	}

   public static void test04() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringBuilder sb = new StringBuilder();
	   
	   int T = Integer.parseInt(br.readLine());
	   StringTokenizer st = new StringTokenizer(br.readLine());
	   
       int[] answer = new int[80001];
       answer[10] = 25;
       int tmp = 25;
	   
       for (int i = 11; i <= 80000; i++) {
    	   
    	   if (i % 3 == 0 || i % 7 == 0) {
               answer[i] = tmp + i;
               tmp = answer[i];
           }
         
    	   else answer[i] = tmp;

       }
	   
       for (int i = 0; i < T; i++) {
           int n = Integer.parseInt(st.nextToken());
           sb.append(answer[n] + "\n");
       }
       
       System.out.println(sb);	   
   }
}
