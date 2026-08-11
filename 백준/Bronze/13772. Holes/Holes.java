import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) throws IOException {
		test10();
	}

	public static void test10() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		while(N --> 0) {
			
			int cnt = 0;
			char[] input = br.readLine().toCharArray();
			
			for(int i = 0; i < input.length; i++) {
				
				cnt += (input[i] == 'A' || input[i] == 'D' || input[i] == 'O' || input[i] == 'P' || input[i] == 'Q' || input[i] == 'R') ? 1 
						: input[i] == 'B' ? 2 : 0;
			}
			
			System.out.println(cnt);
		}
	}
}
