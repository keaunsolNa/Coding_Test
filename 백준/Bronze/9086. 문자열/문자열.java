import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	private static int N;

	public static void main(String[] args) throws IOException {
		test07();
	}

	public static void test07() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		StringBuilder A = new StringBuilder(st.nextToken());
		StringBuilder B = new StringBuilder(st.nextToken());
		int answer = 0;
		if(A.length() == B.length()) {
			
			for(int i = 0; i < A.length(); i++) {
				if(A.charAt(i) != B.charAt(i)) {
					answer++;
				}
			}
			System.out.println(answer);
		} else {
			N = B.length();
			dfsString(B.length(), A, B);
			System.out.println(N);
		}
		
	}

	public static void dfsString(int key, StringBuilder A, StringBuilder B) {
		if(A.length() >= key) {
			int delete = 0;
			for(int i = 0; i < A.length(); i++) {
				if(A.charAt(i) != 'X') {
					if(A.charAt(i) != B.charAt(i)) {
						delete++;
					}
				}
			}
			if(delete < N) {
				N = delete;
			}
			return;
		} else {
			dfsString(key, A.append("X"), B);
			A.deleteCharAt(A.length()-1);
			dfsString(key, A.insert(0, "X"), B);
		}
	}
}
