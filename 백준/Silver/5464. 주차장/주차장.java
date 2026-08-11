import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test06();
	}

	public static void test06() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] cP = new int[n + 1]; 
        int[] cW = new int[m + 1]; 
        int[] pW = new int[n + 1]; 

        int sum = 0;

        for (int i = 1; i <=n; i++) pW[i] = Integer.parseInt(br.readLine());
        
        for (int i = 1; i <=m; i++) cW[i] = Integer.parseInt(br.readLine());
        
        Queue<Integer> queue = new LinkedList<>();

        start: for (int i = 0; i < 2 * m; i++) {
            int car = Integer.parseInt(br.readLine());

            if (car > 0) { 
                for (int j = 1; j < n + 1; j++) { 
                    if (cP[j] == 0) { 
                    	cP[j] = car; 
                        continue start;
                    }
                }
                
                queue.offer(car);
                
            } else { 
            	
                for (int j = 1; j < n + 1; j++) {
                	
                    if (cP[j] == car * (-1)) {
                    	cP[j] = 0;
                        sum += pW[j] * cW[car * (-1)];
                        if (!queue.isEmpty()) cP[j] = queue.poll();
                        break;
                    }
                }
            }
        }
        System.out.println(sum);
	}
}
