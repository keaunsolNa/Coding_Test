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

	private static int K;

	public static void main(String[] args) throws IOException {
		test05();
	}

	public static void test05() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) arr[i] = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(br.readLine());
		
		Arrays.sort(arr);
		
		int ans = 0;
        int left = 0;
        int right = N - 1;
        
        while(left < right) {
        	
        	int sum = arr[left] + arr[right];
            if(sum == K) {   
                ans++;
                left++;
                right--;
           
            } else if(sum > K) right--;
            
            else left++;
            
        }
		
		System.out.println(ans);
	}
}
