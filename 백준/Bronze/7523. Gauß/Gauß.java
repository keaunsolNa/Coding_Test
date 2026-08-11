import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test10();
	}

   public static void test10() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringBuilder sb = new StringBuilder();
	   int T = Integer.parseInt(br.readLine());
	   int idx = 1;
	   while(T --> 0) {
		   StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		   
		   sb.append("Scenario #").append(idx).append(":");
		   long N = Long.parseLong(st.nextToken());
		   long M = Long.parseLong(st.nextToken());
		   
		   long sum = M * (M + 1) / 2;
		   
		   if(N < 0) sum -= Math.abs(N) * (Math.abs(N) + 1) / 2;
		   else sum -= (N-1) * N / 2;
		   
		   sb.append("\n");
		   sb.append(sum);
		   sb.append("\n");
		   sb.append("\n");
		   idx++;
	   }
	   
	   sb.deleteCharAt(sb.length()-1);
	   sb.deleteCharAt(sb.length()-1);
	   System.out.print(sb);
	   
   }
}
