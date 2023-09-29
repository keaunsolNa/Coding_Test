import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st;
	   int T = Integer.parseInt(br.readLine());
	   
	   int i, j;
	   for(i = 0; i < T; i++) {
		   st = new StringTokenizer(br.readLine());
		   
		   int M = Integer.parseInt(st.nextToken());
		   int N = Integer.parseInt(st.nextToken());
		   int x = Integer.parseInt(st.nextToken());
		   int y = Integer.parseInt(st.nextToken());
		   
		   int resultYear = LCM(M, N);
		   
		   for(j = x; j <= resultYear; j += M) {
			   
			   int temp = (j % N == 0) ? N : j % N;
	           
			   if (temp == y) {
	           
				   System.out.println(j);
				   break;
			   }
	            
		   }
		   
		   if(j > resultYear) System.out.println(-1);
		   
	   }
	}
    
       private static int GCD(int a, int b){ 
	   
	   if (a%b == 0) return b;
	   return GCD(b, a % b);
   
   }
   
   private static int LCM(int a, int b) {
	   return (a * b) / GCD(a, b);
   }
}
