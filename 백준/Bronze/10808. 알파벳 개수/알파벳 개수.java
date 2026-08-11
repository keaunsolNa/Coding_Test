import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test06();
	}

	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String S = br.readLine();
		StringBuilder sb = new StringBuilder();
		for(int i = 97; i < 123; i++) {
			int answer = 0;
			for(int j = 0; j < S.length(); j++) {
				if(i == S.charAt(j)) {
					answer++;
				}
			}
			if(i != 122) {
				sb.append(answer).append(" ");
			} else {
				sb.append(answer);
			}
		}
		System.out.println(sb);
	}
}
