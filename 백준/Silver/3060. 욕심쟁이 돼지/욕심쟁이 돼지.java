import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test06();
	}

   public static void test06() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringBuilder sb = new StringBuilder();
	   StringTokenizer st;
	   int T = Integer.parseInt(br.readLine());

	   while(T --> 0) {
		   
		   long N = Long.parseLong(br.readLine());
		   int ans = 1;
		   int sum = 0;
			
		   st = new StringTokenizer(br.readLine());
			
			
		   for (int i = 0; i < 6; i++) sum += Integer.parseInt(st.nextToken());
			
		   while(sum <= N) {
			   sum *= 4;
			   ans++;
		   }
		   
		   sb.append(ans + "\n");
	   }
	   
	   System.out.println(sb);
   }
}
