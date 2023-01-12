package baekjoon_BasicMath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BasicMath2Plus30 {

   public static void main(String[] args) throws IOException {
      test05();
   }
   
   // 베시와 데이지
   public static void test01() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st;
      
      st = new StringTokenizer(br.readLine());
      int Bx = Integer.parseInt(st.nextToken());
      int By = Integer.parseInt(st.nextToken());

      st = new StringTokenizer(br.readLine());
      int Dx = Integer.parseInt(st.nextToken());
      int Dy = Integer.parseInt(st.nextToken());

      st = new StringTokenizer(br.readLine());
      int Jx = Integer.parseInt(st.nextToken());
      int Jy = Integer.parseInt(st.nextToken());

      int B = Math.max(Math.abs(Jx-Bx), Math.abs(Jy-By));
      int D = Math.abs(Jx-Dx) + Math.abs(Jy-Dy);
    
      if (B == D) System.out.println("tie");
      else if (B < D) System.out.println("bessie");
      else System.out.println("daisy");
      
   }
   
   // 아이들은 사탕을 좋아해
   public static void test02() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st;
      int T = Integer.parseInt(br.readLine());
		
      for(int t = 0; t < T; t++) {
    	  
    	  st = new StringTokenizer(br.readLine());
    	  int n = Integer.parseInt(st.nextToken());
    	  int k = Integer.parseInt(st.nextToken());
    	  int ans = 0;
			
    	  st = new StringTokenizer(br.readLine());
    	  for(int i = 0; i < n; i++) {
    		  ans += Integer.parseInt(st.nextToken()) / k;
    	  }
			
    	  System.out.println(ans);
		
      }
   
   }
   
   // 노솔브 방지문제야!!
   public static void test03() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringBuilder sb = new StringBuilder();
      int q = Integer.parseInt(br.readLine());
     
      while (q --> 0) {
    	  
    	  int a = Integer.parseInt(br.readLine());
    	  if ((a & -a) == a) sb.append(1 + "\n");
          else sb.append(0 + "\n");
    	  
      }
      
      sb.deleteCharAt(sb.length() - 1);
      System.out.print(sb);
   }
   
   // 주식 투자
   public static void test04() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st;
	   int arr[] = new int[3];
	   int T = Integer.parseInt(br.readLine());
		
	   while(T --> 0) {
		
		   int max = 0;
			
		   int N = Integer.parseInt(br.readLine());
			
		   for(int i = 0; i < N; i++){
			
			   st = new StringTokenizer(br.readLine());
				
			   arr[0] = Integer.parseInt(st.nextToken()); 
               
			   arr[1] = Integer.parseInt(st.nextToken());
               
			   arr[2] = Integer.parseInt(st.nextToken());

			   if(arr[0] < 0 && arr[1] < 0 & arr[2] < 0) continue;
				
			   max += Math.max(Math.max(arr[0], arr[1]), arr[2]);

		   }
		   
		   System.out.println(max);
		   
	   }
   }
   
   // Zbiór
   public static void test05() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringBuilder sb = new StringBuilder();
	   StringTokenizer st = new StringTokenizer(br.readLine());
	   
	   int X = Integer.parseInt(st.nextToken());
	   int Y = Integer.parseInt(st.nextToken());
	   int Z = Integer.parseInt(st.nextToken());
	   
	   for(int i = 1; i <= Z; i++) {
		   
		   if(i % X == 0 && i % Y == 0) sb.append("FizzBuzz" + "\n");
		   else if(i % X == 0) sb.append("Fizz" + "\n");
		   else if(i % Y == 0) sb.append("Buzz" + "\n");
		   else sb.append(i + "\n");
	   }
	   
	   sb.deleteCharAt(sb.length() - 1);
	   System.out.print(sb);
   }
   
   // Viva la Diferencia
   public static void test06() throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringTokenizer st;
       String input = "";
       
       while(!(input = br.readLine()).equals("0 0 0 0")) {
    	   st = new StringTokenizer(input);
    	   int A = Integer.parseInt(st.nextToken());
    	   int B = Integer.parseInt(st.nextToken());
    	   int C = Integer.parseInt(st.nextToken());
    	   int D = Integer.parseInt(st.nextToken());
    	   
    	   int cnt = 0;
    	   
    	   while(!(A == B && B == C && C == D)) {
    		   int temp = A;
    		   A = Math.abs(A - B);
    		   B = Math.abs(B - C);
    		   C = Math.abs(C - D);
    		   D = Math.abs(D - temp);
    		   cnt++;
    	   }
    	   
    	   System.out.println(cnt);
       }
   }
   
   // 루트
   public static void test07() throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringTokenizer st;
       
       int B;
       int N;
       while (true) {
    	   
    	   st = new StringTokenizer(br.readLine());
           B = Integer.parseInt(st.nextToken());
           N = Integer.parseInt(st.nextToken());
           if (B == 0 && N == 0) break;

           int i = 0;
           
           while (Math.pow(i, N) < B) i++;
           
           int i_N = (int) Math.pow(i, N);
           int i_1_N = (int) Math.pow(i - 1, N);
           System.out.println((i_N - B < B - i_1_N) ? i : i - 1);

       }
       
   }
   
   // Bedtime Reading, I
   public static void test08() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   int I = Integer.parseInt(br.readLine());
	   
	   long sum = 0;
	   for(int i = 1; i <= I; i++) 
		   if(I % i == 0) sum += i;
	   
	   System.out.println(sum);
   }
   
   // What is n, Daddy?
   public static void test09() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   int N = Integer.parseInt(br.readLine());
	   
	   int cnt = 0;
	   for(int i = 0; i <= 5; i++) {
		   
		   for(int j = i; j <= 5; j++) {
			   
			   if(i + j == N) {
				   cnt++;
			   }
		   }
	   }
	   
	   System.out.println(cnt);
   }
   
   // Tax 
   public static void test10() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringBuilder sb = new StringBuilder();
	   double input = -1;
	   
	   while((input = Integer.parseInt(br.readLine())) != 0) {
		   if(input <= 1000000) {
			   sb.append((int)input + "\n");
		   } else if(input <= 5000000) {
			   sb.append((int)(input - (input * 10.0 / 100.0))).append("\n");
		   } else {
			   sb.append((int)(input - (input * 20.0 / 100.0))).append("\n");
		   }
	   }

	   sb.deleteCharAt(sb.length() - 1);
	   System.out.print(sb);
	   
	   
   }
   
}