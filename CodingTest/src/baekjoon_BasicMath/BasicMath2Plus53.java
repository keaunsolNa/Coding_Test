package baekjoon_BasicMath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BasicMath2Plus53 {

   public static void main(String[] args) throws IOException {
      test01();
   }
   
   // 6064번 - 카잉 달력
   public static void test01() throws IOException {
	   
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st;
	   int T = Integer.parseInt(br.readLine());
	   
	   int i, j;
	   for(i = 0; i < T; i++) {
		   st = new StringTokenizer(br.readLine());
		   
		   int M = Integer.parseInt(st.nextToken());
		   int N = Integer.parseInt(st.nextToken());
		   int x = Integer.parseInt(st.nextToken());
		   int y = Integer.parseInt(st.nextToken());
		   
		   int resultYear = LCM(M, N);
		   
		   for(j = x; j <= resultYear; j += M) {
			   
			   int temp = (j % N == 0) ? N : j % N;
	           
			   if (temp == y) {
	           
				   System.out.println(j);
				   break;
			   }
	            
		   }
		   
		   if(j > resultYear) System.out.println(-1);
		   
	   }
	   
   }
   
   private static int GCD(int a, int b){ 
	   
	   if (a%b == 0) return b;
	   return GCD(b, a % b);
   
   }
   
   private static int LCM(int a, int b) {
	   return (a * b) / GCD(a, b);
   }
   
   //
   public static void test02() throws IOException {
	   
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   
	   
   }
   
   //
   public static void test03() throws IOException {
	   
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   
	   
   }
   
   //
   public static void test04() throws IOException {
	   
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   
	   
   }
   
   //
   public static void test05() throws IOException {
	   
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   
	   
   }
   
   
}