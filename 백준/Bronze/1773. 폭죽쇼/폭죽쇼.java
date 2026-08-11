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
		test08();
	}

   public static void test08() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st = new StringTokenizer(br.readLine());
	   int N = Integer.parseInt(st.nextToken());
	   int C = Integer.parseInt(st.nextToken());
	   
	   boolean[] check = new boolean[C];
	   
	   while(N --> 0) {
		   
		   int term = Integer.parseInt(br.readLine());
		   int idx = 1;
		   while(term*idx <= C) {
			   check[term*idx - 1] = true;
			   idx++;
		   }
	   }
	   
	   int sum = 0;
	   for (boolean b : check) if(b) sum++;
	   
	   System.out.println(sum);
   }
}
