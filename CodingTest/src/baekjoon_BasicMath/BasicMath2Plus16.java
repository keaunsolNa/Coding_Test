package baekjoon_BasicMath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BasicMath2Plus16 {

   public static void main(String[] args) throws IOException {
      test10();
   }
   
   // WARBOY
   public static void test01() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st = new StringTokenizer(br.readLine());
      int A = Integer.parseInt(st.nextToken());
      int B = Integer.parseInt(st.nextToken());
      int C = Integer.parseInt(st.nextToken());
      
      int performance = B/A;
      
      System.out.println(performance*3*C);
   }
   
   // Larger Sport Facility
   public static void test02() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   int T = Integer.parseInt(br.readLine());

	   for(int i = 0; i < T; i++) {
		   StringTokenizer st = new StringTokenizer(br.readLine());
		   long lt = Integer.parseInt(st.nextToken());
		   long wt = Integer.parseInt(st.nextToken());
		   long le = Integer.parseInt(st.nextToken());
		   long we = Integer.parseInt(st.nextToken());
		   
		   if(lt * wt > le * we) {
			   System.out.println("TelecomParisTech");
		   } else if(lt * wt < le * we) {
			   System.out.println("Eurecom");
		   } else {
			   System.out.println("Tie");
		   }
	   }
	   
   }

   // 정육각형과 삼각형 
   public static void test03() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      
      double L = Integer.parseInt(br.readLine());
      
      double area = (Math.sqrt(3) / 4) * Math.pow(L, 2);
      
      System.out.println(area);
      
   }

   // AFC 윔블던
   public static void test04() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st = new StringTokenizer(br.readLine(), " ");

	   int A = Integer.parseInt(st.nextToken());
	   int B = Integer.parseInt(st.nextToken());
	   
	   if(A < B) {
		   System.out.println("-1");
	   } else {
		   int X = (A+B)/2;
		   int Y = (A-B)/2;
		   if(X + Y == A && X - Y == B) {
			   System.out.println(X + " " + Y);
		   } else {
			   System.out.println("-1");
		   }
	   }
   }
   
   // 2의 제곱인가?
   public static void test05() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	   int N = Integer.parseInt(br.readLine());

	   while(N != 1) {
		   if(N % 2 == 1) {
			   System.out.println(0);
			   return;
		   } 
		   N /= 2;
	   }
	   
	   System.out.println(1);
	   
   }
   
   // 쿠폰
   public static void test06() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int T = Integer.parseInt(br.readLine());
      
      for(int i = 0; i < T; i++) {
    	  double pay = Double.parseDouble(br.readLine());
    	  System.out.print("$");
    	  System.out.printf("%.2f", pay/10*8);
    	  System.out.println();
      }
   }
   
   // 전투 드로이드 가격
   public static void test07() throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       int T = Integer.parseInt(br.readLine());
       
       for(int i = 0; i < T; i++) {
    	   double answer = 0;
    	   StringTokenizer st = new StringTokenizer(br.readLine());
    	   answer += (double)350.34 * Integer.parseInt(st.nextToken());
    	   answer += (double)230.90 * Integer.parseInt(st.nextToken());
    	   answer += (double)190.55 * Integer.parseInt(st.nextToken());
    	   answer += (double)125.30 * Integer.parseInt(st.nextToken());
    	   answer += (double)180.90 * Integer.parseInt(st.nextToken());
    	   System.out.print("$");
    	   System.out.printf("%.2f", answer);
    	   System.out.println();
       }
       
   }
   
   // 서버
   public static void test08() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st = new StringTokenizer(br.readLine());
	   int N = Integer.parseInt(st.nextToken());
	   int T = Integer.parseInt(st.nextToken());
	   int answer = 0;
	   
	   st = new StringTokenizer(br.readLine());
	   for(int i = 0; i < N; i++) {
		   T -= Integer.parseInt(st.nextToken());
		   
		   if(T < 0) {
			   break;
		   }
		   answer++;
	   }
	
	   System.out.println(answer);
   }
   
   // 스타후르츠
   public static void test09() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st = new StringTokenizer(br.readLine(), " ");
      int N = Integer.parseInt(st.nextToken());
      int T = Integer.parseInt(st.nextToken());
      int C = Integer.parseInt(st.nextToken());
      int P = Integer.parseInt(st.nextToken());
      
      System.out.println((N-1) / T * C * P);
   }
   
   // 더하기 4
   public static void test10() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   int T = Integer.parseInt(br.readLine());
	   
	   for(int i = 0; i < T; i++) {
		   StringTokenizer st = new StringTokenizer(br.readLine());
		   int count = st.countTokens();
		   
		   int sum = 0;
			
		   for(int j = 0; j < count; j++) {
			   sum += Integer.parseInt(st.nextToken());
		   }
		   System.out.println(sum);
	   }
   }



}