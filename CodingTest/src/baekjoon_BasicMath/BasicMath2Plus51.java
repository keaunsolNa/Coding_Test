package baekjoon_BasicMath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class BasicMath2Plus51 {

   public static void main(String[] args) throws IOException {
      test02();
   }
	
   // 18795번 - 이동하기 3
   public static void test01() throws IOException {
	   
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st = new StringTokenizer(br.readLine());
	   int N = Integer.parseInt(st.nextToken());
	   int M = Integer.parseInt(st.nextToken());
	   
	   long sum = 0;
	   st = new StringTokenizer(br.readLine());
	   for(int i = 0; i < N; i++) sum += Integer.parseInt(st.nextToken());
	   st = new StringTokenizer(br.readLine());
	   for(int i = 0; i < M; i++) sum += Integer.parseInt(st.nextToken());
	   
	   System.out.println(sum);
   }
   
   // 22950번 - 이진수 나눗셈
   public static void test02() throws IOException {
	   
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   
	   int N = Integer.parseInt(br.readLine());
	   String M = br.readLine();
	   M = M.replaceFirst("^0+(?!$)", "");	   
	   int K = Integer.parseInt(br.readLine());
	   
	   if(!M.contains("1")) {
		   System.out.println("YES");
		   System.exit(0);
	   }
	   
	   if(K == 0) {
		   System.out.println("YES");
		   System.exit(0);
	   }
	   
	   int count = 0;
	   for(int i = M.length() - 1; i >= 0; i--) {
		   
		   if(M.charAt(i) == '1') break;
		   if(M.charAt(i) == '0') count++;
	   }
	   
	   if(count >= K) System.out.println("YES");
	   else System.out.println("NO");
	   
   }
   
   //
   public static void test03() throws IOException {
	   
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st = new StringTokenizer(br.readLine());
   }
   
   

}