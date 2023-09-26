import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    
	public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < 5; i++) {
        	int temp = Integer.parseInt(br.readLine());
        	map.put(temp, map.getOrDefault(temp, 0) + 1);
		}

        for (Integer key : map.keySet()) {
			if(map.get(key) % 2 != 0) System.out.println(key);
		}
	}

}
