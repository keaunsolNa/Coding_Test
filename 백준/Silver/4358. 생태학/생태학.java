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
import java.util.PriorityQueue;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test06();
	}

	public static void test06() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = "";
		int total = 0;
		Map<String, Integer> tree = new TreeMap<>();
		while(true) {
			input = br.readLine();
			if(input == null) break;
			tree.put(input, tree.getOrDefault(input, 0) + 1);
			total++;
		}
		
		for(String treeName : tree.keySet()) {
			double percent = (double) tree.get(treeName) / (double) total * 100;
			percent = Math.round(percent*10000)/10000.0;
			System.out.print(treeName + " ");
			System.out.printf("%.4f", percent);
			System.out.println();
		}
	}
}
