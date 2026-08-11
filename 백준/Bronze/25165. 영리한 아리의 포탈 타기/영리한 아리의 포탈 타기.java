import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test04();
	}

	public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken());
		int D = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int S1 = Integer.parseInt(st.nextToken());
		int S2 = Integer.parseInt(st.nextToken());
		
		if(S1 != N) {
			System.out.println("NO...");
			return;
		}
		
		if(D == 1) {
			if(N % 2 == 0) System.out.println("YES!");
			else System.out.println("NO...");
		} else {
			if(N % 2 != 0) System.out.println("YES!");
			else System.out.println("NO...");
		}
	}
}
