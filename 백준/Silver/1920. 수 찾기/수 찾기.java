import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test01();
	}

   public static void test01() throws IOException {
		
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   int testCase = Integer.parseInt(br.readLine());
	
	   StringTokenizer st = new StringTokenizer(br.readLine(), " ");
	   long[] arr = new long[testCase];
		
	   for(int i = 0; i < testCase; i++) 
		   arr[i] = Long.parseLong(st.nextToken());
	
	   Arrays.sort(arr);
		
	   int testCase2 = Integer.parseInt(br.readLine());
	   st = new StringTokenizer(br.readLine(), " ");
	   StringBuilder sb  = new StringBuilder();
		
	   for(int i = 0; i < testCase2; i++) {
			
		   if(search(arr, Long.parseLong(st.nextToken())) >= 0) 
			   sb.append("1").append("\n");
		   else 
			   sb.append("0").append("\n");
	   }

	   System.out.println(sb);
   }

   private static int search(long[] arr, Long target) {

	   int first = 0;
	   int last = arr.length - 1;

	   while(first <= last) {
		   
		   int mid = (first+last)/2;

		   if(target < arr[mid]) 
			   last = mid - 1;

		   else if (target > arr[mid])
			   first = mid + 1;
   	
		   else 
			   return mid;
   
	   }
   	
	   return -1;
   }
}
