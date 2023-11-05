import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int STR = Integer.parseInt(st.nextToken());
		int DEX = Integer.parseInt(st.nextToken());
		int INT = Integer.parseInt(st.nextToken());
		int LUK = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		
		int answer = 0;
		
		answer += N - STR;
		answer += N - DEX;
		answer += N - INT;
		answer += N - LUK;
		
		System.out.println(Math.max(answer, 0));
	}
}
