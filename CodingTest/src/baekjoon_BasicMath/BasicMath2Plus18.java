package baekjoon_BasicMath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BasicMath2Plus18 {

   public static void main(String[] args) throws IOException {
      test10();
   }
   
   // 수학은 체육과목 입니다
   public static void test01() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int n = Integer.parseInt(br.readLine());
      
      System.out.println((long)n*4);
   }
   
   // 도미노
   public static void test02() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   int N = Integer.parseInt(br.readLine());
	   int sum = 0;
	   for(int i = 0; i <= N; i++) {
		   sum += (3 * i + N) * (N - i + 1) /2;
	   }
	   System.out.println(sum);
   }

   // 캥거루 세마리
   public static void test03() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st = new StringTokenizer(br.readLine(), " ");
      int x = Integer.parseInt(st.nextToken());
      int y = Integer.parseInt(st.nextToken());
      int z = Integer.parseInt(st.nextToken());
      
      System.out.println(Math.max(z-y-1, y-x-1));
      
   }

   // 중앙 이동 알고리즘
   public static void test04() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   int N = Integer.parseInt(br.readLine());
	   int squre = 1;
	   int side = 0;
	   for(int i = 1; i <= N; i++) {
		   squre *= 4;
		   side = (int)Math.sqrt(squre);
	   }
	   
	   System.out.println((side+1) * (side+1));
   }
   
   // 사나운 개 
   public static void test05() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st = new StringTokenizer(br.readLine(), " ");
	   int a = Integer.parseInt(st.nextToken());
	   int b = Integer.parseInt(st.nextToken());
	   int c = Integer.parseInt(st.nextToken());
	   int d = Integer.parseInt(st.nextToken());
       int p[] = new int[3];
       int dogcnt[] = new int[3];
       
	   st = new StringTokenizer(br.readLine(), " ");
       for(int i = 0; i < 3 ;i++) {
           p[i] = Integer.parseInt(st.nextToken());
           dogcnt[i]=0;
       }
       for(int i=0; i<3;i++) {
           if(p[i] % (a + b) >= 1 && p[i] % (a + b) <= a) {
               dogcnt[i]++;
           }
           if(p[i] % (c + d) >= 1 && p[i] % (c + d) <= c) {
               dogcnt[i]++;
           }
           System.out.println(dogcnt[i]);
       }

	   
   }
   
   // Fan Death
   public static void test06() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int N = Integer.parseInt(br.readLine());
      int sum = 0;
      
      for(int i = 1; i <= N; i++) {
    	  if(N%i == 0) {
    		  sum += i;
    	  }
      }
      System.out.println(sum*5 - 24);
   }
   
   // 파인만
   public static void test07() throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       int input = 0;
       
       while((input = Integer.parseInt(br.readLine())) != 0) {
    	   int answer = 0;
    	   for(int i = 1; i <= input; i++) {
    		   answer += i*i;
    	   }
    	   
    	   System.out.println(answer);
       }

   }
   
   // 겨울왕국 티켓 예매
   public static void test08() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   int T = Integer.parseInt(br.readLine());
	   
	   for(int i = 0; i < T; i++) {
		   StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		   
		   int N = Integer.parseInt(st.nextToken());
		   int M = Integer.parseInt(st.nextToken());
		   
		   if (N >= 12 && M >= 4) {
			   System.out.println(11 * M + 4);
           } else {
        	   System.out.println(-1);
           }
	   }
   }
   
   // Sum of Odd Sequence 
   public static void test09() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int T = Integer.parseInt(br.readLine());
      
      for(int i = 0; i < T; i++) {
    	  int sum = 0;
    	  int N = Integer.parseInt(br.readLine());
    	  for(int j = 1; j <= N; j++) {
    		  if(j%2 != 0) {
    			  sum+= j;
    		  }
    	  }
    	  System.out.println(sum);
      }
      
   }
   
   // 지속
   public static void test10() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   String N = br.readLine();
	   int cnt = 0;
	   
	   if(N.length() == 1) {
		   System.out.println(0);
	   } else {
		   while(N.length() != 1) {
			   int sum = 1;
			   for(int i = 0; i < N.length(); i++) {
				   sum *= Integer.parseInt(N.charAt(i)+"");
			   }
			   N = sum+"";
			   cnt++;
		   }
		   System.out.println(cnt);
	   }
	   
	   
	   
	   
   }
}