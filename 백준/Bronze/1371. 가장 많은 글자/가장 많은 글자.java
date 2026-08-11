import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test07();
	}

	public static void test07() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		while(sc.hasNext()) {
			sb.append(sc.nextLine().replaceAll(" ", ""));
		}
		
		Map<String, Integer> hashMap = new HashMap<>();
		for(int i = 0; i < sb.length(); i++) {
			hashMap.put((sb.charAt(i)+""), hashMap.getOrDefault((sb.charAt(i)+""), 0) +1);
		}
		
		List<Integer> valueList = new ArrayList<>(hashMap.values());
		valueList.sort(Integer::compareTo);

		int max = valueList.get(valueList.size() -1);
			
		Iterator<String> iter = hashMap.keySet().iterator();
		StringBuilder answer = new StringBuilder();
		List<String> arr = new ArrayList<>();
		while(iter.hasNext()) {
			String temp = iter.next();
			if(hashMap.get(temp) == max) {
				arr.add(temp);
			}
		}
		
		Collections.sort(arr);
		for (String string : arr) {
			System.out.print(string);
		}
	}
}
