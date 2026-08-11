import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test10();
	}

	public static void test10() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int front = 0;
		int back = 0;
		for(int i = 0; i < N; i++) {
			
			int coin = Integer.parseInt(st.nextToken());
			front += (coin == 1) ? 1 : 0;
			back += (coin != 1) ? 1 : 0;
			
		}
		
		System.out.println(Math.min(front, back));
		
	}
}
