package baekjoon_BasicMath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BasicMath2Plus14 {

   public static void main(String[] args) throws IOException {
      test10();
   }
   
   // Congruent Numbers
   public static void test01() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st = new StringTokenizer(br.readLine());

      double p1 = Double.parseDouble(st.nextToken());
      double q1 = Double.parseDouble(st.nextToken());
      double p2 = Double.parseDouble(st.nextToken());
      double q2 = Double.parseDouble(st.nextToken());
      
      double isAreaInteger =  p1 * p2 / q1 / q2 / 2;
      
      if((int)isAreaInteger == isAreaInteger) {
    	  System.out.println(1);
      } else {
    	  System.out.println(0);
      }
   }
   
   // Bałwanek 
   public static void test02() throws IOException {
      
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st = new StringTokenizer(br.readLine());
	   
	   int x = Integer.parseInt(st.nextToken());
	   int k = Integer.parseInt(st.nextToken());
	   
	   if(k*7 <= x) {
		   System.out.println(k*7000);
	   } else if(k*3.5 <= x) {
		   System.out.println(k*3500);
	   } else if(k*1.75 <= x) {
		   System.out.println(k*1750);
	   } else {
		   System.out.println(0);
	   }
   }

   // Laptop Sticker
   public static void test03() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st = new StringTokenizer(br.readLine(), " ");
      int wc = Integer.parseInt(st.nextToken());
      int hc = Integer.parseInt(st.nextToken());
      int ws = Integer.parseInt(st.nextToken());
      int hs = Integer.parseInt(st.nextToken());
      
      
      if(wc - ws >= 2 && hc - hs >= 2) {
    	  System.out.println(1);
      } else {
    	  System.out.println(0);
      }
      
   }

   // Lunacy 
   public static void test04() throws IOException {
	     
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   
	   double weight = 0;
	   
	   while((weight = Double.parseDouble(br.readLine())) > 0) {
		   StringBuilder sb = new StringBuilder();
		   String moonWeight = String.format("%.2f", weight*0.167);
		   String earthWeight = String.format("%.2f", weight);
		   sb.append("Objects weighing ").append(earthWeight).append(" on Earth will weigh ").append(moonWeight).append(" on the moon.");
		   System.out.println(sb);
	   }

   }
   
   // Corona Virus Testing
   public static void test05() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st  = new StringTokenizer(br.readLine(), " ");
	   
	   int group = Integer.parseInt(st.nextToken());
	   int peopleInGroup = Integer.parseInt(st.nextToken());
	   int needTestCase = Integer.parseInt(st.nextToken());
	   
	   int totalPeople = group * peopleInGroup;
	   
	   int testCase = group + (needTestCase * peopleInGroup); 
	   
	   if(totalPeople > testCase) {
		   System.out.println(2);
	   } else if (totalPeople == testCase) {
		   System.out.println(0);
	   } else {
		   System.out.println(1);
	   }
   }
   
   // 얼마?
   public static void test06() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int T = Integer.parseInt(br.readLine());
      
      for(int i = 0; i < T; i++) {
    	  int car = Integer.parseInt(br.readLine());
    	  int option = Integer.parseInt(br.readLine());
    	  
    	  for(int j = 0; j < option; j++) {
    		  String[] temp = br.readLine().split(" ");
    		  car += Integer.parseInt(temp[0]) * Integer.parseInt(temp[1]);
    	  }
    	  
    	  System.out.println(car);
      }
   }
   
   // 내 학점을 구해줘 
   public static void test07() throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       int T = Integer.parseInt(br.readLine());
       
       for(int i = 0; i < T; i++) {
    	   int N = Integer.parseInt(br.readLine());
    	   int totalC = 0;
    	   double totalG = 0;
    	   for(int j = 0; j < N; j++) {
    		   String[] temp = br.readLine().split(" ");
    		   
    		   totalC += Integer.parseInt(temp[0]);
    		   totalG += Integer.parseInt(temp[0])*Double.parseDouble(temp[1]);
    		   
    	   }
    	   
    	   System.out.println(totalC + " " + (double)Math.round(totalG/totalC*10)/10);
       }
   }
   
   // 짝수를 찾아라
   public static void test08() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   int T = Integer.parseInt(br.readLine());
	   
	   for(int i = 0; i < T; i++){
		   
		   int sum = 0;
		   int min = 101;
		   StringTokenizer st  = new StringTokenizer(br.readLine(), " ");
		   for(int j = 0; j < 7; j++) {
			   int temp = Integer.parseInt(st.nextToken());
			   if(temp%2 == 0) {
				   sum += temp;
				   
				   if(temp < min) {
					   min = temp;
				   }
			   }
		   }
		   
		   System.out.println(sum + " " + min);
	   }
	   
   }
   
   // 배수 찾기
   public static void test09() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int N = Integer.parseInt(br.readLine());
      
      int number = 0;
      while((number = Integer.parseInt(br.readLine())) != 0) {
    	  String answer  = "";
    	  if(number % N ==0) {
    		  answer = " is a multiple of " + N + ".";
    	  } else {
    		  answer = " is NOT a multiple of " + N + ".";
    	  }
    	  
    	  System.out.println(number + answer);
      }
      
   }
   
   // 더하기
   public static void test10() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   int T = Integer.parseInt(br.readLine());
	   
	   for(int i = 0; i < T; i++) {
		   
		   int N  = Integer.parseInt(br.readLine());
		   StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		   int sum = 0;
		   for(int j = 0; j < N; j++) {
			   sum += Integer.parseInt(st.nextToken());
		   }
		   
		   System.out.println(sum);
	   }
	   
   }



}