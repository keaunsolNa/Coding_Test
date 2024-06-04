import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        Map<Character, Integer> map = new TreeMap<>();
        
        while (n --> 0) {
        	
        	char[] arr = br.readLine().toCharArray();
        	
        	for (char c : arr) {
        		if (c == ' ') continue;
        		map.put(c, map.getOrDefault(c, 0) + 1);
        	}
        }
        
        for (Character key : map.keySet()) sb.append(key).append(" ").append(map.get(key)).append("\n");
       
        System.out.print(sb);
    }

}