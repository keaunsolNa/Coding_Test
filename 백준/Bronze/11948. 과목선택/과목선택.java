import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test03();
	}

	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[4];
		for(int i = 0; i < 4; i ++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(arr);
		int c = Math.max(Integer.parseInt(br.readLine()), Integer.parseInt(br.readLine()));

		System.out.println(arr[3] + arr[2] + arr[1] + c);
		
	}
}
