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
		test08();
	}

	public static void test08() throws NumberFormatException, IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Map<String, Integer> map = new HashMap<>();
		String input = "";
		int max = 0;
		String answer = "";
		boolean flag = false;
		while(!(input = br.readLine()).equals("***")) {
			
			map.put(input, map.getOrDefault(input, 0) + 1);
			
			if(map.get(input) > max) {
				answer = input;
				max = map.get(input);
				flag = false;
			} else if(map.get(input) == max) {
				flag = true;
			}
		}
			
		if(flag) {
			System.out.println("Runoff!");
		} else {
			System.out.println(answer);
		}
	}
}
