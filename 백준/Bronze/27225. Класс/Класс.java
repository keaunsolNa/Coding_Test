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
		test05();
	}

   public static void test05() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringBuilder sb = new StringBuilder();
	   int m = Integer.parseInt(br.readLine());
	   int f = Integer.parseInt(br.readLine());
	   
	   int ans = Math.min(m, f) * 2;
	   
	   if(m > f) ans += ((m - Math.min(m, f)) % 2 == 1) ? 1 : 0;
	   else ans += ((f - Math.min(m, f)) % 2 == 1) ? 1 : 0;
	   
	   System.out.println(ans);
   }
}
