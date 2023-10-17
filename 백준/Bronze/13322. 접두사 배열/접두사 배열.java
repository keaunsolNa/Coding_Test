import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

   public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String S = br.readLine();
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < S.length(); i++) 
			sb.append(i).append('\n');
		
		System.out.println(sb.toString());
   }
}