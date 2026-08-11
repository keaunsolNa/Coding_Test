package baekjoon_BasicMath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BasicMath2Plus14 {

   public static void main(String[] args) throws IOException {
      test10();
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