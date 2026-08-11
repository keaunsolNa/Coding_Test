import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test02();
	}

   public static void test02() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st;
	   StringBuilder sb = new StringBuilder();
	   
	   while(true) {
		   
		   int[] arr = Arrays.stream(br.readLine().split(" ")).map(String::trim).mapToInt(Integer::parseInt).toArray();
		   
		   if(arr[0] == 0 && arr[1] == 0 && arr[2] == 0 && arr[3] == 0) break;
		   
		   int A;
		   int B;
		   int C;
		   int D;
		   
		   if(arr[0] < arr[1]) {
			   A = arr[1];
			   B = arr[0];
		   } else {
			   A = arr[0];
			   B = arr[1];
		   }
		   
		   if(arr[2] < arr[3]) {
			   C = arr[3];
			   D = arr[2];
		   } else {
			   C = arr[2];
			   D = arr[3];
		   }
		   
		   int start = 1;
		   int end = 100;
		   int result = 0;
		   
		   while(start <= end) {
			   
				int mid = (start + end) / 2;

				if (A * mid <= C * 100 && B * mid <= D * 100) {
					
					start = mid + 1;
					result = mid;
					
				} else end = mid - 1;
		   }
		   
		   
		   sb.append(result + "%" +"\n");
		   
	   }
	   
	   System.out.println(sb);
	   
   }
}
