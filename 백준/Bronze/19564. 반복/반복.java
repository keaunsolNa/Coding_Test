import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

   public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		int cnt = 1;
		char cur = input.charAt(0);
		
		for (int i = 1; i < input.length(); i++) {
			char next = input.charAt(i);
			if(next - 'a' <= cur - 'a') cnt++;
			cur = next;
		}
		
		System.out.println(cnt);
   }
}