import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test08();
	}

	public static void test08() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        int n = Integer.parseInt(br.readLine());
        Map<Integer, Integer> x = new HashMap<Integer, Integer>();
        Map<Integer, Integer> y = new HashMap<Integer, Integer>();

        int count = 0;
        
        for(int i = 0; i < n; i++) {
         
        	st = new StringTokenizer(br.readLine());
            int input_x = Integer.parseInt(st.nextToken());
            int input_y = Integer.parseInt(st.nextToken());

            if(x.containsKey(input_x)) x.put(input_x, x.get(input_x) + 1);
            else  x.put(input_x, 1);
            

            if(y.containsKey(input_y)) y.put(input_y, y.get(input_y) + 1);
            else y.put(input_y, 1);
            
        }

        for(int key : x.keySet()) 
            if(x.get(key) > 1) count++;

        for(int key : y.keySet()) 
            if(y.get(key) > 1) count++;

        System.out.println(count);
	}
}
