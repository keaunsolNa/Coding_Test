import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test05();
	}

	public static void test05() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[N];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) arr[i] = Integer.parseInt(st.nextToken());

		int[] arr2 = new int[M];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < M; i++) arr2[i] = Integer.parseInt(st.nextToken());
		
		int[] arr3 = new int[N + M];
        System.arraycopy(arr, 0, arr3, 0, arr.length);
        System.arraycopy(arr2, 0, arr3, arr.length, arr2.length);		
		
        Arrays.sort(arr3);
        
        for (int i : arr3) System.out.println(i);
		
	}
}
