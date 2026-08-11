import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test07();
	}

	public static void test07() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int changes = Integer.parseInt(br.readLine());
		Map<String, Integer> changesMap = new HashMap<>();
		
		for(int i = 0; i < changes; i++) {
			String[] temp = br.readLine().split(" +");
			changesMap.put(temp[0], changesMap.getOrDefault(temp[0], 0) + Integer.parseInt(temp[1]));
		}
		
		changesMap.put("ocean", changesMap.getOrDefault("ocean", 0) + 0);
		changesMap.put("temperature", changesMap.getOrDefault("temperature", 0) + 0);
		changesMap.put("oxygen", changesMap.getOrDefault("oxygen", 0) + 0);
		
		if(changesMap.get("ocean") >= 9 && changesMap.get("temperature") >= 38 && changesMap.get("oxygen") >= 14) {
			System.out.println("liveable");
		} else {
			System.out.println("not liveable");
		}
	}
}
