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

	public static void main(String[] args) throws NumberFormatException, IOException {
		test10();
	}

	public static void test10() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		PriorityQueue<Integer> que = new PriorityQueue<>(Collections.reverseOrder());
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) que.add(Integer.parseInt(st.nextToken()));
		
		st = new StringTokenizer(br.readLine());
		boolean flag = true;
		for(int i = 0; i < M; i++) {
			
			int box = que.poll();
			int need = Integer.parseInt(st.nextToken());
			
			if(box >= need) que.add(box - need);
			else {
				flag = false;
				break;
			}
		}
		
		System.out.println(flag ? 1 : 0);
	}
}
