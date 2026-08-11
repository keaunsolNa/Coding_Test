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
		test01();
	}

	public static void test01() throws NumberFormatException, IOException {
		Scanner sc = new Scanner(System.in);
		Map<String, Integer> map = new HashMap<>();
		String input = "";
		while(sc.hasNext()) {
			String action = sc.next();
			map.put(action, map.getOrDefault(action, 0) + 1);
		}
		
		int total = 0;
		for (String temp : map.keySet()) {
			total += map.get(temp);
		}
		
		StringBuilder sb = new StringBuilder();

		String key = "Re";
		for(int i = 0; i < 7; i++) {
			if(map.containsKey(key)) {
				
				double percent = ((double)map.get(key) / total);
				sb.append(key + " ").append(map.get(key) + " ").append(String.format("%.2f", percent)).append("\n");
				
			} else {
				sb.append(key + " ").append(0).append(" 0.00").append("\n");
			}
			
			if(key.equals("Re")) {
				key = "Pt";
			} else if(key.equals("Pt")) {
				key = "Cc";
			} else if(key.equals("Cc")) {
				key = "Ea";
			} else if(key.equals("Ea")) {
				key = "Tb";
			} else if(key.equals("Tb")) {
				key = "Cm";
			} else if(key.equals("Cm")) {
				key = "Ex";
			}
		}
		sb.append("Total " + total + " 1.00");
		
		System.out.println(sb);
		
	}
}
