import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {

	private static int P;
	private static int Q;
	private static Map<Long, Long> map = new HashMap<>();

	public static void main(String[] args) throws NumberFormatException, IOException {
		test10();
	}

	public static void test10() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		long N = Long.parseLong(st.nextToken());
		P = Integer.parseInt(st.nextToken());
		Q = Integer.parseInt(st.nextToken());
		
		System.out.println(solve(N));;
		
		
	}

	private static long solve(long num) {
		if(num == 0) return 1;
		if(map.containsKey(num)) return map.get(num);
		
		long a = (long)Math.floor(num / P);
		long b = (long)Math.floor(num / Q);
		
		map.put(num, solve(a) + solve(b));
		
		return map.get(num);
	}
}
