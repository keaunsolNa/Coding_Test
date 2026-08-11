import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test05();
	}

	public static void test05() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int E = Integer.parseInt(st.nextToken());
		int S = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int e = 1, s = 1, m = 1, cnt = 0;
		while(true) {
			cnt++;
			if(s == S && m == M && e == E) {
				break;
			}
			e++; m++; s++;
			if(e > 15) {
				e = 1;
			}
			if(m > 19) {
				m = 1;
			}
			if(s > 28) {
				s = 1;
			}
		}
		
		System.out.println(cnt);
	}
}
