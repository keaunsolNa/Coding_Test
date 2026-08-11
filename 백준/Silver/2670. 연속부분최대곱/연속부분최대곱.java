import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	private static Integer[] dp;
	private static int max;
	private static int[] arr;

	public static void main(String[] args) throws IOException {
		test01();
	}

	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		double[] arr = new double[n + 1];
        double[] dp = new double[n + 1];
        double max = 0;
        
        for (int i = 1; i <= n; i++) {
            arr[i] = Double.parseDouble(br.readLine());
            dp[i] = Math.max(arr[i], dp[i-1] * arr[i]);
            max = Math.max(max, dp[i]);
        }
		
        System.out.printf("%.3f", max);
		
	}
}
