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

	public static void main(String[] args) throws NumberFormatException, IOException {
		test01();
	}

	public static void test01() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Deque<Integer> deque = new LinkedList<>();
		
		for(int i = 1; i <= N; i++) {
			deque.add(i);
		}

		StringBuilder sb = new StringBuilder();
		while(deque.size() != 1) {
			sb.append(deque.pollFirst()).append(" ");
			
			if(deque.size() == 1) {
				break;
			} else {
				deque.add(deque.pollFirst());
			}
			
		}

		sb.append(deque.poll());
		System.out.println(sb);
	}
}
