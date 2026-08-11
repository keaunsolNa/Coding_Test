package baekjoon_BasicMath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BasicMath2Plus33 {

   public static void main(String[] args) throws IOException {
      test10();
   }
   
   
   // Math Homework
   public static void test03() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringBuilder sb = new StringBuilder();
	   StringTokenizer st = new StringTokenizer(br.readLine());
	   
	   int b = Integer.parseInt(st.nextToken());
	   int d = Integer.parseInt(st.nextToken());
	   int c = Integer.parseInt(st.nextToken());
	   int l = Integer.parseInt(st.nextToken());
	   
	   for(int i = 0; i <= l; i++) {
		   
		   for(int j = 0; j <= l; j++) {
			   
			   for(int q = 0; q <= l; q++) {
				   
				   if((i * b) + (j * d) + (q * c) == l) sb.append(i + " " + j + " " + q + "\n");
			   }
		   }
	   }
	   
	   if(sb.length() == 0) System.out.println("impossible");
	   else System.out.println(sb);
   }
   
   // БОЯДИСВАНЕ НА ОГРАДА
   public static void test04() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringBuilder sb = new StringBuilder();
	   StringTokenizer st = new StringTokenizer(br.readLine());
	   
	   int A = Integer.parseInt(st.nextToken());
	   int B = Integer.parseInt(st.nextToken());
	   int C = Integer.parseInt(st.nextToken());
	   int D = Integer.parseInt(st.nextToken());

	   boolean[] pence = new boolean [1000000000];
	   for(int i = Math.min(A, B); i <= Math.max(A, B); i++) pence[i] = true;
	   for(int i = Math.min(C, D); i <= Math.max(C, D); i++) pence[i] = true;
	   
	   int ans = 0;
	   for(int i = 0; i < pence.length; i++) if(pence[i] == true) ans++;
	   
	   System.out.println(ans);
		   
   }
   
   // Пары 
   public static void test05() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringBuilder sb = new StringBuilder();
	   StringTokenizer st = new StringTokenizer(br.readLine());
	  
	   int A = Integer.parseInt(st.nextToken());
	   int B = Integer.parseInt(st.nextToken());
	   int C = Integer.parseInt(st.nextToken());
	   int D = Integer.parseInt(st.nextToken());
	   
	   System.out.println(Math.max((A * B + C * D), Math.max(A * C + B * D, A * D + B * C)));
	   
   }
   
   // Sums 
   public static void test06() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringBuilder sb = new StringBuilder();
	   int T = Integer.parseInt(br.readLine());
	   
	   while(T --> 0) {
		   int number = Integer.parseInt(br.readLine());
		   
		   long sum1 = 0;
		   long sum2 = 0;
		   long sum3 = 0;
		   
		   for(int i = 1; i <= number; i++) sum1 += i;
		   for(int i = 1; i <= number * 2; i += 2) sum2 += i;
		   for(int i = 2; i <= number * 2; i += 2) sum3 += i;
		   
		   sb.append(sum1 + " " + sum2 + " " + sum3 + "\n");
		   
	   }
	   
	   System.out.println(sb);
   }
   
   
   // ПЪТУВАНЕ 
   public static void test10() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringBuilder sb = new StringBuilder();
	   StringTokenizer st; 
	   st = new StringTokenizer(br.readLine());
	   int t1 = Integer.parseInt(st.nextToken());
	   int t2 = Integer.parseInt(st.nextToken());
	   
	   int startTime = t1 * 60 + t2;
	   
	   int t3 = Integer.parseInt(br.readLine());
	   st = new StringTokenizer(br.readLine());
	   int t4 = Integer.parseInt(st.nextToken());
	   int t5 = Integer.parseInt(st.nextToken());
	   
	   int goingTime = t4 * 60 + t5;
	   
	   int stu = Integer.parseInt(br.readLine());
	   
	   int t6 = Integer.parseInt(br.readLine());
	   int totalT3 = t6 * (stu + 1);
	   
	   
	   int ansM = startTime -  goingTime - totalT3 - t3 - 10;
	   
	   int H = ansM / 60;
	   int M = ansM % 60;
	   
	   if(H < 10) {
		   
		   if(M < 10) System.out.println("0" + H + " " + "0" + M);
		   else System.out.println("0" + H + " " + M);
		   
	   } else if(M < 10) {
		   
		   System.out.println(H + " 0" + M);
	   } else {
		   
		   System.out.println(H + " " + M);
		   
	   }
	   
   }
   
}