package baekjoon_StepByStep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Test23_BinarySearch {
	
   public static void main(String[] args) throws IOException {
	      test07();
   }
   
   
   // 12051번 - 가장 긴 증가하는 부분 수열 2
   public static void test07() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	   int N = Integer.parseInt(br.readLine());
	   int[] number = new int[N];
	   int[] lts = new int[N];
	   
	   StringTokenizer st = new StringTokenizer(br.readLine());
	   for(int i = 0; i < N; i++) number[i] = Integer.parseInt(st.nextToken());
	   
	   lts[0] = number[0];
	   int length = 1;
	   
	   for(int i = 1; i < N; i++) {
		   
		   int search = number[i];
		   
		   if(lts[length - 1] < search) {
			   length++;
			   lts[length - 1] = search;
		   }
		   
		   else {
			   
			   int first = 0;
			   int last = length;
			   
			   while(first < last) {
				  
				   int mid = (first + last) / 2;	
				   
				   if(lts[mid] < search) first = mid + 1;
				   else last = mid;
			   }
			   
			   lts[first] = search;
		   }
	   }

	   System.out.println(length);

   }
   
   
}
