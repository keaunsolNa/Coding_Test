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

	private static boolean[] visit;
	private static int sumNumber = 0;
	private static int[] result = new int[3];

	public static void main(String[] args) throws IOException {
		test19();
	}

    public static void test19() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine()," ");
		
		int cardAmount = Integer.parseInt(st.nextToken());
		int keyNumber = Integer.parseInt(st.nextToken());
		
		int[] card = new int[cardAmount];
		
		st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < cardAmount; i++) {
			card[i] = Integer.parseInt(st.nextToken());
		}
		
		visit = new boolean[card.length];
		int depth = 0;
		dfs(depth, keyNumber, cardAmount, card);
		
		System.out.println(sumNumber);
    }

	public static void dfs(int depth, int keyNumber, int cardAmount, int[] card) {
		
		if(depth == 3) {
			int sum = 0;

			for (int i : result) {
				sum += i;
			}
			
			if (sum > keyNumber) {
				return;
			}
			
			if(sum <= keyNumber) {
				sumNumber = Math.max(sumNumber, sum);
			}
		} else {
			
			for(int i = depth; i < cardAmount; i++) {
				
				if(!visit[i]) {
					visit[i] = true;
					result[depth] = card[i];
					dfs(depth+1, keyNumber, cardAmount, card);
					visit[i] = false;
				}
			}
		}
		
	}
}
