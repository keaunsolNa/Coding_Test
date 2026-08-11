import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test06();
	}

	public static void test06() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		Map<String, Integer> hashMap = new HashMap<>();
		
		for(int i = 0; i < N; i++) {
			String name = br.readLine();
			hashMap.put(name, hashMap.getOrDefault(name, 0) + 1);
		}

		List<Map.Entry<String, Integer>> entryList = new LinkedList<>(hashMap.entrySet());
		entryList.sort(new Comparator<Map.Entry<String, Integer>>() {
		    @Override
		    public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
	    		return o2.getValue() - o1.getValue();
		    }
		});
		
		List<String> name = new ArrayList<>();
		if(entryList.get(0).getValue() == entryList.get(1).getValue()) {
			name.add(entryList.get(0).getKey());
			for(int i = 1; i < entryList.size(); i++) {
				if(entryList.get(0).getValue() == entryList.get(i).getValue()) {
					name.add(entryList.get(i).getKey());
				}
			}
		} else {
			name.add(entryList.get(0).getKey());
		}
		
		for(int i = 0; i < name.size(); i++) {
			
			if(i != name.size()-1) {
				System.out.println(name.get(i));
			} else {
				System.out.print(name.get(i));
			}
		}
	}
}
