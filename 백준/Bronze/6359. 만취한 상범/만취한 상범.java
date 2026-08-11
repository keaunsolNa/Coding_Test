import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test08();
	}

	public static void test08() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < T; i++) {
        	int n = Integer.parseInt(br.readLine());
        	Map<Integer, String> map = new HashMap<>();
        	
        	for(int j = 1; j <= n; j++) {
        		map.put(j, "open");
        	}
        	
        	int idx = 1;
        	int row = 2;
        	while(row <= n) {
        		
        		while(row*idx <= n) {
	        		if(map.get(row*idx).equals("open")) {
	        			map.put(row*idx, "close");
	        		} else {
	        			map.put(row*idx, "open");
	        		}
	        		idx++;
        		}
        		row++;
        		idx = 1;
        	}
        	
        	int cnt = 0;
        	for (int roomNumber : map.keySet()) {
				if(map.get(roomNumber).equals("open")) {
					cnt++;
				}
			}
        	
        	System.out.println(cnt);
        }
        
	}
}
