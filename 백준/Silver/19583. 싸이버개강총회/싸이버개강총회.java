import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.Stack;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test10();
	}

	public static void test10() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] time = br.readLine().split(" ");
		String[] S = time[0].split(":");
		int SH = (Integer.parseInt(S[0]) * 360) + (Integer.parseInt(S[1]));

		String[] E = time[1].split(":");
		int EH = (Integer.parseInt(E[0]) * 360) + (Integer.parseInt(E[1]));
		
		String[] Q = time[2].split(":");
		int QH = (Integer.parseInt(Q[0]) * 360) + (Integer.parseInt(Q[1]));
		
		String input = "";
		Map<String, Integer> map = new HashMap<>();
		
		while((input = br.readLine()) != null)  {
			
			String[] T = input.split(" ")[0].split(":");
			
			int TH = (Integer.parseInt(T[0]) * 360) + (Integer.parseInt(T[1])); 
			String name = input.split(" ")[1];
			
			if(TH <= SH) {
				map.put(name, 0);
			} else if(TH >= EH && TH <= QH) {
				
				if(map.containsKey(name)) map.put(name, 1);
			}
		}
		
		int ans = 0;
		for(String key : map.keySet()) if(map.get(key) == 1) ans++;
		
		System.out.println(ans);
	}
}
