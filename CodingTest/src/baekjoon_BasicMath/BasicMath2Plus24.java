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
      test06();
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
   
}