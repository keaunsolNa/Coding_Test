import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test05();
	}

	public static void test05() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		boolean[] arr = new boolean[T + 1];
		
		for(int i = 0; i < T; i++) {
			int temp = Integer.parseInt(st.nextToken());
			if(temp > T) {
				System.out.println("NIE");
				return;
			}
			arr[temp] = true;
		}
		
		for(int i = 1; i <= T; i ++) {
			
			if(!arr[i]) {
				System.out.println("NIE");
				return;
			}
		}
		
		System.out.println("TAK");
		
	}
}
