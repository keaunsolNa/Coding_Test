import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test09();
	}

	public static void test09() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < T; i++) {
        	int N = Integer.parseInt(br.readLine());
        	int[] arr = new int[N];
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	for(int j = 0; j < N; j++) {
        		arr[j] = Integer.parseInt(st.nextToken());
        	}
        	Arrays.sort(arr);
        	
        	System.out.println(arr[0] + " " + arr[arr.length - 1]);
        }
		
	}
}
