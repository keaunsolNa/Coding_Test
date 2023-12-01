import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
	private static boolean[] isPrime;
   public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 소수를 구할 범위
		int N = Integer.parseInt(br.readLine());
		List<Integer> list = new ArrayList<>();
		sieve(N);

		for (int i = 0; i < N + 1; i++)
			if (isPrime[i])
				list.add(i);
		
		int start = 0, end = 0, sum = 0, ans = 0;

		while(true) {
			
			if(sum >= N) sum -= list.get(start++);
			else if(end == list.size()) break;
			else sum += list.get(end++);
			if(N == sum) ans++;
			
		}
		
		System.out.println(ans);
	}

	private static void sieve(int N) {

		isPrime = new boolean[N + 1];

		Arrays.fill(isPrime, true);

		isPrime[0] = false;
		isPrime[1] = false;

		for (int i = 2; i * i <= N; i++) {

			if (isPrime[i]) {

				for (int j = 2 * i; j < N + 1; j += i) {
					isPrime[j] = false;
				}
			}
		}
	}
}