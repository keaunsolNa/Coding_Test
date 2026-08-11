package baekjoon_BasicMath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class BasicMath2Plus25 {

   public static void main(String[] args) throws IOException {
      test04();
   }
   
   
   // 더하기 
   public static void test04() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st = new StringTokenizer(br.readLine(), " ");
	   int A = Integer.parseInt(st.nextToken());
	   int B = Integer.parseInt(st.nextToken());
	   
	   System.out.println(A + B);
	   
   }
   
   
   // Simple Collatz Sequence 
   public static void test08() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   long n = Long.parseLong(br.readLine());
	   int cnt = 0;
	   
	   while(n != 1) {
		   
		   if(n % 2 ==0) n /= 2;
		   else n += 1;
		   cnt++;
		   
	   }
	   
	   System.out.println(cnt);
   }
   
   
}