import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test04();
	}

	public static void test04() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()); 
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int answer = 0;

		for(int i = 0; i < N; i++) {
			
			String quizStr = br.readLine();
			Set<Character> charHash = new HashSet<>();
			
			for(int j = 0; j < quizStr.length(); j++) {
				if(((int)quizStr.charAt(j))-64 > M) {
					break;
				} else
				charHash.add(quizStr.charAt(j));
			}
			
			if(quizStr.length() == charHash.size()) {
				answer++;
			}
		}
		
		System.out.println(answer);
	}
}
