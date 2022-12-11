package baekjoon_BasicMath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BasicMath2Plus19 {

   public static void main(String[] args) throws IOException {
      test10();
   }
   
   // 방어율 무시 계산하기
   public static void test01() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int N = Integer.parseInt(br.readLine());
      
      double percent = 0;
      StringTokenizer st = new StringTokenizer(br.readLine());
      StringBuilder sb = new StringBuilder();
      
      while (N --> 0) {
          int cur = Integer.parseInt(st.nextToken());
          percent = cur + percent - percent*cur/100;
          sb.append(percent).append('\n');
      }
      System.out.print(sb);
      
      
   }
   
   // 분수좋아해?
   public static void test02() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   
	   String input = "";
	   StringBuilder sb = new StringBuilder();
	   while(!(input = br.readLine()).equals("0 0")) {
		   int A = Integer.parseInt(input.split(" ")[0]);
		   int B = Integer.parseInt(input.split(" ")[1]);
		   
		   sb.append(A/B).append(" ").append(A%B).append(" / ").append(B).append("\n");
	   }
	   
	   sb.deleteCharAt(sb.length() - 1);
	   System.out.print(sb);
   }

   // 다음수
   public static void test03() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringBuilder sb = new StringBuilder();
      StringTokenizer st;
      String input = "";
      
      while(!(input = br.readLine()).equals("0 0 0")) {
    	  st = new StringTokenizer(input, " ");
    	  int a1 = Integer.parseInt(st.nextToken());
    	  int a2 = Integer.parseInt(st.nextToken());
    	  int a3 = Integer.parseInt(st.nextToken());
    	  
    	  if(a2 - a1 == a3 - a2) {
    		  sb.append("AP ").append(a3 + (a2 - a1)).append("\n");
    	  } else {
    		  sb.append("GP ").append(a3 * (a2 / a1)).append("\n");
    	  }
      }
      
      sb.deleteCharAt(sb.length() - 1);
      System.out.println(sb);
      
   }

   // 수찬은 마린보이야!!
   public static void test04() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   int N = Integer.parseInt(br.readLine());
	   br.readLine();
	   
	   if(N == 0) {
		   System.out.println("divide by zero");
	   } else {
		   System.out.println("1.00");
	   }
   }
   
   // 전체 계산 횟수
   public static void test05() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st = new StringTokenizer(br.readLine(), " ");
	   int N = Integer.parseInt(st.nextToken());
	   int M = Integer.parseInt(st.nextToken());
	   int answer = N;
	   
	   while(true) {
		   answer += N / M;
		   N /= M;
		   
		   if(N < M)break;
	   }
	   
	   System.out.println(answer);
	   
	   
   }
   
   // 괴짜 교수
   public static void test06() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringBuilder sb = new StringBuilder();
      StringTokenizer st;
      int T = Integer.parseInt(br.readLine());
      
      for(int i = 0; i < T; i++) {
    	  st = new StringTokenizer(br.readLine(), " ");
    	  long A = Integer.parseInt(st.nextToken());
    	  long B = Integer.parseInt(st.nextToken());
    	  long C = Integer.parseInt(st.nextToken());
    	  long D = Integer.parseInt(st.nextToken());
    	  
    	  if(B*C > B*D + A) {
    		  sb.append("parallelize");
    	  } else if(B*C < B*D + A) {
    		  sb.append("do not parallelize");
    	  } else {
    		  sb.append("does not matter");
    	  }
    	  
    	  if(i < T-1) sb.append("\n");
      }
      
      System.out.print(sb);
      
   }
   
   // 등차수열에서 항 번호 찾기
   public static void test07() throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringTokenizer st = new StringTokenizer(br.readLine(), " ");
       int a = Integer.parseInt(st.nextToken());
       int d = Integer.parseInt(st.nextToken());
       int k = Integer.parseInt(st.nextToken());
       
       if((k-a)/d >= 0 && (k-a)%d == 0) {
    	   System.out.println((k-a)/d + 1);
       } else {
    	   System.out.println("X");
       }
   }
   
   // 다면체
   public static void test08() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st;
	   int T = Integer.parseInt(br.readLine());
	   
	   for(int i = 0; i < T; i++) {
		   st = new StringTokenizer(br.readLine(), " ");
		   int V = Integer.parseInt(st.nextToken());
		   int E = Integer.parseInt(st.nextToken());
		   System.out.println(Math.abs(V - E - 2));
	   }
   }
   
   // 할로윈의 사탕
   public static void test09() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringBuilder sb = new StringBuilder();
      StringTokenizer st;
      int T = Integer.parseInt(br.readLine());
      
      for(int i = 0; i < T; i++) {
    	  st = new StringTokenizer(br.readLine(), " ");
    	  int c = Integer.parseInt(st.nextToken());
    	  int v = Integer.parseInt(st.nextToken());
    	  
    	  sb.append("You get ").append(c/v).append(" piece(s) and your dad gets ").append(c%v).append(" piece(s).");
    	  
    	  if(i < T-1) sb.append("\n");
      }
      
      System.out.println(sb);
   }
   
   // 꼬리를 무는 숫자 나열
   public static void test10() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st = new StringTokenizer(br.readLine(), " ");
	   
	   int a = Integer.parseInt(st.nextToken());
	   int b = Integer.parseInt(st.nextToken());
	   
       int x1 = (a - 1) / 4 + 1;
       int x2 = (b - 1) / 4 + 1;
       int y1 = (a - 1) % 4;
       int y2 = (b - 1) % 4;	   
       
       System.out.println(Math.abs(x2 - x1) + Math.abs(y2 - y1));
   }
}