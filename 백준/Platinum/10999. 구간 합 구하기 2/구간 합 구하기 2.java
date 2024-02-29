import java.io.*;
import java.util.*;

public class Main {

	private static int n;
	private static long[] arr, tree, lazyTree;
    public static void main(String[] args) throws IOException {

    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	StringBuilder sb = new StringBuilder();
    	
    	n = Integer.parseInt(st.nextToken());
    	int m = Integer.parseInt(st.nextToken());
    	int k = Integer.parseInt(st.nextToken());

    	arr = new long[n];
    	for (int i = 0; i < n; i++) arr[i] = Long.parseLong(br.readLine());
    		
    	tree = new long[n * 4];
    	lazyTree = new long[n * 4];
    	initialization(0, n - 1, 1);
    	
    	for (int i = 0; i < m + k; i++) {
    		
    		st = new StringTokenizer(br.readLine());
    		
    		int query = Integer.parseInt(st.nextToken());
    		int left = Integer.parseInt(st.nextToken()) - 1;
    		int right = Integer.parseInt(st.nextToken()) - 1;
    		
    		if(query == 1) {
    			
    			long plus = Long.parseLong(st.nextToken());

    			update(0, n - 1, 1, left, right, plus);
    		}
    		
    		else sb.append(getSum(0, n - 1, 1, left, right)).append("\n");
    		
    	}
    	
    	System.out.print(sb);
    }
    
    // 세그먼트 트리 Initialization
    private static long initialization(int start, int end, int node) {
    	
		if(start == end) return tree[node] = arr[start];
		
		int mid = (start + end) / 2;
		
		return tree[node] =  initialization(start, mid, node * 2) + initialization(mid + 1, end, node * 2 + 1);
	}
    
    // 세그먼트 트리 갱신
    private static void update(int start, int end, int node, int left, int right, long plus) {
    	
    	lazyUpdate(start, end, node);
    	
		if(end < left || right < start) return;
		
		if(left <= start && end <= right) {
			
			lazyTree[node] = plus;
			lazyUpdate(start, end, node);
			return;
			
		}
		
		int mid = (start + end) / 2;
		update(start, mid, node * 2, left, right, plus);
		update(mid + 1, end, node * 2 + 1, left, right, plus);
		
		tree[node] = tree[node * 2] + tree[node * 2 + 1];
		
	}
  
    // 세그먼트 트리 느린 갱신
    private static void lazyUpdate(int start, int end, int node) {
    	
		if (lazyTree[node] != 0){
			
			if (start != end) {
				
				lazyTree[node * 2] += lazyTree[node];
				lazyTree[node * 2 + 1] += lazyTree[node];
				
			}
			
			tree[node] += lazyTree[node] * (end - start + 1);
			lazyTree[node] = 0;
			
		}
		
	}
    
    // 구간 합 구하기
    private static long getSum(int start, int end, int node, int left, int right) {
    	
    	lazyUpdate(start, end, node);
    	
		if(end < left || right < start) return 0;
		
		if(left <= start && end <= right) return tree[node];
		
		int mid = (start + end) / 2;
		
		return getSum(start, mid, node * 2, left, right) + getSum(mid + 1, end, node * 2 + 1, left, right);
	}
}