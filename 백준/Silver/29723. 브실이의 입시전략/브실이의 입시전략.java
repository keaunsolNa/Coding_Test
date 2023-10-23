import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
	        
		Map<String, Integer> study = new HashMap<>();	
		
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			study.put(st.nextToken(), Integer.parseInt(st.nextToken()));
		}
		
		int total = 0;
		
		for(int i = 0; i < K; i++) {
			String token = br.readLine();
			total += study.get(token);
			study.remove(token);
		}
		
		List<Map.Entry<String, Integer>> entryList = new LinkedList<>(study.entrySet());
		entryList.sort(Map.Entry.comparingByValue());
		
		int min = total;
		int max = total;
		for(int i = 0; i < M - K; i++) {
			
			min += entryList.get(i).getValue();
			max += entryList.get(entryList.size() - i - 1).getValue();
		}
		
		System.out.print(min + " " + max);
	}
}
