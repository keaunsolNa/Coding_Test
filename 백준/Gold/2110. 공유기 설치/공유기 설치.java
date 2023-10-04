import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st = new StringTokenizer(br.readLine());
	   
	   int N = Integer.parseInt(st.nextToken());
	   int C = Integer.parseInt(st.nextToken());
	   
	   int[] arr = new int[N];
	   for(int i = 0; i < N; i++) arr[i] = Integer.parseInt(br.readLine());
	   
	   // 이분 탐색을 위한 정렬
	   Arrays.sort(arr);

	   // 최초값은 최소 거리
	   int first = 1;
	   
	   // 최대값은 최대 거리 (가장 긴 좌표 - 가장 작은 좌표 + 1)
	   int last = arr[N - 1] - arr[0] + 1;
	   
	   while(first < last) {
		
		   // 중간 값 
		   int mid = (first + last) / 2;

		   // 이분 탐색 결과값이 공유기 제한 숫자보다 작을 때 최대값은 중간값으로
			if(binarySearch(mid, arr) < C) last = mid;
			
			// 아니면 초기값을 중앙값 + 1로 설정
			else first = mid + 1;
			
	   }
	   
	   System.out.println(first - 1);
	}
    
       private static int binarySearch(int distance, int[] arr) {
		
	   // 첫 번째 집은 무조건 설치한다.
	   int count = 1;
	   
	   // 마지막 위치(초기 설치값)은 최초의 집
	   int lastLocate = arr[0];
		
	   for(int i = 1; i < arr.length; i++) {
		   
		   // 위치는 최초 + 1 집
		   int locate = arr[i];

		   //최초 +1 집 - 최초집 >= 거리(초기값은 중앙값)
		   if(locate - lastLocate >= distance) {
			   
			   // 카운트 누적 후 
			   count++;
			   // 집 위치 한 칸 앞으로 이동
			   lastLocate = locate;
		   }
	   }
	   
	   // 카운트(집 1과 집 2 사이의 거리가 이분탐색 Mid 값 이상일 때 증가) 반환
	   return count;

   }
}
