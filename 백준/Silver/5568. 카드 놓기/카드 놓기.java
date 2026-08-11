import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	static int[] result;
	static int[] target;
	static boolean[] visited;
	static Set<Integer> set = new LinkedHashSet<>();

	public static void main(String[] args) throws NumberFormatException, IOException {
		test02();
	}

	public static void test02() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int K = Integer.parseInt(br.readLine());
		target = new int[N];
		result = new int[K];
		visited = new boolean[N+1];
		
		for(int i = 0; i < N; i++) {
			target[i] = Integer.parseInt(br.readLine());
		}
		
		permutation(0, N, K);
		
		System.out.println(set.size());
		
	}

	public static void permutation(int cnt, int N, int K) {
		
		if(cnt == K) {
			String temp = "";
			for(int i = 0; i < result.length; i++) {
				temp += result[i] + "";
			}
			set.add(Integer.parseInt(temp));
			return;
		}
		for(int i = 0; i < N; i++) {
			if(!visited[i]) {
				visited[i] = true;
				result[cnt] = target[i];
				permutation(cnt + 1, N, K);
				visited[i] = false;
			}
		}
	}
}
