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
		test06();
	}

	public static void test06() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int H = Integer.parseInt(st.nextToken());
		int T = Integer.parseInt(st.nextToken());
		PriorityQueue<Integer> height = new PriorityQueue<>(Collections.reverseOrder());

		while(N --> 0) height.add(Integer.parseInt(br.readLine()));
		int idx = 0;
        
		String answer = "NO";
        for (int i = 0; i < T; i++) {

            if ((height.peek() < H) || (height.peek() == 1)) break;
            idx++;
            height.add(height.poll() / 2);
            
        }
		
        if (height.peek() < H) answer = "YES";
        
        System.out.print(answer.equals("YES") ? answer +"\n" + idx : answer +"\n" + height.poll());
        
	}
}
