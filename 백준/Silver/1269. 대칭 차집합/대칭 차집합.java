import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test06();
	}

	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine(), " ");
		Set<Integer> ASet = new HashSet<>();
		Set<Integer> AMBSet = new HashSet<>();
		for(int i = 0; i < A; i++) {
			int temp = Integer.parseInt(st.nextToken());
			ASet.add(temp);
			AMBSet.add(temp);
		}
		
		st = new StringTokenizer(br.readLine(), " ");
		Set<Integer> BSet = new HashSet<>();
		Set<Integer> BMASet = new HashSet<>();
		for(int i = 0; i < B; i++) {
			int temp = Integer.parseInt(st.nextToken());
			BSet.add(temp);
			BMASet.add(temp);
		}
		
		AMBSet.removeAll(BSet);
		BMASet.removeAll(ASet);
		
		System.out.println(AMBSet.size() + BMASet.size());
	}
}
