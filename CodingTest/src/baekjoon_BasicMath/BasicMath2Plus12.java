package baekjoon_BasicMath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class BasicMath2Plus12 {

   public static void main(String[] args) throws IOException {
      test10();
   }
   
   
   // Patyki
   public static void test02() throws IOException {
      
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st = new StringTokenizer(br.readLine(), " ");
	   int[] arr = new int[3];
	   for(int i = 0; i < 3; i++) {
		   arr[i] = Integer.parseInt(st.nextToken());
	   }
	   
	   Arrays.sort(arr);
	   
	   if(arr[0] == arr[1] && arr[0] == arr[2]) {
		   System.out.println(2);
	   } else if ((arr[0] * arr[0]) + (arr[1] * arr[1]) == arr[2] * arr[2]) {
		   System.out.println(1);
	   } else {
		   System.out.println(0);
	   }
	   
   }


   // Изгороди 
   public static void test06() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int N = Integer.parseInt(br.readLine());
      double A = Integer.parseInt(br.readLine());
      
      double D1 = (180 - A) / 2;
      double D2 = A / 2;
      System.out.println(Math.round(D1 + D2));
   }
   
   
   // ПЧЕЛИЧКАТА МАЯ
   public static void test09() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st = new StringTokenizer(br.readLine(), " ");
      
      int A = Integer.parseInt(st.nextToken());
      int B = Integer.parseInt(st.nextToken());
      int C = Integer.parseInt(st.nextToken());
      
      System.out.println((B-A) + (C-B));
      
   }
   
   // ГРАДИНА
   public static void test10() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   int w1 = Integer.parseInt(br.readLine());
	   int h1 = Integer.parseInt(br.readLine());
	   int w2 = Integer.parseInt(br.readLine());
	   int h2 = Integer.parseInt(br.readLine());
	   
	   int w = Math.max(w1, w2)*2;
	   int h = (h1+h2)*2;
	   System.out.println(4+w+h);
	   
   }


}