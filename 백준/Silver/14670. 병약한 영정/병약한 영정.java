import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test09();
	}

	public static void test09() throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Map<Integer, Integer> mediMap = new HashMap<>();
        for(int i = 0; i < N; i++) {
        	StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        	int efficacy = Integer.parseInt(st.nextToken());
        	int name = Integer.parseInt(st.nextToken());
        	mediMap.put(efficacy, name);
        }
        
        int symptom = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < symptom; i++) {
        	StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        	StringBuilder sb = new StringBuilder();
        	int max = Integer.parseInt(st.nextToken());
        	for(int j = 0; j < max; j++) {
        		int symptoms = Integer.parseInt(st.nextToken());
        		if(mediMap.containsKey(symptoms)) {
        			sb.append(mediMap.get(symptoms)).append(" ");
        		} else {
        			sb = new StringBuilder("YOU DIED").append(" ");
        			break;
        		}
        	}
        	
        	sb.deleteCharAt(sb.length()-1);
        	sb.append("\n");
        	System.out.print(sb);
        }
	}
}
