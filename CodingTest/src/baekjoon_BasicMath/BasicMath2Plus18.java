package baekjoon_BasicMath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BasicMath2Plus18 {

   public static void main(String[] args) throws IOException {
      test02();
   }
   
   
   // 도미노
   public static void test02() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   int N = Integer.parseInt(br.readLine());
	   int sum = 0;
	   for(int i = 0; i <= N; i++) {
		   sum += (3 * i + N) * (N - i + 1) /2;
	   }
	   System.out.println(sum);
   }


}