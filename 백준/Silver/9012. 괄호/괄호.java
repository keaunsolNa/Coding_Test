import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;
import java.util.StringTokenizer;


public class Main {
	
	public static void main(String[] args) throws IOException {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			String s = br.readLine();
			String answer = "NO";
	        Deque<Character> deque = new LinkedList<>();
	        char[] charArray = s.toCharArray();
	        
	        for (char c : charArray) {
	        	if(c == '(') {
	        		deque.add(c);
	        	} else if(c == ')') {
	        		if(deque.size() == 0) {
	        			answer = "NO";
	        			deque.add('N');
	        			break;
	        		} else {
	        			deque.poll();
	        		}
	        	}
			}
	        
	        if(deque.size() == 0) {
	        	answer = "YES";
	        }
	        
	        System.out.println(answer);
		}
	}
}