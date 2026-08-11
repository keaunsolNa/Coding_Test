package baekjoon_BasicMath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BasicMath2Plus46 {

   public static void main(String[] args) throws IOException {
      test09();
   }
   
   
   // 18512 - 점프 점프
   public static void test09() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st = new StringTokenizer(br.readLine());	   
	   
	   int X = Integer.parseInt(st.nextToken());
	   int Y = Integer.parseInt(st.nextToken());
	   int a = Integer.parseInt(st.nextToken());
	   int b = Integer.parseInt(st.nextToken());
	   
	   int cnt = 0;
	   int xp = a;
	   int yp = b;
	   
	   while(cnt < 100) {
		   
		   if(xp == yp) break;
			   
		   if(xp > yp) yp += Y;
		   else xp += X;
		   
		   cnt++;
	   }
	   
	   if(xp == yp) System.out.println(xp);
	   else System.out.println(-1);
   }
   
   
}