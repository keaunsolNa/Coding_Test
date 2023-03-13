package baekjoon_BasicMath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class BasicMath2Plus47 {

   public static void main(String[] args) throws IOException {
      test10();
   }
   
   // 13241번 - 최소공배수	
   public static void test01() throws IOException {
	   
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st = new StringTokenizer(br.readLine());
	   
	   long A = Long.parseLong(st.nextToken());
	   long B = Long.parseLong(st.nextToken());
	   
	   long gcd = gcd(A, B);
	   System.out.println(A * B / gcd);
	   
   }
   
   private static long gcd(long num1, long num2){
       if(num2 == 0) return num1;
       else return gcd(num2, num1 % num2);
   }
   
   // 2052번 - 지수연산
   public static void test02() throws IOException {
	   
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   int n = Integer.parseInt(br.readLine());
	   String s = String.format(("%." + n + "f"), Math.pow(2, -n));
	   
	   System.out.println(s);
	   
   }
   
   // 16968번 - 차량 번호판 1
   public static void test03() throws IOException {
	   
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   String input = br.readLine();
	   int num = 1;
	   
	   String start = input.substring(0, 1);
	   
	   if(start.equals("c")) num *= 26;
	   else num *= 10;
	   
	   for(int i = 0; i < input.length() - 1; i++) {
		   
		   String a = input.substring(i, i + 1);
		   String b = input.substring(i + 1, i + 2);
		   
		   if(a.equals("c")) {
			   if(a.equals(b)) num *= 25;
			   else num *= 10;
		   }

		   else if(a.equals("d")){
			   if(a.equals(b)) num *= 9;
			   else num *= 26;
		   }
	   }
	   
	   System.out.println(num);
   }
   
   // 14614번 - Calculate!
   public static void test04() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st = new StringTokenizer(br.readLine());	   
	   
	   long A = Long.parseLong(st.nextToken());
	   long B = Long.parseLong(st.nextToken());
	   String C = st.nextToken();
	   
	   int lastC = C.charAt(C.length() - 1) - '0';

	   if((lastC&1) == 0) { 
		   System.out.println(A);
		   return;
	   }
		
		int result = 0;
		int cur = 1;
		
		while(A + B != 0 ) {
			
			if(( A & 1 ) + ( B & 1 ) == 1) result += cur;
			
			A = A>>1;
			B = B>>1;
			cur = cur<<1;

		}
	   
	   System.out.println(result);	   
	   
   }
   
   // 24927번 - Is It Even? 
   public static void test05() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st = new StringTokenizer(br.readLine());	   
	   
	   int N = Integer.parseInt(st.nextToken());
	   int K = Integer.parseInt(st.nextToken());
	   
	   int odd = 0;
	   for(int i = 0; i < N; i++) {
		   int temp = Integer.parseInt(br.readLine());
		   
		   while(temp % 2 == 0) {
			   odd++;
			   temp /= 2;
		   }
	   }
	   
	   if(odd >= K) System.out.println(1);
	   else System.out.println(0);
   }
   
   // 3060번 - 욕심쟁이 돼지
   public static void test06() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringBuilder sb = new StringBuilder();
	   StringTokenizer st;
	   int T = Integer.parseInt(br.readLine());

	   while(T --> 0) {
		   
		   long N = Long.parseLong(br.readLine());
		   int ans = 1;
		   int sum = 0;
			
		   st = new StringTokenizer(br.readLine());
			
			
		   for (int i = 0; i < 6; i++) sum += Integer.parseInt(st.nextToken());
			
		   while(sum <= N) {
			   sum *= 4;
			   ans++;
		   }
		   
		   sb.append(ans + "\n");
	   }
	   
	   System.out.println(sb);
   }
   
   // 3226번 - 전화 요금
   public static void test07() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st;
	   
	   int N = Integer.parseInt(br.readLine());
	   int pay = 0;
	   
	   while(N --> 0) {
		   st = new StringTokenizer(br.readLine());	
		   
		   String start = st.nextToken();
		   int startH = Integer.parseInt(start.split(":")[0]);
		   int startM = Integer.parseInt(start.split(":")[1]);
		   
		   int totalM = startH * 60 + startM;
		   
		   int time = Integer.parseInt(st.nextToken());
		   while (time --> 0) {
			   
			   if(totalM >= 420 && totalM < 1140) pay += 10;
			   else pay += 5;
			   
			   totalM++;
			   if(totalM >= 1440) totalM = 0;
		   }
		   
	   }
	   System.out.println(pay);
   }
   
   // 25375번 - 아주 간단한 문제
   public static void test08() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringBuilder sb = new StringBuilder();
	   StringTokenizer st;
	   
	   int Q = Integer.parseInt(br.readLine());
	   
	   while(Q --> 0) {
		   
		   st = new StringTokenizer(br.readLine());	
		   long a = Long.parseLong(st.nextToken());
		   long b = Long.parseLong(st.nextToken());
		   
		   sb.append(a * 2 <= b && b % a == 0 ? 1 : 0).append("\n");
	   }
	   
	   System.out.print(sb);
   }
   
   // 14409번 - Tuna
   public static void test09() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st;
	   
	   int T = Integer.parseInt(br.readLine());
	   int X = Integer.parseInt(br.readLine());
	   
	   int total = 0;
	   for(int i = 0; i < T; i++) {
		   
		   st = new StringTokenizer(br.readLine());
		   int p1 = Integer.parseInt(st.nextToken());
		   int p2 = Integer.parseInt(st.nextToken());
		   
		   if(Math.abs(p1 - p2) > X) 
			   total += Integer.parseInt(br.readLine());
		   
		   else 
			   total += Math.max(p1, p2);
		   
	   }
	   
	   System.out.println(total);
   }
   
   // 11680번 - Dice Cup
   public static void test10() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st = new StringTokenizer(br.readLine());	
	   
	   int N = Integer.parseInt(st.nextToken());
	   int M = Integer.parseInt(st.nextToken());
	   
	   Map<Integer, Integer> map = new HashMap<>();
	   for(int i = 1; i <= N; i++) {
		   
		   for(int j = M; j >= 1; j--) {
			   map.put(i + j, map.getOrDefault(i + j, 0) + 1);
		   }
	   }
	   
	   List<Map.Entry<Integer, Integer>> entryList = new LinkedList<>(map.entrySet());
	   entryList.sort(new Comparator<Map.Entry<Integer, Integer>>() {
	       @Override
	       public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
	    	   return o2.getValue() - o1.getValue();
	       }
	   });
	   
	   int first = entryList.get(0).getValue();
	   for(Map.Entry<Integer, Integer> entry : entryList){
		   if(entry.getValue() == first) System.out.println(entry.getKey());
		   else return;
	   }
   
   }
   
}