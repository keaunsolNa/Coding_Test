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
	   StringTokenizer st;
	   
	   int T = Integer.parseInt(br.readLine());
	   
	   while(T --> 0) {
		   st = new StringTokenizer(br.readLine());
		   int N = Integer.parseInt(st.nextToken());
		   int D = Integer.parseInt(st.nextToken());
		   
		   int ans = 0;
		   
		   for(int i = 0; i < N; i++) {
			   
			   st = new StringTokenizer(br.readLine());
			   double speed = Integer.parseInt(st.nextToken());
			   double fuel = Integer.parseInt(st.nextToken());
			   double fe = Integer.parseInt(st.nextToken());
			   
			   double can = fuel / fe;
			   if(can * speed >= D) ans++;
			   
		   }
		   
		   System.out.println(ans);
	   }
	   
   }
}
