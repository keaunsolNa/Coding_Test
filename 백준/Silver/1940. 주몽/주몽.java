import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) throws IOException {
		test01();
	}

	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		
		st = new StringTokenizer(br.readLine());
		int[] arr = new int[N];
		for(int i = 0; i < N; i++) arr[i] = Integer.parseInt(st.nextToken());
		
		Arrays.sort(arr);
		
		int cnt = 0;
		int start = 0;
		int end = N - 1;
		
		while(start < end) {
			
            if(arr[start] + arr[end] < M) start++;
            
            else if (arr[start] + arr[end] > M) end--;
            
            else {
                
            	cnt++;
                start++;
                end--;
            }
		}
		
		System.out.println(cnt);
	}
}
