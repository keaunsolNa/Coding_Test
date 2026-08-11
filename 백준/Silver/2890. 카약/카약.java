import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test09();
	}

	public static void test09() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		
		Map<Integer, Integer> map = new HashMap<>();
		for(int i = 0; i < x; i++) {
			
			String input = br.readLine();
			for(int j = 0; j < y; j++) {
				
				char temp = input.charAt(j);
				if(temp != 'S' && temp != '.' && temp != 'F') {
					map.put(Character.getNumericValue(temp), y - j);
					break;
				}
			}
		}
		
		Set<Integer> set = new HashSet<>();
		for (int key : map.keySet()) set.add(map.get(key));
		
		List<Integer> sortList = new ArrayList<>(set);
		Collections.sort(sortList);
		
		for (Integer key : map.keySet()) System.out.println(sortList.indexOf(map.get(key)) + 1);
	}
}
