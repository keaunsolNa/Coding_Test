import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {

	private static int N;
	public static int[] histogram;

	public static void main(String[] args) throws IOException {
		test09();
	}

	public static void test09() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		int N;
		while(true) {
 
			st = new StringTokenizer(br.readLine(), " ");

			N = Integer.parseInt(st.nextToken());
			
			if(N == 0) break;
			histogram = new int[N];
            
			for(int i = 0; i < N; i++) histogram[i] = Integer.parseInt(st.nextToken());
			
			sb.append(getArea(0, N - 1)).append('\n');
			histogram = null;
			
		}
		
		System.out.println(sb);
		
	}

	public static long getArea(int lo, int hi) {
		
		// 너비가 1일 때 
		if(lo == hi) return histogram[lo];
		
		// 막대그래프의 중간 지점
		int mid = (lo + hi) / 2;
		
		// 중간(mid) 지점을 기준으로 왼쪽 
		long leftArea = getArea(lo, mid);
		
		// 중간(mid) 지점을 기준으로 오른쪽 
		long rightArea = getArea(mid + 1, hi);
		
		// 왼쪽과 오른쪽 중 큰 값으로 넓이 저장 
		long max = Math.max(leftArea, rightArea);
		
		// 큰 값과 중간 구간을 비교하여 더 큰 넓이로 갱신
		max = Math.max(max, getMidArea(lo, hi, mid));
 
		return max;
		
	}

	public static long getMidArea(int lo, int hi, int mid) {
		
		// 중앙으로부터 왼쪽
		int toLeft = mid;
		
		// 중앙으로부터 오른쪽
		int toRight = mid;
		
		// 높이 (초기값은 중앙값)
		long height = histogram[mid];
		
		// 초기 넓이
		long maxArea = height;
		
		
		// 양 끝 범위를 벗어나기 전까지 반복
		while(lo < toLeft && toRight < hi) {
			
			/*
			 *  양쪽 다음칸의 높이 중 높은 값을 선택하되, 
			 *  갱신되는 height는 기존 height보다 작거나 같아야 한다.
			 */
			// 오른쪽이 더 넓을 때
			if(histogram[toLeft - 1] < histogram[toRight + 1]) {
				toRight++;
				
				// 높이는 현재값보다 작거나 같아야 한다.
				height = Math.min(height, histogram[toRight]);	
			}
			else {
				
				toLeft--;
				height = Math.min(height, histogram[toLeft]);
			}
 
			// 최대 넓이 갱신
			maxArea = Math.max(maxArea, height * (toRight - toLeft + 1)); 
		}
		
		
		// 오른쪽 구간을 끝까지 탐색 못했다면 마저 탐색한다.
		while(toRight < hi) {
			
			toRight++;
			
			// 높이 최소값 갱신
			height = Math.min(height, histogram[toRight]);
			
			// 넓이 최대값 갱신
			maxArea = Math.max(maxArea, height * (toRight - toLeft + 1)); 
		}
		
		// 왼쪽 구간을 끝까지 탐색 못했다면 마저 탐색한다.
		while(lo < toLeft) {
			toLeft--;
			height = Math.min(height, histogram[toLeft]);
			maxArea = Math.max(maxArea, height * (toRight - toLeft + 1)); 
		}
		
		return maxArea;
	}
}
