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
		test02();
	}

	public static void test02() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String pattern = "^[A-Za-z]*$";
		String input = "";
		StringBuilder sb2 = new StringBuilder();
		while((input = br.readLine()) != null) {
			StringBuilder sb = new StringBuilder();
			Map<String, Integer> wordMap = new TreeMap<>();
			int n = Integer.parseInt(input);
			
			String inputText = "";
			while(!(inputText = br.readLine()).equals("EndOfText")) {
				if(inputText.equals("")) {
					continue;
				}
				inputText = inputText.replaceAll("[.]", " ");
				inputText = inputText.replaceAll("[,]", " ");
				inputText = inputText.replaceAll("^[1-9]*$", " ");
				String[] temp = inputText.split(" ");
				
				for(int i = 0; i < temp.length; i++) {
					String vocal = temp[i].toLowerCase();
					if(vocal.matches(pattern) && (!vocal.equals(""))) {
						wordMap.put(vocal, wordMap.getOrDefault(vocal, 0)+1);
					}
				}
			}
			
			for (String vocal : wordMap.keySet()) {
				if(wordMap.get(vocal) == n) {
					sb.append(vocal).append("\n");
				}
			}
			
			if(sb.toString().isEmpty()) {
				sb2.append("There is no such word.").append("\n");
			} else {
				sb2.append(sb);
			}
			
			sb2.append("\n");
		}
		
		sb2.deleteCharAt(sb2.length() - 1);
		sb2.deleteCharAt(sb2.length() - 1);
		System.out.print(sb2);
	}
}
