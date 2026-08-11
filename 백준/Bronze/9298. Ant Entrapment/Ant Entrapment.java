import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Arrays;
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
	   
	   for(int i = 1; i <= T; i++) {
		   
           int N = Integer.parseInt(br.readLine());
           Double[][] ants = new Double[N][2];
           
           for (int j = 0; j < N; j++) {
        	   
               String[] input = br.readLine().split(" ");
               ants[j][0] = Double.parseDouble(input[0]);
               ants[j][1] = Double.parseDouble(input[1]);
               
           }
           
           Arrays.sort(ants, (o1, o2) -> (int)(o2[0] - o1[0]));
           double x = Double.parseDouble(String.format("%.9f", ants[0][0] - ants[N - 1][0]));
           
           Arrays.sort(ants, (o1, o2) -> (int)(o2[1] - o1[1]));
           double y = Double.parseDouble(String.format("%.9f", ants[0][1] - ants[N - 1][1]));
           
           sb.append("Case " + (i + 1) + ": Area " + x * y + ", Perimeter " + (x * 2 + y * 2) + "\n");
           
	   }
	   
	   System.out.print(sb);
	   
   }
}
