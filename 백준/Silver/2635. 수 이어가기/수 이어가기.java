import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test10();
	}

	public static void test10() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		int cnt = 0;
		List<Integer> result = new ArrayList<>();
		
		for(int i = N; i >= N/2; i--) {
			
			List<Integer> list = new ArrayList<>();
			list.add(N);
			
			int before = N;
			int now = i;
			
			while(true) {
				
				if(before < 0) break;
				
				int temp = before;
				
				if(now >= 0) list.add(now);
				
				before = now;
				now = temp - before;
				
			}
			
			if(cnt < list.size()) {
				cnt = list.size();
				result = list;
			}
			
		}
		
		System.out.println(cnt);
		for (Integer integer : result) System.out.print(integer +" ");
			
	}
}
