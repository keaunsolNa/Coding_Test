import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test02();
	}

	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		int C = Integer.parseInt(br.readLine());
		int D = Integer.parseInt(br.readLine());
		String answer = "";
		if(A < B) {
			if(B < C) {
				if(C < D) {
					answer = "Fish Rising";
				} else {
					answer = "No Fish";
				}
			} else {
				answer = "No Fish";
			}
		} else if (A > B) {
			if(B > C) {
				if(C > D) {
					answer = "Fish Diving";
				} else {
					answer = "No Fish";
				}
			} else {
				answer = "No Fish";
			}
		} else if(A == B) {
			if(B == C) {
				if(C == D) {
					answer ="Fish At Constant Depth";
				} else {
					answer = "No Fish";
				}
			} else {
				answer = "No Fish";
			}
		}
		
		System.out.println(answer);
	}
}
