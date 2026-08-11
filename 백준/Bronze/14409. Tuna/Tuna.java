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
		test09();
	}

   public static void test09() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st;
	   
	   int T = Integer.parseInt(br.readLine());
	   int X = Integer.parseInt(br.readLine());
	   
	   int total = 0;
	   for(int i = 0; i < T; i++) {
		   
		   st = new StringTokenizer(br.readLine());
		   int p1 = Integer.parseInt(st.nextToken());
		   int p2 = Integer.parseInt(st.nextToken());
		   
		   if(Math.abs(p1 - p2) > X) 
			   total += Integer.parseInt(br.readLine());
		   
		   else 
			   total += Math.max(p1, p2);
		   
	   }
	   
	   System.out.println(total);
   }
}
