import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

   public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String A = br.readLine();
		String B = br.readLine();
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < A.length(); i++) 
			sb.append(A.charAt(i) > B.charAt(i) ? A.charAt(i) : B.charAt(i));
		
		
		System.out.println(sb);
   }
}