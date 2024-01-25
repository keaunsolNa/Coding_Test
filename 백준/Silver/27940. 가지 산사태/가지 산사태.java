import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        
        int[] arr = new int[n];
        for(int i = 0; i < m; i++) {
        	
        	st = new StringTokenizer(br.readLine());
        	int t = Integer.parseInt(st.nextToken());
        	int r = Integer.parseInt(st.nextToken());

        	arr[0] += r;
        	if(arr[0] > k) { System.out.println((i + 1) + " " + 1); System.exit(0); }

        }
        
        System.out.println(-1);
    }
}
