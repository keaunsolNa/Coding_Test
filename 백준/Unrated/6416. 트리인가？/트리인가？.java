import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test02();
	}

	public static void test02() throws IOException {
		Scanner sc = new Scanner(System.in);
		Map<Integer, Integer> map;
		int tc = 1;
		
		while(true) {
			
			map = new HashMap<>();
			int edge = 0;
			
			while(true) {
				
				int A = sc.nextInt();
				int B = sc.nextInt();
				if(A == -1 && B == -1) return;
				else if(A == 0 && B == 0) break;

				map.put(A, map.getOrDefault(A, 0));
				map.put(B, map.getOrDefault(B, 0) + 1);
				edge++;
			}
			
			boolean chk = true;
			int root = 0;
			
			Iterator<Integer> key = map.keySet().iterator();
			
			while(key.hasNext()) {
				if(map.get(key.next()) == 0) root++;
				
				if(root > 1) {
					chk = false;
					break;
				}
			}
			
			if(map.size() == 0) 
				System.out.println("Case " + tc + " is a tree.");
			else if(chk && root == 1 && edge == map.size() - 1) 
				System.out.println("Case " + tc + " is a tree.");
			else
				System.out.println("Case " + tc + " is not a tree.");
			tc++;
		}
		
	}
}
