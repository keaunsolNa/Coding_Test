import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test07();
	}

	public static void test07() throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); 
        int M = Integer.parseInt(st.nextToken());
        Map<String, Integer> map = new HashMap<>();
        
        for(int i = 0; i < N; i++) {
        	String input = br.readLine();
        	
        	if(input.length() < M) continue;
        	map.put(input, map.getOrDefault(input, 0) + 1);
        	
        }
        
        List<String> words = map.keySet().stream().collect(Collectors.toList());
		
        words.sort((o1, o2) -> {
            int c1 = map.get(o1);
            int c2 = map.get(o2);

            if(c1 == c2){
                if(o1.length() == o2.length()) {
                    return o1.compareTo(o2); 
                }
                return o2.length() - o1.length(); 
            }
            return c2 - c1;
        });
        
        for(int i = 0; i < words.size(); i++) 
        	sb.append(words.get(i)).append("\n");
        
        System.out.println(sb);
	}
}
