import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {

	private static int[] parent;
	private static int[] moneyArr;

	public static void main(String[] args) throws NumberFormatException, IOException {
		test04();
	}

	public static void test04() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());

		parent = new int[N + 1];
        for(int i = 1; i <= N; i++) parent[i] = i;

        moneyArr = new int[N+1];
        boolean[] visited = new boolean[N+1];

        st = new StringTokenizer(br.readLine());
        for(int i = 1; i <= N; i++) moneyArr[i] = Integer.parseInt(st.nextToken());

        while(M-->0) {
        
        	st = new StringTokenizer(br.readLine());

            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            union(A, B);
        }

        int moneySum = 0;

        for(int i = 1; i<=N; i++) {
        	
            int rootIdx = find(i);

            if(visited[rootIdx]) {
                visited[i] = true;
                continue;
            }

            moneySum += moneyArr[rootIdx];

            visited[rootIdx] = true;
            visited[i] = true;
        }

        if(moneySum > K) System.out.println("Oh no");
        else System.out.println(moneySum);
		
	}

	private static void union(int idx1, int idx2) {
		
		int parent1 = find(idx1);
		int parent2 = find(idx2);
		
		if(moneyArr[parent1] >= moneyArr[parent2]) parent[parent1] = parent2;
		else parent[parent2] = parent1;
		
	}

	private static int find(int idx) {
    	
        if(parent[idx] == idx) return idx;
        else return find(parent[idx]);
        
    }
}
