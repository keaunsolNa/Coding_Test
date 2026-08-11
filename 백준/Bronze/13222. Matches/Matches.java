import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test03();
	}

   public static void test03() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringBuilder sb = new StringBuilder();
	   StringTokenizer st;
	   st = new StringTokenizer(br.readLine());
	   
	   int n = Integer.parseInt(st.nextToken());
	   double w = Integer.parseInt(st.nextToken());
	   double h = Integer.parseInt(st.nextToken());
	   
	   while(n --> 0) {
		   int target = Integer.parseInt(br.readLine());
		   double box = Math.max(w, Math.max(h, Math.sqrt((w * w) + (h * h))));
		   
		   if(target > box) sb.append("NO");
		   else sb.append("YES");
		   
		   sb.append("\n");
	   }
	   
	   System.out.print(sb);
   }
}
