import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    private static HashMap<String, ArrayList<String>> edges;
	private static int n;

	public static void main(String[] args) throws NumberFormatException, IOException {
		test02();
	}

	public static void test02() throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        edges = new HashMap<>();
        
        for (int i = 0; i < n - 1; i++) {
        	
            st = new StringTokenizer(br.readLine());
            String a = st.nextToken();
            String b = st.nextToken();
            
            if (!edges.containsKey(a)) edges.put(a, new ArrayList<>());
            edges.get(a).add(b);
        }

        st = new StringTokenizer(br.readLine());
        String a = st.nextToken();
        String b = st.nextToken();
        
        System.out.println(search(a, b) || search(b, a) ? 1 : 0);

	}

    private static boolean search(String cur, String ed) {
        if (cur.equals(ed)) return true;
        
        if (edges.get(cur) == null) return false;
        for (String next : edges.get(cur)) 
            if (search(next, ed)) return true;
        
        return false;
    }
}
