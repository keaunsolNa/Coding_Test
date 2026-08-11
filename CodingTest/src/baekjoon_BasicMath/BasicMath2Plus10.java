package baekjoon_BasicMath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class BasicMath2Plus10 {

   public static void main(String[] args) throws IOException {
      test02();
   }
   
   
   // Арифметическая магия 
   public static void test02() throws IOException {
      
      System.out.println(1);
   }


   // Piece of Cake! 
   public static void test05() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st = new StringTokenizer(br.readLine(), " ");

	   int N = Integer.parseInt(st.nextToken());
	   int H = Integer.parseInt(st.nextToken());
	   int V = Integer.parseInt(st.nextToken());
	   
	   H = Math.max(H, N-H);
	   V = Math.max(V, N-V);
	   System.out.println(H*V*4);
	   
   }
   
   
}