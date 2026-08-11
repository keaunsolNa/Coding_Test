import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test04();
	}

	public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int L = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
        Problem[] arr = new Problem[N];
        
        for (int i = 0; i < N; i++) {
        	
            st = new StringTokenizer(br.readLine());
            int easy = Integer.parseInt(st.nextToken());
            int hard = Integer.parseInt(st.nextToken());
            arr[i] = new Problem(easy, hard);
            
        }
        Arrays.sort(arr);
        
        int score = 0;
        for (int i = 0; i < N; i++) {
        	
            if (L >= arr[i].hard && K != 0) {
            	
                score += 140;
                K--;
                
            } else if (L >= arr[i].easy && K != 0) {
            	
                score += 100;
                K--;
                
            }
            if (K == 0)
                break;
        }
        
        System.out.println(score);
		
		
	}

    static class Problem implements Comparable<Problem> {
        int easy;
        int hard;
        Problem(int easy, int hard) {
            this.easy = easy;
            this.hard = hard;
        }
        @Override
        public int compareTo(Problem o) {
            if (this.hard == o.hard)
                return this.easy - o.easy;
            return this.hard - o.hard;
        }
    }
}
