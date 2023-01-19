package baekjoon_BasicMath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BasicMath2Plus32 {

   public static void main(String[] args) throws IOException {
      test10();
   }
   
   // Робинзон Крузо
   public static void test01() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringBuilder sb = new StringBuilder();
      
      int N = Integer.parseInt(br.readLine());
      for(int i = 0; i < N / 5; i++) sb.append("V");
      for(int i = 0; i < N % 5; i++) sb.append("I");
      
      System.out.println(sb);
   }
   
   // 삼각 무늬 - 2
   public static void test02() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringBuilder sb = new StringBuilder();
	   StringTokenizer st;
	   
	   int T = Integer.parseInt(br.readLine());
	   
	   while(T --> 0) {
		   st = new StringTokenizer(br.readLine());
		   long A = Integer.parseInt(st.nextToken());
		   long B = Integer.parseInt(st.nextToken());
		
		   sb.append((A / B) * (A / B) + "\n");
	   }
	   
	   System.out.print(sb);
   }
   
   // Matches 
   public static void test03() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringBuilder sb = new StringBuilder();
	   StringTokenizer st;
	   st = new StringTokenizer(br.readLine());
	   
	   int n = Integer.parseInt(st.nextToken());
	   double w = Integer.parseInt(st.nextToken());
	   double h = Integer.parseInt(st.nextToken());
	   
	   while(n --> 0) {
		   int target = Integer.parseInt(br.readLine());
		   double box = Math.max(w, Math.max(h, Math.sqrt((w * w) + (h * h))));
		   
		   if(target > box) sb.append("NO");
		   else sb.append("YES");
		   
		   sb.append("\n");
	   }
	   
	   System.out.print(sb);
   }
   
   // Nadan 
   public static void test04() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringBuilder sb = new StringBuilder();
	   int K = Integer.parseInt(br.readLine());
	   int N = Integer.parseInt(br.readLine());

	   for(int i = 0; i < N - 1; i++) {
		   sb.append(i + 1 + "\n");
		   K -= (i + 1);
	   }
	   
	   sb.append(K);
	   
	   System.out.print(sb);
   }
   
   // NASLJEDSTVO 
   public static void test05() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringBuilder sb = new StringBuilder();
	   int N = Integer.parseInt(br.readLine());
	   int O = Integer.parseInt(br.readLine());
	   
	   int d = O / (N - 1);
	   int min = O + d;
	   
	   if(O - d * (N - 1) == 0) System.out.println(min - 1 + " " + min);
	   else System.out.println(min + " " + min);
   }
   
   // Muffinspelet 
   public static void test06() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringBuilder sb = new StringBuilder();
	   int N = Integer.parseInt(br.readLine());
	   
	   int A = 0;
	   int B = 0;
	   
	   while(N != 0) {
		   A += (N /2) + (N % 2);
		   N /= 2;
		   if(N == 0) break;
		   B += (N / 2) + (N % 2);
		   N /= 2;
	   }
	   
	   System.out.println(B + " " + A);
   }
   
   // Receptet 
   public static void test07() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st;	   
	   
	   int total = 0;
	   int N = Integer.parseInt(br.readLine());
	   for(int i = 0; i < N; i++) {
		   st = new StringTokenizer(br.readLine());
		   int H = Integer.parseInt(st.nextToken());
		   int B = Integer.parseInt(st.nextToken());
		   int K = Integer.parseInt(st.nextToken());
		   
		   if(H < B) total += ((B - H) * K);
		   
	   }

	   System.out.println(total);
   }
   
   // Zegarek
   public static void test08() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringBuilder sb = new StringBuilder();
	   StringTokenizer st = new StringTokenizer(br.readLine());	   
	   
	   int h = Integer.parseInt(st.nextToken());
	   int m = Integer.parseInt(st.nextToken());
	   int s = Integer.parseInt(st.nextToken());
	   s++;

	   if(s == 60) {
		   s = 0; 
		   m++;
	   }
	   
	   if(m == 60) {
		   m = 0;
		   h++;
	   }
	   
	   if(h == 24) {
		   h = 0;
	   }
	   
	   if(h < 10) sb.append("0" + h);
	   else sb.append(h);
	   
	   if(m < 10) sb.append(":0" + m);
	   else sb.append(":" + m);
	   
	   if(s < 10) sb.append(":0" + s);
	   else sb.append(":" + s);
	   
	   System.out.println(sb);
	   
   }
   
   // Absolutely Flat 
   public static void test09() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	   int[] table = new int[4];
	   table[0] = Integer.parseInt(br.readLine());
	   table[1] = Integer.parseInt(br.readLine());
	   table[2] = Integer.parseInt(br.readLine());
	   table[3] = Integer.parseInt(br.readLine());
	   int P = Integer.parseInt(br.readLine());
	   
	   Arrays.sort(table);
	   
	   if(table[0] == table[3]) System.out.println(1);
	   else {
		   
		   table[0] += P;
		   
		   if(table[0] == table[1] && table[1] == table[2] && table[2] == table[3]) System.out.println(1);
		   else System.out.println(0);
		   
	   }
	   
		   
   }
   
   // 모형결정
   public static void test10() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st = new StringTokenizer(br.readLine());	   
	   
	   int A = Integer.parseInt(st.nextToken());
	   long B = Long.parseLong(st.nextToken());
	   
	   long answer = 0;
	   long num = 1;

	   while(B --> -1) {
		
		   answer += num;
			
		   num += (A - 2);

	   }

	   System.out.print(answer);
   }
   
   
}