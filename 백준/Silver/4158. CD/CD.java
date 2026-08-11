import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test09();
	}

	public static void test09() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        while(true){
    		StringTokenizer st = new StringTokenizer(br.readLine());
		
		    int N = Integer.parseInt(st.nextToken());
		    int M = Integer.parseInt(st.nextToken());
		
            if(N == 0 && M == 0){
                break;
            }
            
		    Set<Integer> hashSet = new HashSet<>();
		
		    for(int i = 0; i < N; i++) {
		    	hashSet.add(Integer.parseInt(br.readLine()));
	    	}
		
		    int count = 0;
		    for(int i = 0 ; i < N; i++) {
		    	int number = Integer.parseInt(br.readLine());
			    
			    if(hashSet.contains(number)) {
				    count++;
			    }
		    }
		
		    System.out.println(count);
        }
	}
}
