import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test10();
	}

   public static void test10() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringBuilder sb = new StringBuilder();
	   
	   String input = "";
	   
	   while((input = br.readLine()) != null) {	
		   
		   // 문자열 int 배열로
		   int[] arr = Arrays.stream(input.split(" ")).map(String::trim).mapToInt(Integer::parseInt).toArray();
		   
		   for(int i = 0; i < arr.length; i++) {
			   
			   if(i == 0) sb.append((arr[0]) * (arr[1]));
			   else if(i == arr.length - 1) sb.append(arr[arr.length - 1] * arr[arr.length - 2]);
			   else sb.append(arr[i - 1] * arr[i] * arr[i + 1]);
			   sb.append(" ");
			   
		   }
		   
		   sb.append("\n");
	   }
	   
	   System.out.println(sb);
   }
}
