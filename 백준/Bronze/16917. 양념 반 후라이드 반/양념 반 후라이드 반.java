import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test07();
	}

	public static void test07() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		int X = Integer.parseInt(st.nextToken());
		int Y = Integer.parseInt(st.nextToken());
		
		int price = 0;
		if(A + B > C * 2) {
			price += C * 2 * Math.min(X, Y);
			if(X > Y) { 
				if(C * 2 < A) price += C * 2 * (X - Y);
				else price += (X - Y) * A;
			}
			else {
				if(C * 2 < B) price += C * 2 * (Y - X);
				else price += (Y - X) * B;
			}
		}
		else {
			price += A*X + B*Y;
		}
		
		System.out.println(price);
	}
}
