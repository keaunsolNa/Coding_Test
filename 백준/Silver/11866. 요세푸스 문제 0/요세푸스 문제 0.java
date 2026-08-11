import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;
import java.util.StringTokenizer;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test37();
	}

	public static void test37() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		
		Queue<Integer> queue = new LinkedList<>();
		for(int i = 1; i <= N; i++) {
			queue.add(i);
		}
		
		int K = Integer.parseInt(st.nextToken());
		StringBuilder sb = new StringBuilder();
		sb.append("<");
		List<Integer> answerList = new ArrayList<>();
		while(!queue.isEmpty()) {
			for(int i = 0; i < K-1; i++) {
				int temp = queue.poll();
				queue.add(temp);
			}
			
			int answer = queue.poll();
			if(queue.isEmpty()) {
				sb.append(answer).append(">");
			} else {
				sb.append(answer).append(", ");
			}
		}
		
		System.out.println(sb);
		
	}
}
