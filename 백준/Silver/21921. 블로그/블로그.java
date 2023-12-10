package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class test {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		// 배열의 길이
		int N = Integer.parseInt(st.nextToken());
		// 윈도우의 크기
		int X = Integer.parseInt(st.nextToken());

		// 배열 선언
		int[] arr = new int[N];
		st = new StringTokenizer(br.readLine());
		
		// 배열 초기화
		for(int i = 0; i < N; i++) arr[i] = Integer.parseInt(st.nextToken());

		// 윈도우 안의 누적합을 저장할 변수
		int sum = 0;
		// 초기 최대값은 0부터 윈도우의 크기까지 순회하며 누적합
		for(int i = 0; i < X; i++) sum += arr[i];
		
		// 최대값은 합계로 초기화
		int max = sum;
		// 최대값이 몇 개인지 기록할 변수
		int maxCnt = 1;
		
		// 윈도우의 크기에서 배열의 끝까지 돌며 윈도우를 갱신한다
		for(int i = X; i < N; i++) {
			
			// 갱신된 윈도우의 끝값을 더하고 처음값을 제한다.
			sum += arr[i] - arr[i - X];
			
			// 기존 최대값과 합계가 일치하면 최대값의 갯수 + 1
			if(max == sum) maxCnt++;
			
			// 합계가 최대값보다 클 경우 최댓값 갱신
			else if(max < sum) {
				max = sum;
				maxCnt = 1;
			}
		}

		// 출력
		System.out.println(max == 0 ? "SAD" : max + "\n" + maxCnt);
	}
}
