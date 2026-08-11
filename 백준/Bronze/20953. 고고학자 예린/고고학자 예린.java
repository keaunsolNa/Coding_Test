import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test04();
	}

   public static void test04() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringBuilder sb = new StringBuilder();
	   StringTokenizer st;

	   int T = Integer.parseInt(br.readLine());
	   while(T --> 0) {
		
		   st = new StringTokenizer(br.readLine());
		   long a = Integer.parseInt(st.nextToken());
		   long b = Integer.parseInt(st.nextToken());
		   sb.append((((a + b) * (a + b)) * (a + b - 1) / 2) + "\n");
	   }
	   
	   System.out.println(sb);
   }
}
