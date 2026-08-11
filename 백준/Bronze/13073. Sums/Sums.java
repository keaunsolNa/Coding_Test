import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test06();
	}

   public static void test06() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringBuilder sb = new StringBuilder();
	   int T = Integer.parseInt(br.readLine());
	   
	   while(T --> 0) {
		   int number = Integer.parseInt(br.readLine());
		   
		   long sum1 = 0;
		   long sum2 = 0;
		   long sum3 = 0;
		   
		   for(int i = 1; i <= number; i++) sum1 += i;
		   for(int i = 1; i <= number * 2; i += 2) sum2 += i;
		   for(int i = 2; i <= number * 2; i += 2) sum3 += i;
		   
		   sb.append(sum1 + " " + sum2 + " " + sum3 + "\n");
		   
	   }
	   
	   System.out.println(sb);
   }
}
