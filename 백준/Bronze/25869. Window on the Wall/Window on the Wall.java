import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test01();
	}

   public static void test01() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringBuilder sb = new StringBuilder();
	   StringTokenizer st = new StringTokenizer(br.readLine());
	   
	   int w = Integer.parseInt(st.nextToken());
	   int h = Integer.parseInt(st.nextToken());
	   int d = Integer.parseInt(st.nextToken()) * 2;
	   
	   if(w >= d && h >= d) System.out.println((w - d) * (h - d));
	   else System.out.println(0);
   }
}
