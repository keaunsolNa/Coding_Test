import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test05();
	}

	public static void test05() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		String[] adjectives = new String[N];
		String[] nouns  = new String[M];
		
		for(int i = 0; i < N; i++) adjectives[i] = br.readLine();
		for(int i = 0; i < M; i++) nouns[i] = br.readLine();
	
		for(int i = 0; i < adjectives.length; i++) {
			
			for(int j = 0; j < nouns.length; j++) {
				sb.append(adjectives[i] + " as " + nouns[j]).append("\n");
			}
		}
		
		sb.deleteCharAt(sb.length()-1);
		System.out.print(sb);
	}
}
