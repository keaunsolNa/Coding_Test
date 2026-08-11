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
		test08();
	}

	public static void test08() throws NumberFormatException, IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		Deque<String> deque = new LinkedList<>();
		for(int i = 0; i < N; i++) {
			deque.add(br.readLine());
			if(deque.peekLast().equals("Un")) {
				if(deque.peekFirst().equals("A")) {
					deque.pollFirst();
					deque.pollLast();
				}
			}
		}

		if(deque.isEmpty()) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
		
	}
}
