import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test10();
	}

	public static void test10() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Map<String, Integer> map = new HashMap<>();
		
		for(int i = 0; i < N; i++) {
			String name = br.readLine();
			map.put(name, map.getOrDefault(name, 0) + 1);
		}
		
		for(int i = 0; i < N-1; i++) {
			String name = br.readLine();
			if(map.containsKey(name) && map.get(name) == 1) {
				map.remove(name);
			} else {
				map.put(name, map.get(name)-1);
			}
		}

		System.out.println(map.keySet().iterator().next());
		
	}
}
