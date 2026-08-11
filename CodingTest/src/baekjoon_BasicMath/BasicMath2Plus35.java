package baekjoon_BasicMath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class BasicMath2Plus35 {

   public static void main(String[] args) throws IOException {
      test05();
   }
   
   
   // Сапсан 
   public static void test05() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   
	   int N = Integer.parseInt(br.readLine());
	   
	   System.out.println(N / 6 * 4);
   }
   
   // カレー作り
   public static void test06() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st;
	   List<Integer> res = new ArrayList<>();
	   
	   while(true) {
		   
		   st = new StringTokenizer(br.readLine());
		   int R0 = Integer.parseInt(st.nextToken());
		   int W0 = Integer.parseInt(st.nextToken());
		   int C = Integer.parseInt(st.nextToken());
		   int R = Integer.parseInt(st.nextToken());
		   
           if (R0 == 0 && W0 == 0 && C == 0 && R == 0) break;

           if (W0 * C <= R0) res.add(0);
           else res.add((W0 * C - R0 + R - 1) / R);
           
	   }
	   
	   for (Integer integer : res) 
		   System.out.println(integer);
	   
   }
   
   
   // Лифт 
   public static void test09() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st = new StringTokenizer(br.readLine());
	   
	   int n = Integer.parseInt(st.nextToken());
	   int k = Integer.parseInt(st.nextToken());
	   int a = Integer.parseInt(st.nextToken());
	   int b = Integer.parseInt(st.nextToken());
	   
	   int ele = (k - 1) * b + ((n - 1) * b);
	   int walk = (n - 1) * a;
	   System.out.println(ele + " " + walk);
   }
   
   
}