import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test01();
	}

   public static void test01() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st = new StringTokenizer(br.readLine(), " ");
      
      int day = Integer.parseInt(st.nextToken());
      int H = Integer.parseInt(st.nextToken());
      int M = Integer.parseInt(st.nextToken());
      
      int t1 = (day*1440) + (H*60) + M;
      int t2 = (11*1440) + (11*60) + 11;
      
      if(t1-t2 < 0) {
         System.out.println(-1);
      } else {
         System.out.println(t1-t2);
      }
   }
}
