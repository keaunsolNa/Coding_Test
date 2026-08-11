import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) throws IOException {
		test10();
	}

	public static void test10() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int N = Integer.parseInt(br.readLine());
        int arr[] = new int[5];
        int[] list = new int[N];
        
        for (int i = 0; i < N; i++) {
        	
        	st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 5; j++) 
                arr[j] = Integer.parseInt(st.nextToken());
 
            int max = Integer.MIN_VALUE;
 
            for (int j = 0; j < 3; j++) 
                for (int k = j + 1; k < 4; k++) 
                    for (int z = k + 1; z < 5; z++) 
                        max = Math.max(max, (arr[j] + arr[k] + arr[z]) % 10);
            
            list[i] = max;
        }
 
        int idx = -1;
        int res = -1;
 
        for (int i = 0; i < N; i++) {
            if (res <= list[i]) {
                res = list[i];
                idx = i + 1;
            }
        }
 
        System.out.println(idx);
 
	}
}
