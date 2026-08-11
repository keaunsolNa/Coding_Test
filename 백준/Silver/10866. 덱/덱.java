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
		test33();
	}

	public static void test33() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int order = Integer.parseInt(br.readLine());
		Deque<Integer> deque = new LinkedList<>();
		
		for(int i = 0; i < order; i++) {
			String orderStr = br.readLine();
			
			if(orderStr.contains("push_front")) {
				
				int orderValue = Integer.parseInt(orderStr.split(" ")[1]);
				deque.addFirst(orderValue);
				
			} else if(orderStr.contains("push_back")) {
				
				int orderValue = Integer.parseInt(orderStr.split(" ")[1]);
				deque.addLast(orderValue);
				
			} else if(orderStr.contains("pop_front")) {
				
				if(deque.size() == 0) {
					System.out.println(-1);
				} else {
					System.out.println(deque.pollFirst());
				}
				
			} else if(orderStr.contains("pop_back")) {
				
				if(deque.size() == 0) {
					System.out.println(-1);
				} else {
					System.out.println(deque.pollLast());
				}
				
			} else if(orderStr.contains("size")) {
				
				System.out.println(deque.size());
				
			} else if(orderStr.contains("empty")) {
				
				if(deque.size() == 0) {
					System.out.println(1);
				} else {
					System.out.println(0);
				}
				
			} else if(orderStr.contains("front")) {
				
				if(deque.size() == 0) {
					System.out.println(-1);
				} else {
					System.out.println(deque.peekFirst());
				}
				
			} else if(orderStr.contains("back")) {
				
				if(deque.size() == 0) {
					System.out.println(-1);
				} else {
					System.out.println(deque.peekLast());
				}
				
			}
		}
	}
}
