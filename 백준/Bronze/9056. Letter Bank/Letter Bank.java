import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test10();
	}

	public static void test10() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringTokenizer st;

		for(int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine());
			
			String bank = st.nextToken();
			String str = st.nextToken();
			boolean flag = true;
			for(int j = 0; j < str.length(); j++) {
				if(countChar(bank, str.charAt(j)) <= 0) {
					flag = false;
					break;
				}
			}
			
			for(int j = 0 ; j < bank.length(); j++) {
				if(countChar(str, bank.charAt(j)) <= 0) {
					flag = false;
					break;
				}
			}
			
			if(flag) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}

    public static long countChar(String str, char ch) {
        return str.chars()
                .filter(c -> c == ch)
                .count();
    }
}
