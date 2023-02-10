package baekjoon_BasicMath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class BasicMath2Plus43 {

   public static void main(String[] args) throws IOException {
      test10();
   }
   
   // 14914번 - 사과와 바나나 나눠주기
   public static void test01() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringBuilder sb = new StringBuilder();
	   StringTokenizer st = new StringTokenizer(br.readLine());
	   
	   int a = Integer.parseInt(st.nextToken());
	   int b = Integer.parseInt(st.nextToken());
	   
	   for(int i = 1; i <= Math.min(a, b); i++) {
		   
		   if(a % i != 0 || b % i != 0) continue;
		   if(i > a || i > b) break;
		   
		   sb.append(i + " " + a / i + " " + (b / i) + "\n");
	   }
	   
	   System.out.println(sb);
   }
   
   // 11576번 - Base Conversion
   public static void test02() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringBuilder sb = new StringBuilder();
	   StringTokenizer st;
	  
	   st = new StringTokenizer(br.readLine());
       int A = Integer.parseInt(st.nextToken());
       int B = Integer.parseInt(st.nextToken());
       int m = Integer.parseInt(br.readLine());
       
       int[] arr = new int[m + 1];
       st = new StringTokenizer(br.readLine());
       for (int i = 1; i <= m; i++) arr[i] = Integer.parseInt(st.nextToken());
       
       int ten = 0;
       for (int i = 1; i <= m; i++) ten += arr[i] * Math.pow(A, m - i);

       Stack<Integer> stack = new Stack<>();

       while (ten != 0) {
    	   
           stack.push(ten % B);
           ten /= B;

       }

       // 진법 변환
       while (!stack.isEmpty()) {

    	   if (stack.size() == 1) sb.append(stack.peek() + "\n");
           else sb.append(stack.peek() + " ");

           stack.pop();

       }
       
       System.out.println(sb);
	   
   }
   
   // 14491번 - 9진수
   public static void test03() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   int N = Integer.parseInt(br.readLine());
	   String s = Integer.toString(N, 9);
	   
	   System.out.println(s);
   }
   
   // 8741번 - 이진수 합
   public static void test04() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringBuilder sb = new StringBuilder();
	   int k = Integer.parseInt(br.readLine());
	   
       for (int i = 0; i < k; i++) sb.append(1);
       for (int i = 1; i < k; i++) sb.append(0);
	
       System.out.println(sb);

   }
   
   // 8320번 - 직사각형을 만드는 방법
   public static void test05() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	   int n = Integer.parseInt(br.readLine());
	   int cnt = 0;
		
	   for(int i = 1; i < n + 1; i++)
		   for(int j = 1; j <= i; j++)
			   if(i * j <= n) cnt++;

	   System.out.println(cnt);
			   
   }
   
   // 16283번 - Farm
   public static void test06() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringBuilder sb = new StringBuilder();
	   StringTokenizer st = new StringTokenizer(br.readLine());
	   
	   int a = Integer.parseInt(st.nextToken());
	   int b = Integer.parseInt(st.nextToken());
	   int n = Integer.parseInt(st.nextToken());
	   int w = Integer.parseInt(st.nextToken());
	   
	   int cnt = 0;
	   for(int i = 1; i < n; i++) {
		   
		   for(int j = 1; j < n; j++) {
			   if(i + j != n) continue;
			   if(i * a + j * b == w) {
				   sb.append(i + " " + j);
				   cnt++;
			   }
			   
		   }
		   
		   if(cnt > 1) break;
	   }
	   
	   if(cnt == 1) System.out.println(sb);
	   else System.out.println(-1);
   }
   
   // 16462번 - '나교수' 교수님의 악필
   public static void test07() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   int N = Integer.parseInt(br.readLine());
	   
	   int total = 0;
	   for(int i = 0; i < N; i++) {

		   String temp = br.readLine().replaceAll("0|6|9", "9");
		   int point = (Integer.parseInt(temp) > 100) ? 100 : Integer.parseInt(temp);
		   total += point;
		   
	   }
	   double ave = (double)total / N;
	   System.out.println((int)Math.round(ave));
   }
   
   // 5919번 - Hay Bales
   public static void test08() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	   int N = Integer.parseInt(br.readLine());
	   int[] arr = new int[N];
	   
		   
	   double total = 0;
	   for(int i = 0; i < N; i++) {
		   arr[i] = Integer.parseInt(br.readLine());
		   total += arr[i];
	   }
	   
	   double avr = total / (double) N;
	   total = 0;
	   for(int i = 0; i < N; i++) total += Math.abs(arr[i] - avr);
	   
	   System.out.println((int)(total / 2));
	   
   }
   
   // 10448번 - 유레카 이론
   public static void test09() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   
	   int N = Integer.parseInt(br.readLine());
       int[] triNum = new int[45];
       
       for(int i = 1; i < 45; i++) triNum[i] = i * (i + 1) / 2;
       
       for(int i = 0; i < N; i++) {
    	   
           int n = Integer.parseInt(br.readLine());
           
           System.out.println(solove(n, triNum));
       }
   }
   
   public static int solove(int n, int[] triNum) {
	   
       for(int i = 1; i < 45; i++) {
    	   
           for (int j = 1; j < 45; j++) {
        	   
               for (int k = 1; k < 45; k++) {
            	   
                   int sum = triNum[i] + triNum[j] + triNum[k];
                   
                   if (sum == n) return 1;
               }
           }
       }
       
       return 0;
   }
   
   // 
   public static void test10() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st;
	   int i, t = Integer.parseInt(br.readLine());
		
	   while(t -- > 0 ){

		   st = new StringTokenizer(br.readLine());
		   int n = Integer.parseInt(st.nextToken());
		   int m = Integer.parseInt(st.nextToken());

		   long team[] = new long[n + 1];
		   long win[] = new long[n + 1];
		   long lose[] = new long[n + 1];

		   long max = 0;
		   long min = 0;

		   for(i = 1; i <= m; i++) {
			   st = new StringTokenizer(br.readLine());
			   int a = Integer.parseInt(st.nextToken());
			   int b = Integer.parseInt(st.nextToken());
			   int p = Integer.parseInt(st.nextToken());
			   int q = Integer.parseInt(st.nextToken());

			   win[a] += p; 
			   win[b] += q;
			   lose[a] += q; 
			   lose[b] += p;
				
		   }
		   
		   for(i = 1; i <= n; i++) {
			   
			   if(win[i] == 0 && lose[i] == 0) team[i] = 0;
				
			   else team[i] = (win[i] * win[i]) * 1000 / (win[i] * win[i] + lose[i] * lose[i]);
				
			   if(i == 1){
				   min = max = team[i];
				   continue;
			   }
				
			   if (max < team[i]) max = team[i];
			   if (team[i] < min) min = team[i];

		   }
			
			
		   System.out.println(max+"\n"+min);
		
	
	   }

   }
   
}