import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test04();
	}

	public static void test04() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		List<Integer> arrList = new ArrayList<>();
		for(int i = 0; i < N; i++) {
			arrList.add(Integer.parseInt(st.nextToken()));
		}
		
		Collections.sort(arrList);
		
		int cnt = 0;
		for(int i = 0; i < arrList.size(); i++) {
			if(arrList.get(i) != i +1) {
				System.out.println(i + 1);
				cnt++;
				break;
			}
		}
		
		if(cnt == 0) {
			System.out.println(N + 1);
		}
	}
}
