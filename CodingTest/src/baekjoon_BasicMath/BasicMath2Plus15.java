package baekjoon_BasicMath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BasicMath2Plus15 {

   public static void main(String[] args) throws IOException {
      test10();
   }
   
   // A Simple Problem.
   public static void test01() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int T = Integer.parseInt(br.readLine());
      for(int i = 0; i < T; i++) {
    	  int N = Integer.parseInt(br.readLine());
    	  
    	  long answer = (long)Math.pow(N, 2);
    	  
    	  System.out.println(answer);
      }
   }
   
   // Majestic 10 
   public static void test02() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   int N = Integer.parseInt(br.readLine());
	   
	   for(int i = 0; i < N; i++) {
		   StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		   int[] arr = new int[3];

		   int a = Integer.parseInt(st.nextToken());
		   int b = Integer.parseInt(st.nextToken());
		   int c = Integer.parseInt(st.nextToken());
		   arr[0] = a;
		   arr[1] = b;
		   arr[2] = c;
			   
		   Arrays.sort(arr);
		   String str = "";
		   
		   if(arr[0] < 10 && arr[1] < 10 && arr[2] < 10) {
			   str = "zilch";
		   } else if(arr[0] < 10 && arr[1] < 10 && arr[2] >= 10) {
			   str = "double";
		   } else if(arr[0] < 10 && arr[1] >= 10 && arr[2] >= 10) {
			   str = "double-double";
		   } else if(arr[0] >= 10 && arr[1] >= 10 && arr[2] >= 10) {
			   str = "triple-double";
		   }
		   
		   StringBuilder sb = new StringBuilder();
		   sb.append(a + " " + b + " " + c + "\n" + str + "\n");
		   
		   System.out.println(sb);
	   }
   }

   // Electric Bill
   public static void test03() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st = new StringTokenizer(br.readLine(), " ");
      
      int A = Integer.parseInt(st.nextToken());
      int B = Integer.parseInt(st.nextToken());
      
      int T = Integer.parseInt(br.readLine());
      
      for(int i = 0; i < T; i++) {
    	  int total = Integer.parseInt(br.readLine());
    	  
    	  StringBuilder sb = new StringBuilder();
    	  int pay = 0;
    	  if(total <= 1000) {
    		  pay = total*A;
    	  } else {
    		  pay = ((total-1000)*B) + (1000*A);
    	  }
    	  
    	  sb.append(total + " " + pay + "\n");
    	  System.out.print(sb);
      }
   }

   // Divide the Cash
   public static void test04() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st = new StringTokenizer(br.readLine(), " ");
	   
	   int people = Integer.parseInt(st.nextToken());
	   int money = Integer.parseInt(st.nextToken());
	   int[] arr = new int[people];
	   int total = 0;
	   for(int i = 0; i < people; i++) {
		   int temp = Integer.parseInt(br.readLine());
		   arr[i] = temp;
		   total += temp;
	   }
	   
	   int take = money/total;
	   
	   for(int i = 0; i < arr.length; i++) {
		   System.out.println(arr[i]*take);
	   }
   }
   
   // 대회 or 인턴
   public static void test05() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st  = new StringTokenizer(br.readLine(), " ");

	   int N = Integer.parseInt(st.nextToken());
	   int M = Integer.parseInt(st.nextToken());
	   int K = Integer.parseInt(st.nextToken());
	   
	   for(int i = 0; i < K; i++) {
		   
		   if(N/2 >= M) {
			   N--;
		   } else {
			   M--;
		   }
	   }
	   
	   System.out.println(Math.min(N/2, M));
   }
   
   // 상금 헌터
   public static void test06() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int T = Integer.parseInt(br.readLine());

      for(int i = 0; i < T; i++) {
    	  StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    	  
    	  int A = Integer.parseInt(st.nextToken());
    	  int B = Integer.parseInt(st.nextToken());
    	  int totalPrice = 0;

    	  if(A == 0) {
    		  totalPrice += 0;
    	  } else if(A == 1) {
    		  totalPrice += 5000000;
    	  } else if(A <= 3) {
    		  totalPrice += 3000000;
    	  } else if(A <= 6) {
    		  totalPrice += 2000000;
    	  } else if(A <= 10) {
    		  totalPrice += 500000;
    	  } else if(A <= 15) {
    		  totalPrice += 300000;
    	  } else if(A <= 21) {
    		  totalPrice += 100000;
    	  }
    	  
    	  if(B == 0) {
    		  totalPrice += 0;
    	  } else if(B == 1) {
    		  totalPrice += 5120000;
    	  } else if(B <= 3) {
    		  totalPrice += 2560000;
    	  } else if(B <= 7) {
    		  totalPrice += 1280000;
    	  } else if(B <= 15) {
    		  totalPrice += 640000;
    	  } else if(B <= 31) {
    		  totalPrice += 320000;
    	  }
    	  
    	  System.out.println(totalPrice);
      }
   }
   
   // 수도요금
   public static void test07() throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       int A = Integer.parseInt(br.readLine());
       int B = Integer.parseInt(br.readLine());
       int C = Integer.parseInt(br.readLine());
       int D = Integer.parseInt(br.readLine());
       int P = Integer.parseInt(br.readLine());

       int PA = P*A;
       int PB = 0;
       if(P < C) {
    	   PB = B;
       } else {
    	   PB = ((P-C)*D) + B;
       }
       System.out.println(Math.min(PA, PB));
   }
   
   // 주사위 게임
   public static void test08() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   int n = Integer.parseInt(br.readLine());
	   
	   int AP = 100;
	   int BP = 100;
	   for(int i = 0; i < n; i++) {
		   StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		   int a = Integer.parseInt(st.nextToken());
		   int b = Integer.parseInt(st.nextToken());
		   
		   if(a > b) {
			   BP -= a;
		   } else if(a < b) {
			   AP -= b;
		   } 
	   }
	   
	   System.out.println(AP);
	   System.out.println(BP);
   }
   
   // 앵그리 창영
   public static void test09() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st = new StringTokenizer(br.readLine(), " ");
      int N = Integer.parseInt(st.nextToken());
      int W = Integer.parseInt(st.nextToken());
      int H = Integer.parseInt(st.nextToken());
      double Z = Math.sqrt((W*W) + (H*H)); 
      
      double box = Math.max(W, Math.max(H, Z));
      for(int i = 0; i < N; i++) {
    	  int length = Integer.parseInt(br.readLine());
    	  if(length > box) {
    		  System.out.println("NE");
    	  } else {
    		  System.out.println("DA");
    	  }
      }
      
   }
   
   // 사분면 
   public static void test10() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   int n = Integer.parseInt(br.readLine());
	   
	   int Q1 = 0;
	   int Q2 = 0;
	   int Q3 = 0;
	   int Q4 = 0;
	   int AXIS = 0;
	   
	   for(int i = 0; i < n; i++) {
		   StringTokenizer st = new StringTokenizer(br.readLine());
		   int x = Integer.parseInt(st.nextToken());
		   int y = Integer.parseInt(st.nextToken());
		   
		   if(x == 0 || y == 0) {
			   AXIS++;
		   } else if(x > 0 && y > 0) {
			   Q1++;
		   } else if(x > 0  && y < 0) {
			   Q4++;
		   } else if(x < 0 && y > 0) {
			   Q2++;
		   } else if(x < 0 && y < 0) {
			   Q3++;
		   }
	   }
	   
	   System.out.println("Q1: " + Q1);
	   System.out.println("Q2: " + Q2);
	   System.out.println("Q3: " + Q3);
	   System.out.println("Q4: " + Q4);
	   System.out.println("AXIS: " + AXIS);
   }



}