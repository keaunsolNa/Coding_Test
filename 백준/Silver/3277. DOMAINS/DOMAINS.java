import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test08();
	}

	public static void test08() throws NumberFormatException, IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine(); 

        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String address = sc.nextLine().trim();

            if (address.startsWith("http://")) 
                address = address.substring(7);
            

            String domain = address.split("/")[0].split("\\.")[address.split("/")[0].split("\\.").length - 1];

            map.put(domain, map.getOrDefault(domain, 0) + 1);
        }

        int maxFreq = Collections.max(map.values());
        List<String> mostVisited = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == maxFreq) 
                mostVisited.add(entry.getKey());
            
        }

        System.out.println(maxFreq);
        System.out.println(String.join(" ", mostVisited));
		
	}
}
