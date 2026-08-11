import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test07();
	}

	public static void test07() throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int sum = 0;
		int max = 0;
		for(int i = 0; i < N; i++) {
			String[] temp = br.readLine().split(" ");
			int a = Integer.parseInt(temp[0]);
			int b = Integer.parseInt(temp[1]);
			int c = Integer.parseInt(temp[2]);
			
			if(a == b && b == c) {
				sum += (10000 + (a*1000));
			} else if(a != b && a != c && b != c) {
				sum += Math.max(Math.max(a, b), c)*100;
			} else {
				if(a == b) {
					sum += 1000 + a*100;
				} else if (a == c) {
					sum += 1000 + a*100;
				} else if (b == c) {
					sum += 1000 + b*100;
				}
			}
			
			if(max < sum) {
				max = sum;
			}
			sum = 0;
		}
		
		System.out.println(max);
	}
}
