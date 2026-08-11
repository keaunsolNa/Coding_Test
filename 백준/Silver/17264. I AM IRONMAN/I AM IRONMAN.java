import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test08();
	}

	public static void test08() throws NumberFormatException, IOException  {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        int N = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());
        
        st = new StringTokenizer(br.readLine(), " ");
        
        int W = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());
        int G = Integer.parseInt(st.nextToken());
        
        Map<String, String> player = new HashMap<>();
        for(int i = 0; i < P; i++) {
        	String[] temp = br.readLine().split(" ");
        	player.put(temp[0], temp[1]);
        }
        
        int totalGrade = 0;
        boolean ironMan = true;
        
        for(int i = 0; i < N; i++) {
        	String name = br.readLine();
        	if(!player.containsKey(name)) {
        		totalGrade -= L;
        		if(totalGrade < 0) {
        			totalGrade = 0;
        		}
        	} else if(player.get(name).equals("W")) {
        		totalGrade += W;
        	} else {
        		totalGrade -= L;
        		if(totalGrade < 0) {
        			totalGrade = 0;
        		}
        	}
        	
        	if(totalGrade >= G) {
        		ironMan = false;
        	}
        	
        }
        
        if(ironMan) {
        	System.out.println("I AM IRONMAN!!");
        } else {
        	System.out.println("I AM NOT IRONMAN!!");
        }
	}
}
