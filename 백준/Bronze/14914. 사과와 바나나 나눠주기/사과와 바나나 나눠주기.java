import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test01();
	}

   public static void test01() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringBuilder sb = new StringBuilder();
	   StringTokenizer st = new StringTokenizer(br.readLine());
	   
	   int a = Integer.parseInt(st.nextToken());
	   int b = Integer.parseInt(st.nextToken());
	   
	   for(int i = 1; i <= Math.min(a, b); i++) {
		   
		   if(a % i != 0 || b % i != 0) continue;
		   if(i > a || i > b) break;
		   
		   sb.append(i + " " + a / i + " " + (b / i) + "\n");
	   }
	   
	   System.out.println(sb);
   }
}
