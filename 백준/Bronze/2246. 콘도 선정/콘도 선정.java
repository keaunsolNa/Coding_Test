import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test08();
	}

	public static void test08() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        int N = Integer.parseInt(br.readLine());
        Condo[] arr = new Condo[N];
        
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i] = new Condo(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        }
        
        int cnt = 0;
        for (int i = 0; i < N; i++) {
            Condo cur = arr[i];
            boolean chk = true;
            for (int j = 0; j < N; j++) {
            	
                if (i == j) continue;
                if (cur.p>arr[j].p && cur.d>=arr[j].d) {
                    chk = false;
                    break;
                }
                
                if (cur.d>arr[j].d && cur.p>=arr[j].p) {
                    chk = false;
                    break;
                }
                
            }
            if (chk) cnt++;
        }
        System.out.println(cnt);
	}

    static class Condo {
        int d, p;
        public Condo(int d, int p) {
            this.d = d;
            this.p = p;
        }
    }
}
