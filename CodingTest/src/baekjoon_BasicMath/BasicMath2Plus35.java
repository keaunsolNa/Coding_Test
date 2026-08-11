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
      test09();
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