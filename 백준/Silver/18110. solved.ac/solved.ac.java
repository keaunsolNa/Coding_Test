import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) throws IOException {
		test10();
	}

	public static void test10() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] level = new int[N];
		for(int i = 0; i < N; i++) {
			level[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(level);
		
		int percent = (int)Math.round(N*0.15);
		
		int total = 0;
		for(int i = percent; i < level.length-percent; i++) {
			total += level[i];
		}
		
		System.out.println(Math.round((double)total/(N-percent-percent)));
	}
}
