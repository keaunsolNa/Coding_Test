import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) throws IOException {
		test10();
	}

	public static void test10() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		while (true) {
			
			int index = 1;
			int N = Integer.parseInt(br.readLine());
			if (N == 0) break;
			
			for (int i = 0; i < N; i++) {
			
				boolean check = false;
				String line = br.readLine();
				
				for (int j = 0; j < line.length(); j++) {
				
					if (line.charAt(j) == ' ' && j + 1 >= index) {
						index = j + 1;
						check = true;
						break;
					}
				}
				
				if (!check && index < line.length() + 1) index = line.length() + 1;
			}
		
			sb.append(index +"\n");
		}
		
		System.out.print(sb);
	}
}
