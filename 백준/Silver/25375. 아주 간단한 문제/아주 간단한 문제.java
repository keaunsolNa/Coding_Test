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
		test08();
	}

   public static void test08() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringBuilder sb = new StringBuilder();
	   StringTokenizer st;
	   
	   int Q = Integer.parseInt(br.readLine());
	   
	   while(Q --> 0) {
		   
		   st = new StringTokenizer(br.readLine());	
		   long a = Long.parseLong(st.nextToken());
		   long b = Long.parseLong(st.nextToken());
		   
		   sb.append(a * 2 <= b && b % a == 0 ? 1 : 0).append("\n");
	   }
	   
	   System.out.print(sb);
   }
}
