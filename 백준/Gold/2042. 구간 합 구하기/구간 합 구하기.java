import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
    
    public static long[] arr;
	public static long[] tree;
    
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
			
		arr = new long[N + 1];
		for(int i = 1; i <= N; i++) arr[i] = Long.parseLong(br.readLine());
			
		tree = new long[N * 4];
		
		init(1, N, 1);
		
		for(int i = 0; i < M + K; i++) {
			
			st = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			long c = Long.parseLong(st.nextToken());
			
			if(a == 1) {
				long dif = c - arr[b];
				arr[b] = c;
				update(1, N, 1, b, dif);
			}
			
			else sb.append(sum(1, N, 1, b, (int) c) + "\n");
		}
		
		System.out.print(sb);
	}
    
    public static long init(int start, int end, int node) {
		
		if(start == end) return tree[node] = arr[start];
		
		int mid = (start + end) / 2;

		return tree[node] = init(start, mid, node * 2) + init(mid + 1, end, node * 2 + 1);
		
	}
	
	public static long sum(int start, int end, int node, int left, int right) {
		
		if(left > end || right < start) return 0;
		
		if(left <= start && end <= right) return tree[node];
		
		int mid = (start + end) / 2;
		
		return sum(start, mid, node  * 2, left, right) + sum(mid + 1, end, node * 2 + 1, left, right);
		
	}
	
	public static void update(int start, int end, int node, int idx, long dif) {
		
		if(idx < start || idx > end) return;
		
		tree[node] += dif;
		
		if(start == end) return;
		
		int mid = (start + end) / 2;
		update(start, mid, node * 2, idx, dif);
		update(mid + 1, end, node * 2 + 1, idx, dif);
		
	}
}
