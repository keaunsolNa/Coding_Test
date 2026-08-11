import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test04();
	}

	public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		String input = br.readLine();
		
		if(N <= 25) {
			System.out.println(input);
			System.exit(0);
		}
		
		String sub = input.substring(12, N - 12);

		if(!sub.contains(".")) 
			System.out.println(input.substring(0, 11) + "..." + input.substring(N - 11, N));
		else 
			System.out.println(input.substring(0, 9) + "......" + input.substring(N - 10));
		
	}
}
