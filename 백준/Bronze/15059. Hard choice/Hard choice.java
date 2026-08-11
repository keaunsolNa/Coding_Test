import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test02();
	}

	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int x1 = Integer.parseInt(st.nextToken());
		int x2 = Integer.parseInt(st.nextToken());
		int x3 = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine(), " ");
		int y1 = Integer.parseInt(st.nextToken());
		int y2 = Integer.parseInt(st.nextToken());
		int y3 = Integer.parseInt(st.nextToken());
		
		int sum = 0;
		if(x1 < y1) {
			sum += y1 - x1;
		} 
		if(x2 < y2) {
			sum += y2 - x2;
		} 
		if(x3 < y3) {
			sum += y3 - x3;
		}
		
		System.out.println(sum);
	}
}
