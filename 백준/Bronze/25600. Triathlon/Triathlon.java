import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test10();
	}

   public static void test10() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   int T = Integer.parseInt(br.readLine());
	   
	   int max = 0;
	   for(int i = 0; i < T; i++) {
		   StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		   
		   int a = Integer.parseInt(st.nextToken());
		   int d = Integer.parseInt(st.nextToken());
		   int g = Integer.parseInt(st.nextToken());
		   
		   int count = a * (d+g);
		   if(a == (d+g)) {
			   count *= 2;
		   }
		   
		   if(max < count) {
			   max = count;
		   }
		   
	   }
	   
	   System.out.println(max);
   }
}
