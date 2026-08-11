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
		test07();
	}

	public static void test07() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Map<String, String> log = new HashMap<>();
		
		for(int i = 0; i < N; i++) {
			String[] temp = br.readLine().split(" ");
			String name = temp[0];
			
			if(log.containsKey(name)) {
				log.remove(name);
			} else {
				log.put(name, "enter");
			}
		}

		List<String> nameList = new ArrayList<>(log.keySet());
		Collections.sort(nameList, Comparator.reverseOrder());
		for (String string : nameList) {
			System.out.println(string);
		}
	}
}
