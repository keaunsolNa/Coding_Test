import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test04();
	}

	public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
		
		int min = 1001;
		for(int i = 0; i < testCase; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int A  = Integer.parseInt(st.nextToken());
			int B  = Integer.parseInt(st.nextToken());
			
			if(A<=B) {
				if(min > B) {
					min = B;
				}
			}
		}
		
		if(min != 1001) {
			System.out.println(min);
		} else {
			System.out.println(-1);
		}
	}
}
