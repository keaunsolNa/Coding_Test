import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test05();
	}

	public static void test05() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 1; i <= T; i++) {
			
			int N = Integer.parseInt(br.readLine());
			
			st = new StringTokenizer(br.readLine());
			double[] arr = new double[N];
			for(int n = 0; n < N; n++) arr[n] = Integer.parseInt(st.nextToken());
			
			for(int c = 1; c < N - 1; c++) {
				
				if(arr[c] > (arr[c - 1] + arr[c + 1]) / 2)
					arr[c] = (arr[c - 1] + arr[c + 1]) / 2;
			}
			
			System.out.print("Case #" + i + ": ");
			System.out.printf("%.6f", arr[N - 2]);
			System.out.println();
		}
	}
}
