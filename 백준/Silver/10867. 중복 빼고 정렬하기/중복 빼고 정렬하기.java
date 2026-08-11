import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) throws IOException {
		test02();
	}

	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		Set<Integer> set = new HashSet<>();
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine(), " ");
		
		while(N --> 0) {
			set.add(Integer.parseInt(st.nextToken()));
		}
		
		List<Integer> sortList = new ArrayList(set);
		Collections.sort(sortList);
		for (Integer integer : sortList) sb.append(integer).append(" ");
		
		sb.deleteCharAt(sb.length() - 1);
		System.out.print(sb);
	}
}
