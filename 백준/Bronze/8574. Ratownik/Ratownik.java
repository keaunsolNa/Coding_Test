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
	   StringTokenizer st;
	   
	   st = new StringTokenizer(br.readLine());
	   int n = Integer.parseInt(st.nextToken());
	   int k = Integer.parseInt(st.nextToken());
	   int x = Integer.parseInt(st.nextToken());
	   int y = Integer.parseInt(st.nextToken());
	   
	   int cnt = 0;
	   for(int i = 0; i < n; i++) {

		   st = new StringTokenizer(br.readLine());
		   
		   int x1 = Integer.parseInt(st.nextToken());
		   int y1 = Integer.parseInt(st.nextToken());
		   
		   double dis = (Math.abs(x1 - x) * Math.abs(x1 - x)) + (Math.abs(y1 - y) * Math.abs(y1 - y));
		   dis = Math.sqrt(dis);
		   
		   if(dis > k) cnt++;
	   }
	   
	   System.out.println(cnt);
   }
}
