import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test03();
	}

   public static void test03() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st;
      StringBuilder sb = new StringBuilder();
      int T = Integer.parseInt(br.readLine());
      
      while(T --> 0) {
    	  int n = Integer.parseInt(br.readLine());
    	  
    	  st = new StringTokenizer(br.readLine(), " ");
    	  
    	  int[] arr = new int[n];
    	  
    	  for(int i = 0; i < n; i++) arr[i] = Integer.parseInt(st.nextToken());
    	  
    	  Arrays.sort(arr);	
    	  
    	  System.out.println((arr[arr.length-1] - arr[0]) * 2);
    	  
      }
   }
}
