package baekjoon_BasicMath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class BasicMath2Plus44 {

   public static void main(String[] args) throws IOException {
      test09();
   }
   
   // 27465번 - 소수가 아닌 수
   public static void test01() throws IOException {
	   System.out.println("1000000000");
   }
   
   // 1434번 - 책 정리
   public static void test02() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st;
	   
	   st = new StringTokenizer(br.readLine());
	   
	   int N = Integer.parseInt(st.nextToken());
	   int M = Integer.parseInt(st.nextToken());
	   
	   st = new StringTokenizer(br.readLine());
	   int[] box = new int[N];
	   for(int i = 0; i < N; i++) box[i] = Integer.parseInt(st.nextToken());
	   
	   st = new StringTokenizer(br.readLine());
	   int[] book = new int[M];
	   for(int i = 0; i < M; i++) book[i] = Integer.parseInt(st.nextToken());
	   
	   for(int i = 0; i < M; i++) {
		   
		   for(int j = 0; j < N; j++) {
			   
			   if(box[j] >= book[i]) {
				   box[j] -= book[i];
				   break;
			   }
		   }
	   }
	   
	   int total = 0;
	   for(int i = 0; i < N; i++) total += box[i];
	   
	   System.out.println(total);
	   
   }
   
   // 15995번 - 잉여역수 구하기
   public static void test03() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st = new StringTokenizer(br.readLine());
	   
	   double a = Integer.parseInt(st.nextToken());
	   double m = Integer.parseInt(st.nextToken());

	   for(double i = 1; ; i++) {
		   
		   if((a * i) % m == 1) {
			   System.out.println((int)i);
			   return;
		   }
		   i++;
	   }
   }
   
   // 20953번 - 고고학자 예린
   public static void test04() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringBuilder sb = new StringBuilder();
	   StringTokenizer st;

	   int T = Integer.parseInt(br.readLine());
	   while(T --> 0) {
		
		   st = new StringTokenizer(br.readLine());
		   long a = Integer.parseInt(st.nextToken());
		   long b = Integer.parseInt(st.nextToken());
		   sb.append((((a + b) * (a + b)) * (a + b - 1) / 2) + "\n");
	   }
	   
	   System.out.println(sb);
   }
   
   // 2755번 - 이번학기 평점은 몇점?
   public static void test05() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st;
	   
	   int T = Integer.parseInt(br.readLine());
	   
	   double sum = 0;
	   int sumCredit = 0;
	   for(int i = 0; i < T; i++) {
		   st = new StringTokenizer(br.readLine());
		   
		   st.nextToken();
		   int credit = Integer.parseInt(st.nextToken());

		   String p = st.nextToken();
		   double point = 0;
		   
		   switch(p) {
		   
		   		case "A+" : point += 4.3; break;
		   		case "A0" : point += 4.0; break;
		   		case "A-" : point += 3.7; break;
		   		case "B+" : point += 3.3; break;
		   		case "B0" : point += 3.0; break;
		   		case "B-" : point += 2.7; break;
		   		case "C+" : point += 2.3; break;
		   		case "C0" : point += 2.0; break;
		   		case "C-" : point += 1.7; break;
		   		case "D+" : point += 1.3; break;
		   		case "D0" : point += 1.0; break;
		   		case "D-" : point += 0.7; break;
		   		case "F" : point += 0.0; break;
		   			
		   }
		   
		   sum += (point * credit);
		   sumCredit += credit;
	   }
	   
	   System.out.printf("%.2f", sum/sumCredit);
   }
   
   // 20154번 - 이 구역의 승자는 누구야?!
   public static void test06() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   
	   int[] number = new int[] {3, 2, 1, 2, 3, 3, 3, 3, 1, 1, 3, 1, 3, 3, 1, 2, 2, 2, 1, 2, 1, 1, 2, 2, 2, 1};
	   
	   String input = br.readLine();
	   List<Integer> arr = new ArrayList<>();
	   
	   for(int i = 0; i < input.length(); i+= 2) {
		   
		   if(i != input.length() - 1) arr.add(number[input.charAt(i) - 'A'] + number[input.charAt(i + 1) - 'A']);
		   else arr.add(number[input.charAt(i) - 'A']);
		   
	   }
	   
	   while(arr.size() != 1) {
		   
		   List<Integer> arr2 = new ArrayList<>();
		   for(int i = 0; i < arr.size(); i += 2) {
			   
			   if(i != arr.size() - 1) {
				   
				   if(arr.get(i) + arr.get(i + 1) < 10) arr2.add(arr.get(i) + arr.get(i + 1));
				   else arr2.add((arr.get(i) + arr.get(i + 1)) % 10);
				   
			   } else arr2.add(arr.get(i));
			   
		   }
		   arr = arr2;
	   }
	   
	   if(arr.get(0) % 2 == 0) System.out.println("You're the winner?");
	   else System.out.println("I'm a winner!");
   }
   
   // 17283번 - I am Groot
   public static void test07() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   
	   int L = Integer.parseInt(br.readLine());
	   int R = Integer.parseInt(br.readLine());

	   List<Integer> branch = new ArrayList<>();
	   
	   while(L > 5) {
		   L = R * L / 100;
		   branch.add(L);
	   }

	   int root = 2;
	   int sum = 0;
	   for(int i = 0; i < branch.size() - 1; i++) {
		   sum += root * branch.get(i);
		   root *= 2;
	   }
	   
	   System.out.println(sum);
       
       
   }
   
   // 17950번 - 스노우볼 
   public static void test08() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st = new StringTokenizer(br.readLine());
	   
	   int H = Integer.parseInt(st.nextToken());
	   int X = Integer.parseInt(st.nextToken());
	   
	   long total = 0;
	   int mod = 1000000007;
	   long num = X;
	   
	   for(int i = 1; i <= H; i++) {
		   int snowBall = Integer.parseInt(br.readLine());
		   
		   total += (num * snowBall);
		   total = total % mod;
		   num = (num * X) % mod;
		   
	   }
	   
	   System.out.println(total);
   }
   
   // 10420번 - 기념일 1
   public static void test09() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	   int y = 2014;
	   int m = 4;
	   int d = 2;

	   int n = Integer.parseInt(br.readLine()) - 1;
       
       while (n-- > 0) {
    	   
           d += 1;
           
           if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10) {
        	   
               if (d == 32) {
                   m += 1;
                   d = 1;
               }
               
           } else if (m == 4 || m == 6 || m == 9 || m == 11) {
        	   
               if (d == 31) {
                   m += 1;
                   d = 1;
               }
               
           } else if (m == 12) {
        	   
               if (d == 32) {
                   y += 1;
                   m = 1;
                   d = 1;
               }
               
           } else if (m == 2) {
        	   
               boolean leaf = false;
               
               if ((y % 4 == 0 && y % 100 != 0) || y % 400 == 0)  leaf = true;
               
               if (d == 29 && !leaf) {
            	   
                   m += 1;
                   d = 1;
                   
               }
               
               if (d == 30 && leaf) {
            	   
                   m += 1;
                   d = 1;
                   
               }
               
           }
           
       }
       
       if (m < 10 && d < 10) System.out.printf("%d-0%d-0%d\n", y, m, d);
       
       if (m < 10 && d >= 10)  System.out.printf("%d-0%d-%d\n", y, m, d);
       
       if (m >= 10 && d < 10) System.out.printf("%d-%d-0%d\n", y, m, d);
       
       if (m >= 10 && d >= 10) System.out.printf("%d-%d-%d\n", y, m, d);
       
   }
   
   // 10834번 - 벨트
   public static void test10() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st;

	   int M = Integer.parseInt(br.readLine());
	   int belt = 0;
	   int beltm = 1;

	   for(int i = 0; i < M; i++) {
		   
		   st = new StringTokenizer(br.readLine());
		   int a = Integer.parseInt(st.nextToken());
		   int b = Integer.parseInt(st.nextToken());
		   int c = Integer.parseInt(st.nextToken());
			
		   if(c == 1) {
			   if(belt == 0) belt = 1;
			   else if(belt == 1) belt = 0;
		   }
			
			beltm = (beltm / a) * b;

	   }
	   System.out.println(belt + " " + beltm);
  
   }
   
   
}