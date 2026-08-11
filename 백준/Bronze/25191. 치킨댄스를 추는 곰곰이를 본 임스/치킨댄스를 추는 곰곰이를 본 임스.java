import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test02();
	}

   public static void test02() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int N = Integer.parseInt(br.readLine());
      StringTokenizer st = new StringTokenizer(br.readLine(), " ");
      int A = Integer.parseInt(st.nextToken());
      int B = Integer.parseInt(st.nextToken());
      int total = 0;

      for(int i = 1; i <= B; i++) {
         if(N - 1 >= 0) {
            N -= 1;
            total++;
         }
      }
      
      for(int i = 2; i <= A; i = i+2) {
         if(N - 1 >= 0) {
            N -= 1;
            total++;
         }
      }
      
      System.out.println(total);
   }
}
