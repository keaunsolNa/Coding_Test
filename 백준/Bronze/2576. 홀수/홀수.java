import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test08();
	}

	public static void test08() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int min = 101;
		int sum = 0;
		for(int i = 0; i < 7; i++) {
			int temp = Integer.parseInt(br.readLine());
			if(temp%2 == 1) {
				sum += temp;
				if(temp < min) {
					min = temp;
				}
			}
		}
		
		if(sum == 0) {
			System.out.println(-1);
		} else {
			System.out.println(sum);
			System.out.println(min);
		}
	}
}
