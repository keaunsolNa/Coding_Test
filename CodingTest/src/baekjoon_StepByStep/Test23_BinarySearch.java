package baekjoon_StepByStep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Test23_BinarySearch {
	
   public static void main(String[] args) throws IOException {
	      test07();
   }
   
   // 1920번 - 수 찾기
   public static void test01() throws IOException {
		
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   int testCase = Integer.parseInt(br.readLine());
	
	   StringTokenizer st = new StringTokenizer(br.readLine(), " ");
	   long[] arr = new long[testCase];
		
	   for(int i = 0; i < testCase; i++) 
		   arr[i] = Long.parseLong(st.nextToken());
	
	   Arrays.sort(arr);
		
	   int testCase2 = Integer.parseInt(br.readLine());
	   st = new StringTokenizer(br.readLine(), " ");
	   StringBuilder sb  = new StringBuilder();
		
	   for(int i = 0; i < testCase2; i++) {
			
		   if(search(arr, Long.parseLong(st.nextToken())) >= 0) 
			   sb.append("1").append("\n");
		   else 
			   sb.append("0").append("\n");
	   }

	   System.out.println(sb);
   }
   
   private static int search(long[] arr, Long target) {

	   int first = 0;
	   int last = arr.length - 1;

	   while(first <= last) {
		   
		   int mid = (first+last)/2;

		   if(target < arr[mid]) 
			   last = mid - 1;

		   else if (target > arr[mid])
			   first = mid + 1;
   	
		   else 
			   return mid;
   
	   }
   	
	   return -1;
   }
   
   // 10816번 - 숫자 카드 2
   public static void test02() throws IOException {
		
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   int N = Integer.parseInt(br.readLine());
	   Map<Integer, Integer> hashMap = new HashMap<>();	
	   StringTokenizer st = new StringTokenizer(br.readLine());
		
	   for(int i = 0; i < N; i++) {
		   int temp = Integer.parseInt(st.nextToken());
		   hashMap.put(temp, hashMap.getOrDefault(temp, 0) + 1);	
	   }
		
	   int M = Integer.parseInt(br.readLine());
	   st = new StringTokenizer(br.readLine());
	   StringBuilder sb = new StringBuilder();
		
	   for(int i = 0; i < M; i++) {
		   int temp = Integer.parseInt(st.nextToken());
		   int answer = 0;
			
		   try {
			   answer = hashMap.get(temp);
		   } catch(java.lang.NullPointerException e) {
			   answer = 0;
		   }
		  
		   sb.append(answer + " ");
		
	   }

	   System.out.println(sb);
   }
   
   // 1654번 - 랜선 자르기
   public static void test03() throws IOException {
		
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st = new StringTokenizer(br.readLine(), " ");
	   
	   int K = Integer.parseInt(st.nextToken());
	   int N = Integer.parseInt(st.nextToken());
	   List<Long> list = new ArrayList<>();
	   long max = 1;
		
	   for(int i = 0; i < K; i++) {

		   long length = Long.parseLong(br.readLine());
		   list.add(length);
		   if(length > max) max = length;

	   }
		
	   long first = 1;
	   long last = max;
	   long answer = first;
		
	   while(first <= last) {
		   long mid = (first+last)/2;
		   long num = getNum(list, mid);
			
		   if(num < N) 
			   last = mid - 1;
		   else {
			   answer = mid;
			   first = mid + 1;
		   }
	   }

	   System.out.println(answer);
   }
   
   public static int getNum(List<Long> list, long unit) {
	   int num = 0;

	   for (Long length : list) 
		   num += (length/unit);

	   return num;

   }
   
   // 2805번 - 나무 자르기
   public static void test04() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
	   StringTokenizer st = new StringTokenizer(br.readLine(), " ");

	   int N = Integer.parseInt(st.nextToken());
	   int M = Integer.parseInt(st.nextToken());
	   List<Integer> tree = new ArrayList<>();
	   int last = 1;
	   st = new StringTokenizer(br.readLine(), " ");
		
	   for(int i = 0; i < N; i++) {
		   
		   int length = Integer.parseInt(st.nextToken());
		   tree.add(length);
		   if(length > last) last = length;
		   
	   };
		
	   int first = 0;
		
	   while(first < last) {
		   
		   int mid = (first + last)/2;
		   long sum = 0;
			
		   for(int treeH : tree) {
				
			   if(treeH - mid > 0) 
				   sum += treeH - mid;
			   
		   }
			

		   if(sum < M) last = mid;

		   else first = mid +1;
			
	   }
		
	   System.out.println(first - 1);
   }
   
   // 2110번 - 공유기 설치
   public static void test05() throws IOException {
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
   
   // 공유기 설치 BinarySearch 알고리즘
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
   
   // 1300번 - K번째 수
   public static void test06() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringBuilder sb = new StringBuilder();
	   
	   int N = Integer.parseInt(br.readLine());
	   int K = Integer.parseInt(br.readLine());
	   
	   long first = 1;
	   long last = K;
		
	   while(first < last) {
			
		   long mid = (first + last) / 2;	
		   long count = 0;
			
		   for(int i = 1; i <= N; i++) 
			   count += Math.min(mid / i, N);
			
		   if(K <= count) 
			   last = mid;
		   else 
			   first = mid + 1;
	   }
		
	   System.out.println(first);
	   
   }
   
   // 12051번 - 가장 긴 증가하는 부분 수열 2
   public static void test07() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	   int N = Integer.parseInt(br.readLine());
	   int[] number = new int[N];
	   int[] lts = new int[N];
	   
	   StringTokenizer st = new StringTokenizer(br.readLine());
	   for(int i = 0; i < N; i++) number[i] = Integer.parseInt(st.nextToken());
	   
	   lts[0] = number[0];
	   int length = 1;
	   
	   for(int i = 1; i < N; i++) {
		   
		   int search = number[i];
		   
		   if(lts[length - 1] < search) {
			   length++;
			   lts[length - 1] = search;
		   }
		   
		   else {
			   
			   int first = 0;
			   int last = length;
			   
			   while(first < last) {
				  
				   int mid = (first + last) / 2;	
				   
				   if(lts[mid] < search) first = mid + 1;
				   else last = mid;
			   }
			   
			   lts[first] = search;
		   }
	   }

	   System.out.println(length);

   }
   
   
}
