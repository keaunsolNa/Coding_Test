import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test08();
	}

	public static void test08() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        int[] first = new int[N];
        int[] second = new int[N];
        
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) first[i] = Integer.parseInt(st.nextToken());
        
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) second[i] = Integer.parseInt(st.nextToken());
        
        int sum = 0;
        for(int i = 0; i < N; i++) {
        	sum += Math.abs(first[i]);
        	sum += Math.abs(second[i]);
        }
        System.out.println(sum);
	}
}
