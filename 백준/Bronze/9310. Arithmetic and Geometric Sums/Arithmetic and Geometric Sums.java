import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	private static int plus;
	private static long sum;
	private static long prev;

	public static void main(String[] args) throws IOException {
		test01();
	}

	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		String input = "";
		
		while(!(input = br.readLine()).equals("0")) {
			int N = Integer.parseInt(input);
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			
			gsOrAs(a, b, c, N);
			sb.append(sum + "\n");
			
			N = Integer.parseInt(br.readLine());
			st = new StringTokenizer(br.readLine());
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken()); 
			c = Integer.parseInt(st.nextToken()); 
			
			gsOrAs(a, b, c, N);
			sb.append(sum + "\n");
			
		}
		
		System.out.println(sb);
	}

	private static void gsOrAs(int a, int b, int c, int N) {
		
		if(b - a == c - b) {
			
			plus = b - a;
			sum = a;
			prev = a;
			as(a, N);
			
		} else {
			
			plus = b / a;
			sum = a;
			prev = a;
			gs(a, N);
			
		}
	}

	private static void gs(int start, int N) {
		
		for(int i = 0; i < N - 1; i++) {
			sum += prev * plus;
			prev *= plus;
		}
	}

	private static void as(int start, int N) {
		
		for(int i = 0; i < N - 1; i++) {
			sum += prev + plus;
			prev += plus;
		}
	}
}
