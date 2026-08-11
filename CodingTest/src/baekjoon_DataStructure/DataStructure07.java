package baekjoon_DataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class DataStructure07 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		test05();
	}
	
	
	// 問題 ２
	public static void test05() throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());
        Map<String, String> map = new HashMap<>();

        for(int i = 0; i < T; i++) {
        	st = new StringTokenizer(br.readLine(), " ");
        	map.put(st.nextToken(), st.nextToken());
        }
        
        int C = Integer.parseInt(br.readLine());
        for(int i = 0; i < C; i++) {
        	String input = br.readLine();
        	
        	if(map.containsKey(input)) sb.append(map.get(input));
        	else sb.append(input);
        }
        
        System.out.print(sb);
	}


	// AC
	public static StringBuilder sb = new StringBuilder();
	
	
}
