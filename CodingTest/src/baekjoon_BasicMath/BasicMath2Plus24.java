package baekjoon_BasicMath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class BasicMath2Plus24 {

   public static void main(String[] args) throws IOException {
      test10();
   }
   
   // 약수들의 합
   public static void test01() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringBuilder sb = new StringBuilder();
      int input = 0;
      
      while((input = Integer.parseInt(br.readLine())) != -1) {
    	  sb.append(input).append(" ");
          List<Integer> arr = new ArrayList<>();
          for(int i = 1; i < input; i++) if(input%i == 0) arr.add(i);

          int sum = 0;
          StringBuilder sb2 = new StringBuilder();
          
          for (Integer integer : arr) { 
        	  
        	  sum += integer;
        	  if(sum < input) sb2.append(integer).append(" + ");
        	  else sb2.append(integer);
        	  
          }
          
          
          if(input == sum) {
        	  sb.append("= ");
        	  sb.append(sb2);
          } else {
        	  sb.append("is NOT perfect.");
          }
          
          sb.append("\n");
      }
      
      sb.deleteCharAt(sb.length()-1);
      System.out.print(sb);
   }
   
   // 화성 수학
   public static void test02() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringBuilder sb = new StringBuilder();
      
      int T = Integer.parseInt(br.readLine());
      
      while(T --> 0) {
    	  String[] input = br.readLine().split(" ");
    	  
    	  double number = Double.parseDouble(input[0]);
    	  
    	  for(int i = 1; i < input.length; i++) {
    		  
    		  switch(input[i]) {
    		  	case "@" : number *= 3; break;
    		  	case "%" : number += 5; break;
    		  	case "#" : number -= 7; break;
    		  }
    	  }
    	  
    	  System.out.printf("%.2f", number);
    	  System.out.println();
      }
	   
   }

   // 대표값 
   public static void test03() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringBuilder sb = new StringBuilder();
      int[] arr = new int [1001];
      int sum = 0;
      for(int i = 0; i < 10; i++) {
    	  
    	  int input = Integer.parseInt(br.readLine());
    	  sum += input;
          arr[input]++;
          
      }
      
      int idx = 0;
      int max = 0;
      for(int i = 0; i < 1001; i++){
          if(max < arr[i]){
              max = arr[i];
              idx = i;
          }
      }
      
      System.out.println(sum/10);
      System.out.println(idx);
   }

   // 새
   public static void test04() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   int N = Integer.parseInt(br.readLine());
	   
	   int out = 1;
	   int time = 0;
       while (N > 0) {
           if(N < out) out = 1;
           N -= out;
           time++;
           out++;
       }
	   
	   System.out.println(time);
   }
   
   // 길면 기차, 기차는 빨라, 빠른 것은 비행기 
   public static void test05() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   String input = "";
	   
	   while(!(input = br.readLine()).equals("0 0 0")) {
		   double M = Integer.parseInt(input.split(" ")[0]);
		   double A = Integer.parseInt(input.split(" ")[1]);
		   double B = Integer.parseInt(input.split(" ")[2]);
		   
			double result = Double.parseDouble(String.format("%.0f", (((M / A) - (M / B)) * 3600)));
			
			int h = (int) (result / 3600);
			int m = (int) ((result / 60) % 60);
			int s = (int) (result % 60);
			
			System.out.format("%d:%02d:%02d\n", h, m, s);
	   }
	   
   }
   
   // 수들의 합 5 (투 포인터 알고리즘)
   public static void test06() throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       int N = Integer.parseInt(br.readLine());
       
       // 투포인터 설정
		int start = 0;
		int end = 0; 
		
		//sum: 합
		int sum = 0;
		// cnt: 가지수
		int cnt = 0; 
		
		while(start <= N) {
			//end 증가
			while(++end <= N) { 
				//부분합을 증가
				sum += end; 
				
				if(sum >= N) {
					if(sum == N) cnt++;
					break;
				}
			}
			
			//start 증가
			while(++start <= N) { 
				//부분합을 감소
				sum -= start; 
				if(sum <= N) {
					if(sum == N) cnt++;
					break;
				}
			}	
		}
		
		System.out.println(cnt);
   }
   
   // LCM
   public static void test07() throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringBuilder sb = new StringBuilder();
       StringTokenizer st;
       int T = Integer.parseInt(br.readLine());
       
       while(T --> 0) {
    	   st = new StringTokenizer(br.readLine(), " ");
    	   long num1 = Long.parseLong(st.nextToken());
    	   long num2 = Long.parseLong(st.nextToken());
    	   long gcd = gcd(num1, num2);
    	   System.out.println(num1 * num2 / gcd);
       }
    		   
   }
   
   // LCM 최대공약수 유클리드 호제법 알고리즘
   private static long gcd(long num1, long num2){
       if(num2 == 0) return num1;
       else return gcd(num2, num1 % num2);
   }
   
   // 24
   public static void test08() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   String[] start = br.readLine().split(":");
	   String[] end = br.readLine().split(":");
	 
	   int now = Integer.parseInt(start[2]) + (Integer.parseInt(start[1]) * 60) + (Integer.parseInt(start[0]) * 3600);
	   int startT = Integer.parseInt(end[2]) + (Integer.parseInt(end[1]) * 60) + (Integer.parseInt(end[0]) * 3600);
	   
	   int termTime;
	   if(startT > now) termTime = startT - now;
	   else termTime = 86400 - (now - startT);
	   
	   int hh = termTime / 3600;
	   int mm = (termTime / 60) % 60;
	   int ss = termTime % 60;
	   
	   System.out.format("%02d:%02d:%02d\n", hh, mm, ss);
   }
   
   // 공약수
   public static void test09() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringBuilder sb = new StringBuilder();
       int T = Integer.parseInt(br.readLine());
       int[] arr = new int[T];

       StringTokenizer st = new StringTokenizer(br.readLine(), " ");
       for(int i = 0; i < T; i++) arr[i] = Integer.parseInt(st.nextToken());
       Arrays.sort(arr);
       
       for(int i = 1; i <= arr[0]; i++) {
    	   
    	   if(T == 2) if(arr[0] % i == 0 && arr[1] % i == 0) sb.append(i).append("\n");
    	   if(T == 3) if(arr[0] % i == 0 && arr[1] % i == 0 && arr[2] % i == 0) sb.append(i).append("\n");
       }
       
       sb.deleteCharAt(sb.length()-1);
       System.out.print(sb);
       
   }
   
   // 통학의 신
   public static void test10() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringBuilder sb = new StringBuilder();
	   StringTokenizer st = new StringTokenizer(br.readLine(), " ");
	   int A = Integer.parseInt(st.nextToken());
	   int B = Integer.parseInt(st.nextToken());
	   
	   for(int i = - 1000; i <= 1000; i++) if((i * i) + (2*A*i) + B == 0) sb.append(i).append(" ");
		   
	   sb.deleteCharAt(sb.length()- 1);
	   
	   System.out.print(sb);
   }
}