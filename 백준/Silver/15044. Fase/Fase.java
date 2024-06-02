import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringBuilder sb = new StringBuilder();
    	StringTokenizer st;

    	int n = Integer.parseInt(br.readLine());
    	int k = Integer.parseInt(br.readLine());
    	
    	Map<Integer, Integer> map = new TreeMap<>(Collections.reverseOrder());
    	while (n --> 0) {
    		
    		int temp = Integer.parseInt(br.readLine());
    		map.put(temp, map.getOrDefault(temp, 0) + 1);
    		
    	}

    	int total = 0;
    	for (int key : map.keySet()) {
    		
    		total += map.get(key);
    		k -= map.get(key);
    		
    		if (k <= 0) break;
    	}
    	
    	System.out.println(total);
    	
    }
    
    
}
