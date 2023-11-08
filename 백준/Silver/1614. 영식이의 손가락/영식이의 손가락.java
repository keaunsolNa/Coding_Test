import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

   public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		long count = Integer.parseInt(br.readLine());
		long result;
		
		if(N == 1) result = (long)(count * 8);
		else if(N == 2) result = (long)(1 + (count / 2) * 8 + (count % 2) * 6);
		else if(N == 3) result = (long)(2 + (count / 2) * 8 + (count % 2) * 4);
		else if(N == 4) result = (long)(3 + (count / 2) * 8 + (count % 2) * 2);
		else result = (long)(4 + count * 8);

		System.out.println(result);
   }
}