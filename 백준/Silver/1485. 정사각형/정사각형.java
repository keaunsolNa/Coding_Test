import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test03();
	}

	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());

		while(T --> 0) {
			
			Pow[] arr = new Pow[4];
			
			for(int i = 0; i < 4; i++) {
				st = new StringTokenizer(br.readLine());
				int px = Integer.parseInt(st.nextToken());
				int py = Integer.parseInt(st.nextToken());
				
				arr[i] = new Pow(px, py);
			}
			
			long[] dist = new long[6];
			int idx = 0;
            for (int i = 0; i < 4; i++) {
                for (int j = i + 1; j < 4; j++) {
                    dist[idx++] = getDist(arr[i], arr[j]);
                }
            }
			
            Arrays.sort(dist);
            
            if (dist[0] == dist[1] && dist[1] == dist[2] && dist[2] == dist[3] && dist[4] == dist[5]) System.out.println(1);
            else System.out.println(0);
            
		}
	}

    private static long getDist(Pow p1, Pow p2) {
        return 1l * (p1.x - p2.x) * (p1.x - p2.x) + 1l * (p1.y - p2.y) * (p1.y - p2.y);
    }

	private static class Pow {
		
		int x;
		int y;
		
		Pow(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
}
