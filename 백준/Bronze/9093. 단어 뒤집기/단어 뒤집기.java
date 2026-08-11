import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test03();
	}

	public static void test03() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		StringBuilder answer = new StringBuilder();
		
		for(int i = 0; i < testCase; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			while(st.hasMoreTokens()) {
				sb = new StringBuilder(st.nextToken());
				sb.reverse();
				answer.append(sb).append(" ");
			}
			System.out.println(answer);
			answer.delete(0,answer.length());
		}
		
	}
}
