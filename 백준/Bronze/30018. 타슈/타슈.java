import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
        int[] aArr = new int[N];
        int[] bArr = new int[N];
	    
		StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) aArr[i] = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) bArr[i] = Integer.parseInt(st.nextToken());        
        
        int sum = 0;
        for(int i = 0; i < N; i++) 
            sum += Math.abs(aArr[i] - bArr[i]);
        
        System.out.println(sum / 2);
    }
}
