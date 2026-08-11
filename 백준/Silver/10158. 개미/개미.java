import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test08();
	}

   public static void test08() throws IOException {
	   
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st;

	   st = new StringTokenizer(br.readLine());
	   int W = Integer.parseInt(st.nextToken());
	   int H = Integer.parseInt(st.nextToken());
	   
	   st = new StringTokenizer(br.readLine());
	   int P = Integer.parseInt(st.nextToken());
	   int Q = Integer.parseInt(st.nextToken());
	   
	   int T = Integer.parseInt(br.readLine());
	   
	   P += T % (W * 2);
	   Q += T % (H * 2);
	   if(P > W) P = Math.abs(W * 2 - P);
	   if(Q > H) Q = Math.abs(H * 2 - Q);
	   
	   System.out.println(P + " " + Q);
   }
}
