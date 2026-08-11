import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test01();
	}

	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
		int K = Integer.parseInt(br.readLine());
		
		long sum = N;
		while(K --> 0) {
			N = Integer.parseInt(N + "0");
			sum += N;
		}
		
		System.out.println(sum);
		
	}
}
