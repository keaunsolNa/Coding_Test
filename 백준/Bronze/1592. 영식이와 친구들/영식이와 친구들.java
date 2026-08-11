import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test07();
	}

	public static void test07() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int L = Integer.parseInt(st.nextToken());
		
		int[] cnt = new int[N];
		cnt[0] = 1;
		int target = 0;
		int total = 1;
		
		if(M == 1) {
			System.out.println(0);
			return;
		}
		while(true) {
			
			if(cnt[target] % 2 != 0) {
				if(target + L >= N) target =  ((target + L) - N);
				else target = target + L;
				cnt[target]++;
			} else {
				if(target - L < 0) target = N - (Math.abs(target - L));
				else target = target - L;
				cnt[target]++;
			}
			
			for(int i = 0; i < cnt.length; i++) {
				if(cnt[i] == M) {
					System.out.println(total);
					return;
				};
			}
			total++;
		}
		
	}
}
