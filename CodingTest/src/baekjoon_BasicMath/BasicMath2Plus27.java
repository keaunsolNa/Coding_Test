package baekjoon_BasicMath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class BasicMath2Plus27 {

   public static void main(String[] args) throws IOException {
      test10();
   }
   
   // 작도하자! - ②
   public static void test01() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st = new StringTokenizer(br.readLine());
      double c = Double.parseDouble(st.nextToken());
      double b = Double.parseDouble(st.nextToken());
      
      if(c%b == 0) System.out.println((int)c/b);
      else System.out.printf("%.10f", c/b);
      
   }
   

   // 방 배정
   public static void test05() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   Map<Integer, Integer> maleMap = new HashMap<>();
	   Map<Integer, Integer> femaleMap = new HashMap<>();
	   StringTokenizer st;
	   
	   st = new StringTokenizer(br.readLine());
	   int N = Integer.parseInt(st.nextToken());
	   int K = Integer.parseInt(st.nextToken());
	   
	   for(int i = 1; i <= 6; i++) {
		   maleMap.put(i, 0);
		   femaleMap.put(i, 0);
	   }
	   
	   for(int i = 0; i < N; i++) {
		   st = new StringTokenizer(br.readLine());
		   
		   int gender = Integer.parseInt(st.nextToken());
		   int grade = Integer.parseInt(st.nextToken());
		   
		   if(gender == 0) femaleMap.put(grade, femaleMap.getOrDefault(grade, 0) + 1);
		   else maleMap.put(grade, maleMap.getOrDefault(grade, 0) + 1);
	   }
	   
	   int sum = 0;
	  
	   for(int i = 1; i <= 6; i++) {
		   
		   if(maleMap.get(i) % K == 0) sum += maleMap.get(i) / K;
		   else sum += maleMap.get(i) / K + 1;
		   
		   if(femaleMap.get(i) % K == 0) sum += femaleMap.get(i) / K;
		   else sum += femaleMap.get(i) / K + 1;
	   } 
	   
	   System.out.println(sum);
	   
   }
   
   
   // 반올림
   public static void test10() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   int T = Integer.parseInt(br.readLine());
	   
	   int target = 10;
	   
	   while(T > target) {

		   int mod = T % target;
		   if (mod * 10 / target >= 5) T += target;
		   T -= mod;
		   target *= 10;
		   
	   }
	
	   System.out.println(T);
   }
}