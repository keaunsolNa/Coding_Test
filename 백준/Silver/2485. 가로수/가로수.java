import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test06();
	}

   public static void test06() throws IOException {
	   
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   int T = Integer.parseInt(br.readLine());
	   
	   int[] tree = new int[T];
	   int[] gaps = new int[T - 1];
	   for(int i = 0; i < T; i++) {
		   
		   tree[i] = Integer.parseInt(br.readLine());
		   if(i > 0) gaps[i - 1] = tree[i] - tree[i - 1];
		   
	   }
	   
       for (int i = 0; i <= gaps.length - 2; i++) 
    	   gaps[i + 1] = GCD(gaps[i], gaps[i + 1]);

       int gap = gaps[gaps.length - 1];

       System.out.println((tree[T - 1] - tree[0]) / gap - (T - 1));	   
   }

   private static int GCD(int a, int b){ 
   
	   if (a%b == 0) return b;
	   return GCD(b, a % b);
   
   }
}
