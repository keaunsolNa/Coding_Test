import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test04();
	}

	public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] W = new int[10];
		int[] K = new int[10];
		
		for(int i = 0; i < 10; i++) {
			W[i] = Integer.parseInt(br.readLine());
		}
		
		for(int i = 0; i < 10; i++) {
			K[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(W);
		Arrays.sort(K);
		
		int sumW = W[9] + W[8] + W[7];
		int sumK = K[9] + K[8] + K[7];
		
		System.out.println(sumW + " " + sumK);
	}
}
