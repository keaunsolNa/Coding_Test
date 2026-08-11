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
		test03();
	}

	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Map<Integer, int[]> map = new TreeMap<>(Collections.reverseOrder());
		StringTokenizer st;
		
		while(N --> 0) {
			st = new StringTokenizer(br.readLine(), " ");
			int nation = Integer.parseInt(st.nextToken());
			int student = Integer.parseInt(st.nextToken());
			int point = Integer.parseInt(st.nextToken());
			
			map.put(point, new int[] {nation, student});
			
		}

		Iterator<Integer> iter = map.keySet().iterator();
		
		while(true) {
			int key1 = iter.next();
			int firstNation = map.get(key1)[0];
			int firstStudnt = map.get(key1)[1];
			
			int key2 = iter.next();
			int secondNation = map.get(key2)[0];
			int secondStudent = map.get(key2)[1];
			
			int threeNation = 0;
			int threeStudent = 0;
			if(firstNation == secondNation) {
				int key3 = iter.next();
				
				while(map.get(key3)[0] == firstNation) {
					key3 = iter.next();
				}
				
				threeNation = map.get(key3)[0];
				threeStudent = map.get(key3)[1];
			} else {
				int key3 = iter.next();
				threeNation = map.get(key3)[0];
				threeStudent = map.get(key3)[1];
			}
			
			System.out.println(firstNation + " " + firstStudnt);
			System.out.println(secondNation + " " + secondStudent);
			System.out.println(threeNation + " " + threeStudent);
			break;
		}
		
	}
}
