package baekjoon_BasicMath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BasicMath2Plus28 {

   public static void main(String[] args) throws IOException {
      test10();
   }
   
   // Ahmed Aly 
   public static void test01() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringBuilder sb = new StringBuilder();
      StringTokenizer st;
      int T = Integer.parseInt(br.readLine());
      
      for(int i = 1; i <= T; i++) {
    	  
    	  st = new StringTokenizer(br.readLine());
    	  int A = Integer.parseInt(st.nextToken());
    	  String oper = st.nextToken();
    	  int B = Integer.parseInt(st.nextToken());
    	  st.nextToken();
    	  int answer = Integer.parseInt(st.nextToken());
    	  
    	  boolean chk = true;
    	  switch(oper) {
    	  	case "+" : 
    	  		chk = A + B == answer ? true : false;
    	  		break;
    	  	case "-" : 
    	  		chk = A - B == answer ? true : false;
    	  }
    	  
    	  String ans = "YES";
    	  if(!chk) ans = "NO";
    	  
    	  sb.append("Case " + i + ": " + ans + "\n");
    	  
      }
      
      sb.deleteCharAt(sb.length() - 1);
      System.out.print(sb);
   }
   
   // 홀짝 수열
   public static void test02() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int T = Integer.parseInt(br.readLine());
      StringTokenizer st = new StringTokenizer(br.readLine());
      
      int[] odd = new int[T];
      int[] even = new int[T];

      for(int i = 0; i < T; i++) {
    	  int number = Integer.parseInt(st.nextToken());
    	  if(number % 2 != 0) odd[i] = number;
    	  else even[i] = number;
      }
      
      int oddCnt = (T / 2) + (T % 2);
      for (int i : odd) if(i != 0) oddCnt--;
      
      int evenCnt = T / 2;
      for (int i : even) if(i != 0) evenCnt--;

      if(oddCnt == 0 && evenCnt == 0) System.out.println(1);
      else System.out.println(0);
   }
   
   // The REAL Manhattan distance
   public static void test03() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st;
      int T = Integer.parseInt(br.readLine());
      
      while(T --> 0) {
    	  st = new StringTokenizer(br.readLine());
    	  int x1 = Integer.parseInt(st.nextToken());
    	  int y1 = Integer.parseInt(st.nextToken());
    	  int f1 = Integer.parseInt(st.nextToken());
    	  int x2 = Integer.parseInt(st.nextToken());
    	  int y2 = Integer.parseInt(st.nextToken());
    	  int f2 = Integer.parseInt(st.nextToken());

    	  int dis = 0;
    	  
    	  dis += Math.abs(x2 - x1);
    	  dis += Math.abs(y2 - y1);
    	  dis += f1;
    	  dis += f2;
    			  
    	  System.out.println(dis);
      }
   }
   
   // Error Detection
   public static void test04() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st;
	   int T = Integer.parseInt(br.readLine());
	   
	   while(T --> 0) {
		   st = new StringTokenizer(br.readLine());
		   int number = Integer.parseInt(st.nextToken());
		   int evenOrOdd = Integer.parseInt(st.nextToken());
		   
		   String binary = Integer.toBinaryString(number);
		   
		   int chk = 0;
		   for(int i = 0; i < binary.length(); i++) if(binary.charAt(i) == '1') chk++;
		   
		   int check = 0;
		   if(chk % 2 == 0) check = 0;
		   else check = 1;
		   
		   if(evenOrOdd == check) System.out.println("Valid");
		   else System.out.println("Corrupt");
	   }
   }
   
   // 거리의 합
   public static void test05() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   int N = Integer.parseInt(br.readLine());
	   StringTokenizer st = new StringTokenizer(br.readLine());
	   
	   int[] arr = new int[N];
	   for(int i = 0; i < N; i++) arr[i] = Integer.parseInt(st.nextToken());

	   long sum = 0;
	   for(int i = 0; i < N; i++) {
		   
		   for(int j = 0; j < N; j++)  if(i != j) sum += Math.abs(arr[i] - arr[j]);
		   
	   }
	   
	   System.out.println(sum);
	   
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