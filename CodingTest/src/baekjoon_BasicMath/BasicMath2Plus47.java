package baekjoon_BasicMath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BasicMath2Plus47 {

   public static void main(String[] args) throws IOException {
      test04();
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
   
   // 
   public static void test04() throws IOException {
	   
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   
   }
   
	   
}