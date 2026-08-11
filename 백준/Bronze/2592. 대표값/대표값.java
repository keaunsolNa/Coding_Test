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
}
