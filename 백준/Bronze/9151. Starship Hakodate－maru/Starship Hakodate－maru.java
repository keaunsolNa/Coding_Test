import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder out = new StringBuilder();
      
        List<Integer> one = new ArrayList<>();
        for (int i = 0; i <= 53; i++) one.add(i * i * i);
        
        
        List<Integer> two = new ArrayList<>();
        two.add(0);
        for (int i = 0; i <= 95; i++) two.add(i * (i + 1) * (i + 2) / 6);
        
        while (true) {

        	
        	int n = Integer.parseInt(br.readLine());
        	if (n == 0) break;

        	int max = 0;
        	
        	for (int i = 0; i < one.size(); i++) {
        		
        		if (one.get(i) > n) break;
        		
        		for (int j = 0; j < two.size(); j++) {
        		
        			if (two.get(j) > n) break;
        			
        			if (one.get(i) + two.get(j) <= n) {
        				max = Math.max(one.get(i) + two.get(j), max);
        			}
        		}
        	}
        	
        	System.out.println(max);
        	
        }
    }

}