import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test01();
	}

   public static void test01() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringBuilder sb = new StringBuilder();
	   StringTokenizer st;
	   int W = Integer.parseInt(br.readLine());
	   int N = Integer.parseInt(br.readLine());
	   
	   long res = 0;
	   for(int i = 0; i < N; i++) {
		   st = new StringTokenizer(br.readLine());
		   
		   long w = Long.parseLong(st.nextToken());
		   long l = Long.parseLong(st.nextToken());
		   
		   res += w * l;
	   }
	   
	   System.out.println(res / W);
	   
   }
}
