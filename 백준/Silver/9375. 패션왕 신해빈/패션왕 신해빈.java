import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test10();
	}

    public static void test10() throws NumberFormatException, IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	int testCase = Integer.parseInt(br.readLine());
    	Map<String, Integer> clothesMap = new HashMap<>();
    	
    	for(int i = 0; i < testCase; i++) {
    		int amount = Integer.parseInt(br.readLine());
    		
    		for(int j = 0; j < amount; j++) {
    			
    			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    			st.nextToken();
    			String var = st.nextToken();
    			clothesMap.put(var, clothesMap.getOrDefault(var, 0) + 1);
    			
    		}
    		
    		int count = 1;
    		Collection<Integer> ar = clothesMap.values();
    		Iterator<Integer> iter = ar.iterator();
    		while(iter.hasNext()) {
    			count *= (iter.next()+1);
    		}
    		System.out.println(count-1);
    		clothesMap.clear();
    	}
    	
    }
}
