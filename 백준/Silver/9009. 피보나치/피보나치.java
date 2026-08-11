import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test07();
	}

	public static void test07() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		long[] arr = new long[T];
		long max = 0;
		for(int i = 0; i < T; i++) {
			int n = Integer.parseInt(br.readLine());
			max = Math.max(max, n);
			arr[i] = n;
		}
		
		List<Long> list = new ArrayList<>();
		for(long i = 2; ; i++) {
			long temp = fibonacci(i);
			if(temp > max) break;
			list.add(temp);
		}
		
		for(int i = 0; i < arr.length; i++) {
			List<Long> answer = new ArrayList<>();
			
			long target = arr[i];
			
			while(target != 0) {
				for (int l = list.size() - 1; l >= 0; l--) {
					
	                if (list.get(l) <= target) {
	                	target -= list.get(l);
	                    answer.add(list.get(l));
	                }
	            }
			}
			
			for(int a = answer.size() - 1; a >= 0; a--) {
				System.out.print(answer.get(a) + " ");
			}
			System.out.println();
		}
		
	}

	private static long fibonacci(long n) {
		if(n < 2) return n;
		
		long f0 = 0, f1 = 1, f2 = 1;
		
		for(int i = 2; i < n; i++) {
			f0 = f1;
			f1 = f2;
			f2 = f1 + f0;
		}
		return f2;
	}
}
