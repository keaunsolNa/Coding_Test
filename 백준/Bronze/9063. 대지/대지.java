import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test03();
	}

	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());

        int[] x = new int[N];
        int[] y = new int[N];

        for (int i = 0; i < N; i++) {
            String[] arr = br.readLine().split(" ");
            x[i] = Integer.parseInt(arr[0]);
            y[i] = Integer.parseInt(arr[1]);
        }

        Arrays.sort(x);
        Arrays.sort(y);
        System.out.println((x[N - 1] - x[0]) * (y[N - 1] - y[0]));
		
	}
}
