import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test02();
	}

   public static void test02() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringBuilder sb = new StringBuilder();
	   StringTokenizer st;
	   
	   st = new StringTokenizer(br.readLine());
	   
	   int d1 = Integer.parseInt(st.nextToken());
	   int m1 = Integer.parseInt(st.nextToken());
	   int y1 = Integer.parseInt(st.nextToken());
	   int k = Integer.parseInt(st.nextToken());
	   
	   st = new StringTokenizer(br.readLine());
	   
	   int d2 = Integer.parseInt(st.nextToken());
	   int m2 = Integer.parseInt(st.nextToken());
	   int y2 = Integer.parseInt(st.nextToken());
	   
	   int term = ((y2 - y1) * 360) + ((m2 - m1) * 30) + (d2 - d1);
	   
	   k = (k + term) % 7;
	   
	   if(k == 0) k = 7;
	   
	   System.out.println(k);
	   
   }
}
