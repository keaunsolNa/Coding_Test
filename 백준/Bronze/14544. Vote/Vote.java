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
		test07();
	}

	public static void test07() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int P = Integer.parseInt(br.readLine());
		for(int i = 0; i < P; i++) {
			String[] temp = br.readLine().split(" ");
			int N = Integer.parseInt(temp[0]);
			int M = Integer.parseInt(temp[1]);
			Map<String, Integer> map = new HashMap<>();
			for(int j = 0; j < N; j++) {
				String name = br.readLine();
				map.put(name, 0);
			}
			
			for(int j = 0; j < M; j++) {
				String[] strArr = br.readLine().split(" ");
				String name = strArr[0];
				Integer vote = Integer.parseInt(strArr[1]);
				map.put(name, map.getOrDefault(name, 0) + vote);
			}

			int max = 0;
			
			List<Map.Entry<String, Integer>> entryList = new LinkedList<>(map.entrySet());
			entryList.sort(new Comparator<Map.Entry<String, Integer>>() {
			    @Override
			    public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
				return o2.getValue() - o1.getValue();
			    }
			});
			
			String answer = "";
			if(entryList.get(0).getValue().equals(entryList.get(1).getValue())) {
				answer = "VOTE " + (i+1) + ": THERE IS A DILEMMA";
			} else {
				answer = "VOTE " + (i+1) + ": THE WINNER IS " + entryList.get(0).getKey() + " " + entryList.get(0).getValue();
			}
			
			System.out.println(answer);
		}
		
		
	}
}
