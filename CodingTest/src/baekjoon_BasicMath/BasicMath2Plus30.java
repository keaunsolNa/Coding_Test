package baekjoon_BasicMath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BasicMath2Plus30 {

   public static void main(String[] args) throws IOException {
      test05();
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