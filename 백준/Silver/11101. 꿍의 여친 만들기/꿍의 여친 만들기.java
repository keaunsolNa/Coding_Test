import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test05();
	}

	public static void test05() throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < n; i++) {
        	Map<String, Integer> needTimes = new HashMap<>();
        	String[] times = br.readLine().split(",");
        	
        	for(int j = 0; j < times.length; j++) {
        		StringTokenizer st = new StringTokenizer(times[j], ":");
        		needTimes.put(st.nextToken(), Integer.parseInt(st.nextToken()));
        		
        	}
        	
        	String[] require = br.readLine().split("\\|");
        	Map<List<String>, Integer> requireMap = new HashMap<>();
        	
        	int min = 1001;
        	
        	for(int j = 0; j < require.length; j++) {
        		int time = 0;
        		List<String> requireList = new ArrayList<>();
        		String[] requireType = require[j].split("&");
        		for (String string : requireType) {
					requireList.add(string);
					if(time < needTimes.get(string)) {
						time = needTimes.get(string);
					}
				}
        		requireMap.put(requireList, time);
        		if(min > time) {
        			min = time;
        		}
        	}
        	
        	System.out.println(min);
        }
        
        
	}
}
