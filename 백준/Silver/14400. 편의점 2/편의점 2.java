import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine().replaceAll(" ", ""));
        int[] x = new int[N];
        int[] y = new int[N];
        
        for(int i = 0; i < N; i++) {
        	
        	st = new StringTokenizer(br.readLine());
        	x[i] = Integer.parseInt(st.nextToken());
        	y[i] = Integer.parseInt(st.nextToken());
        	
        }
        
        Arrays.sort(x);
        Arrays.sort(y);
        
        int midX = x[N / 2];
        int midY = y[N / 2];
        
        long dis = 0;
        for(int i = 0; i < N; i++) {
        	
        	dis += Math.abs(midX - x[i]);
        	dis += Math.abs(midY - y[i]);
        }
        
        System.out.println(dis);
	}
}
