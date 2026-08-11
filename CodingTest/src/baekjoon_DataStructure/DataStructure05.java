package baekjoon_DataStructure;

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

public class DataStructure05 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		test06();
	}
	
	
	// 생태학
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


	// N번째 큰 수
	public static void test09() throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
        StringTokenizer st;
        
        for(int i = 0; i < N; i++) {
        	st = new StringTokenizer(br.readLine(), " ");
            for(int j = 0; j < N; j++) {
                pq.offer(Integer.parseInt(st.nextToken()));
            }
        }
        
        for(int i = 0; i < N-1; i++) {
            pq.poll();
        }
        
        System.out.println(pq.poll());
	}


}
