import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    
    public static class Node {
		Map<String, Node> child = new HashMap<>();
	}
    
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int N = Integer.parseInt(br.readLine());
		Node root = new Node();

		for(int i = 0; i < N; i++) {
			
			st = new StringTokenizer(br.readLine());
			int size = Integer.parseInt(st.nextToken());

			Node now = root;

			for(int j = 0; j < size; j++) {
				
				String s = st.nextToken();
				
				if(!now.child.containsKey(s)) now.child.put(s, new Node());
				
				now = now.child.get(s);
	            
			}
	        
		}

		print(root, "");
	}

	public static void print(Node root, String bar) {

		Object[] key = root.child.keySet().toArray();
        Arrays.sort(key);

        for (Object s : key) {
            System.out.println(bar + s);
            print(root.child.get(s), bar + "--");
        }
    }
}
