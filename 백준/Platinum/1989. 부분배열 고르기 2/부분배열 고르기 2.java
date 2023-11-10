import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    	private static class Result {
		long sum;
		int start;
		int end;
		
		public Result(long sum, int start, int end) {
			this.sum = sum;
			this.start = start;
			this.end = end;
		}
	}
	private static int N;
    private static int[] arr;
    private static int[] minTree;
    private static long[] sumTree;
    public static void main(String[] args) throws IOException {

       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		
		arr = new int[N + 1];
		arr[0] = Integer.MAX_VALUE;
	      
		StringTokenizer st = new StringTokenizer(br.readLine());

		for(int i = 1; i < N + 1; i++) 
			arr[i] = Integer.parseInt(st.nextToken());
	      
		sumTree = new long[N * 4];
		minTree = new int[N * 4];
		
		sumInit(1, N, 1);
		minInit(1, N, 1);
		
		Result result = query(1, N);
		System.out.println(result.sum);
		System.out.println(result.start + " " + result.end);
	}

	private static Result query(int start, int end) {
		
		int min = pMin(1, N, 1, start, end);
		long range = pSum(1, N, 1, start, end) * arr[min];
		int left = start;
		int right = end;
		if(start == end) return new Result(range, left, right);
		
		if(start < min) {
			
			Result temp = query(start, min - 1);
			if(range < temp.sum) {
				range = temp.sum;
				left = temp.start;
				right = temp.end;
			}
			
		}
		
		if(min < end) {
			
			Result temp = query(min + 1, end);
			if(range < temp.sum) {
				range = temp.sum;
				left = temp.start;
				right = temp.end;
			}
		}
		
		return new Result(range, left, right);
	}

	public static long sumInit(int start, int end, int node) {
		
		if (start == end) 
			return sumTree[node] = arr[start];

		int mid = (start + end) / 2;
		
		return sumTree[node] = sumInit(start, mid, node * 2) + sumInit(mid + 1, end, node * 2 + 1);
	}
	
	public static int minInit(int start, int end, int node) {
		
		if(start == end) 
			return minTree[node] = start;
		
		int mid = (start + end) / 2;
		int left = minInit(start, mid, node * 2);
		int right = minInit(mid + 1, end, node * 2 + 1);
		
		return minTree[node] = getIndex(left, right);
	}

	public static long pSum(int start, int end, int node, int left, int right) {
		
		if(end < left || right < start) return 0;
		if(left <= start && end <= right) return sumTree[node];
		
		int mid = (start + end) / 2;
		return pSum(start, mid, node * 2, left, right) + pSum(mid + 1, end, node * 2 + 1, left, right);
		
	}
	
	public static int pMin(int start, int end, int node, int left, int right) {
		
		if(end < left || right < start) return 0;
		if(left <= start && end <= right) return minTree[node];
		
		int mid = (start + end) / 2;
		int left2 = pMin(start, mid, node * 2, left, right);
		int right2 = pMin(mid + 1, end, node * 2 + 1, left, right);
		return getIndex(left2, right2);
		
	}
	
	public static int getIndex(int left, int right) {
		
		if(arr[left] < arr[right]) return left;
		else return right;
		
	}
}