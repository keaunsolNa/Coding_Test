import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test07();
	}

	public static void test07() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int B = Integer.parseInt(br.readLine());
		int cnt = 0;
		
		for(int i = 1; i <= 100000000; i += 2) {
			B -= (i * i);
			cnt++;
			if(B < 0) {
				System.out.println((cnt - 1));
				return;
			}
		}
	}
}
