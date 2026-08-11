import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	private static int N;
	private static int M;

	public static void main(String[] args) throws IOException {
		test01();
	}

	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int[] numbers = new int[N + 1];
		for(int i = 1; i <= N; i++) numbers[i] = Integer.parseInt(st.nextToken());
		
		for(int i = 1; i <= N; i++) numbers[i] += numbers[i - 1];
		
		for(int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			
			sb.append(getRangedSum(numbers, A, B) + "\n");
		}
		
		sb.deleteCharAt(sb.length() - 1);
		
		System.out.print(sb);
	}

	public static int getRangedSum(int[] arr, int L, int R) {
        return arr[R] - arr[L-1];
    }
}
