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
		test03();
	}

	public static void test03() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		String[] stu = new String[N];
		
		for(int i = 0; i < N; i++) stu[i] = br.readLine();
		
		int idx = 0;
		int ans = 0;
		int length = stu[0].length();
		while(true) {
			
			Set<String> set = new HashSet<>();
			for(int i = 0; i < N; i++) set.add(stu[i].substring(length - idx - 1, length));
			ans++;	
			idx++;
			if(set.size() == N) break;
		}
		
		System.out.println(ans);
	}
}
