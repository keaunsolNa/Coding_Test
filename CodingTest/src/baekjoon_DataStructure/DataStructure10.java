package baekjoon_DataStructure;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class DataStructure10 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		test10();
	}
	
	
	// 
	private static  int[] tree;
	public static void test10() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		tree = new int[N + 1];
		
        for (int i = 1; i <= N; i++) tree[i] = i;
        
        for (int i = 0; i < M; i++) {
        	
            st = new StringTokenizer(br.readLine());
            int order = Integer.parseInt(st.nextToken());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
 
            if (order == 0) union(a, b);
            
            else if (order == 1) sb.append((chk(a, b) ? "YES" : "NO") + "\n");
            
            else continue;
            
        }
 
        System.out.println(sb.toString());
	}
	
	private static int find(int x) {
		
        if (x == tree[x]) return x;
        return tree[x] = find(tree[x]);
        
    }
 
	private static void union(int x, int y) {
    	
        x = find(x);
        y = find(y);
 
        if (x != y) {
        	
            if (x < y) tree[y] = x;
            else tree[x] = y;
            
        }
    }
 
	private static boolean chk(int x, int y) {
		
        x = find(x);
        y = find(y);
 
        if (x == y) return true;
        return false;
        
    }
	
}
