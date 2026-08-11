import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test08();
	}

   public static void test08() throws IOException {
	   
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   int k = Integer.parseInt(br.readLine());
	   
       int[] arr = new int[10000001]; 
       int n = 10000000;
       
       for(int i = 2; i <= 10000000; i++) arr[i] = i;
       
       for (int i = 2; i <= n; i++) {
           if (arr[i] == 0) continue;
           for (int j = i + i; j <= n; j += i) arr[j] = 0;
       }

       int count = 1;
       for (int i = 2; i <= n; i++) {
           if (arr[i] != 0) {
               if (count == k) {
                   System.out.print(i);
                   break;
               }
               count++;
           }
       }
     
   }
}
