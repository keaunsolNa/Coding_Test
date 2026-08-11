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
		test06();
	}

	public static void test06() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		if(N == 1) {
			System.out.println(0);
			return;
		}
		
		int P = Integer.parseInt(br.readLine());
		List<Integer> arrList = new ArrayList<>();
		for(int i = 1; i < N; i++) {
			int temp = Integer.parseInt(br.readLine());
			arrList.add(temp);
		}
		
		int cnt = 0;
		while(true) {
			Collections.sort(arrList);
			if(arrList.get(N-2) < P) break;
			cnt++;
			arrList.set(N-2, arrList.get(N-2)-1);
			P++;
		}
		
		System.out.println(cnt);
		
	}
}
