import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test04();
	}

	public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());
		List<Pair> v = new ArrayList<>();
	    
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			
			double t = Double.parseDouble(st.nextToken());

			int x = (int)t;
			int y = 0;

			if (t - x > 0.1) y = 1;
			v.add(new Pair(x, y));
	        
		}
	    
		int ans = v.get(0).x;
	    
		if (v.get(0).y == 1) ans++;
	        

		for (int i = 1; i < n; i++) {
	    
			if (v.get(i).y == 1 && ans == 0) ans++;
			ans += v.get(i).x;
	        
		}
	    
		System.out.println(ans);
	}

	private static class Pair {
		int x;
        int y;

        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
	}
}
