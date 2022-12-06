package baekjoon_BasicMath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BasicMath2Plus17 {

   public static void main(String[] args) throws IOException {
      test10();
   }
   
   // Большой удой 
   public static void test01() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int A = Integer.parseInt(br.readLine());
      int B = Integer.parseInt(br.readLine());
      
      System.out.println(B*2 - A);
   }
   
   // Lots of Liquid
   public static void test02() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   int N = Integer.parseInt(br.readLine());
	   StringTokenizer st = new StringTokenizer(br.readLine(), " ");
	   
	   double sum = 0;
	   
	   for(int i = 0; i < N; i++) {
		   double c = Double.parseDouble(st.nextToken());
		   sum += Math.pow(c, 3);
	   }
	   
	   System.out.println(Math.cbrt(sum));
	   
   }

   // 핸드폰 요금
   public static void test03() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int N = Integer.parseInt(br.readLine());
      StringTokenizer st = new StringTokenizer(br.readLine(), " ");
      int time = 0;
      int yTime = 0;
      int mTime = 0;
      
      for(int i = 0; i < N; i++) {
    	  time = Integer.parseInt(st.nextToken());
    	  if(time < 30) {
    		  yTime += 10;
    	  } else {
			  yTime += (time/30 + 1) * 10;
    	  }
    	  
    	  if(time < 60) {
    		  mTime += 15;
    	  } else {
    		  mTime += (time/60 + 1)* 15;
    	  }
      }	  
      
	  if(mTime > yTime) {
		  System.out.println("Y " + yTime);
	  } else if(mTime < yTime) {
		  System.out.println("M " + mTime);
	  } else {
		  System.out.println("Y M " + mTime);
	  }
      
   }

   // 남욱이의 닭장 
   public static void test04() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   int T = Integer.parseInt(br.readLine());
	   StringTokenizer st;;
	   
	   for(int i = 0; i < T; i++) {
		   st = new StringTokenizer(br.readLine(), " ");
		   
		   int foot = Integer.parseInt(st.nextToken());
		   int chicken = Integer.parseInt(st.nextToken());
		   System.out.println((chicken * 2 - foot) + " " + (chicken - (chicken * 2 - foot)));
	   }

   }
   
   // 지능형 기차 2
   public static void test05() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st;
	   
	   int totalPeople = 0;
	   int maxPeople = 0;
	   for(int i = 1; i <= 10; i++) {
		   st = new StringTokenizer(br.readLine(), " ");
		   int output = Integer.parseInt(st.nextToken());
		   int input = Integer.parseInt(st.nextToken());
		   
		   totalPeople += input;
		   totalPeople -= output;
		   
		   if(totalPeople > maxPeople) maxPeople = totalPeople;
	   }
	   
	   System.out.println(maxPeople);
	   
   }
   
   // 삼각형과 세 변
   public static void test06() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st;
      String input = "";
      
      while(!(input = br.readLine()).equals("0 0 0")) {
    	  st = new StringTokenizer(input, " ");
    	  int[] dgree = new int[3];
    	  
    	  dgree[0] = Integer.parseInt(st.nextToken());
    	  dgree[1] = Integer.parseInt(st.nextToken());
    	  dgree[2] = Integer.parseInt(st.nextToken());
    	  
    	  Arrays.sort(dgree);
    	  
    	  if(dgree[2] >= dgree[0] + dgree[1]) {
    		  System.out.println("Invalid");
    	  } else if(dgree[0] == dgree[1] && dgree[0] == dgree[2]) {
    		  System.out.println("Equilateral");
    	  } else if(dgree[0] != dgree[1] && dgree[0] != dgree[2] && dgree[1] != dgree[2]) {
    		  System.out.println("Scalene");
    	  } else {
    		  System.out.println("Isosceles");
    	  }
    	  
      }
   }
   
   // 고급 수학
   public static void test07() throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       int T = Integer.parseInt(br.readLine());
       StringTokenizer st;

       for(int i = 0; i < T; i++) {
    	   st = new StringTokenizer(br.readLine(), " ");
    	   int[] triangle = new int[3];
    	   
    	   triangle[0] = Integer.parseInt(st.nextToken());
    	   triangle[1] = Integer.parseInt(st.nextToken());
    	   triangle[2] = Integer.parseInt(st.nextToken());
    	   
    	   Arrays.sort(triangle);
    	   
    	   if((triangle[0] * triangle[0]) + (triangle[1] * triangle[1]) == triangle[2] * triangle[2]) {
    		   System.out.println("Scenario #" + (i+1) + ":");
			   System.out.println("yes");
    	   } else {
    		   System.out.println("Scenario #" + (i+1) + ":");
			   System.out.println("no");
    	   }
    	   
    	   if(i != T - 1) {
    		   System.out.println();
    	   }
       }
   }
   
   // 완전 제곱수
   public static void test08() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   int N = Integer.parseInt(br.readLine());
	   int cnt = 0;
	   for(int b = 1; b <= 500; b++) {
		   
		   for(int a = b + 1; a <= 500; a++) {
			   if(a * a - N == b * b) cnt++;
		   }
	   }
	   
	   System.out.println(cnt);
   }
   
   // 멀티탭 충분하니?
   public static void test09() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st = new StringTokenizer(br.readLine(), " ");
      
      int N = Integer.parseInt(st.nextToken());
      int P = Integer.parseInt(st.nextToken());
      
      st = new StringTokenizer(br.readLine(), " ");
      int hole = 0;
      for(int i = 0; i < P; i++) {
    	  int cap = Integer.parseInt(st.nextToken());
    	  switch(cap) {
    	  	case 3 : hole += 2; break;
    	  	case 4 : hole += 2; break;
    	  	case 5 : hole += 3; break;
    	  	case 6 : hole += 3; break;
    	  	case 7 : hole += 4; break;
    	  	case 8 : hole += 4; break;
    	  }
      }
      
      if(hole >= N) {
    	  System.out.println("YES");
      } else {
    	  System.out.println("NO");
      }
      
   }
   
   // 더하기 4
   public static void test10() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   String input = "";
	   int index = 1;
	   
	   while(!(input = br.readLine()).equals("0 0 0")) {
		   StringTokenizer st = new StringTokenizer(input, " ");
		   
		   double a = Integer.parseInt(st.nextToken());
		   double b = Integer.parseInt(st.nextToken());
		   double c = Integer.parseInt(st.nextToken());
		   
		   if(a == 0 && b == 0 && c ==0)break;
		   
		   System.out.println("Triangle #" + index);
		   
			if(a == -1) {
				if(c <= b) {
					System.out.println("Impossible.");
				}else {
					a = Math.sqrt((c * c) - (b * b));
					System.out.println("a = " + String.format("%.3f", a));
				}
			}
			if(b == -1) {
				if(c <= a) {
					System.out.println("Impossible.");
				}else {
					b = Math.sqrt((c * c) - (a * a));
					System.out.println("b = " + String.format("%.3f", b));
				}
			}
			if(c == -1) {
				c = Math.sqrt((a * a) + (b * b));
				System.out.println("c = " + String.format("%.3f", c));
			}
			index++;
			System.out.println();
	   }
   }

}