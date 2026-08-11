package baekjoon_DynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.StringTokenizer;

public class DynamicProgramming05 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		test10();
	}
	
	
	private static int n;
	
    
	// 11722번 - 가장 긴 감소하는 부분 수열
	private static Integer[] number2;
	private static Integer[] dp3;

	
	// 14002번 - 가장 긴 증가하는 부분 수열 4 
	public static void test07() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		number2 = new Integer[N];
		dp3 = new Integer[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) number2[i] = Integer.parseInt(st.nextToken());
		
		
		for(int i = 0; i < N; i++) solove2(i);
	
		int ans = Integer.MIN_VALUE;
		for (int i : dp3) if(ans < i) ans = i;
		
        int value = ans;
        Stack<Integer> stack = new Stack<>();

        for (int i = N - 1; i >= 0; i--) {
            if (value == dp3[i]) {
                stack.push(number2[i]);
                value--;
            }
        }

        while (!stack.isEmpty()) sb.append(stack.pop() + " ");
        
        System.out.println(ans);
        System.out.println(sb);
		
	}
	
	private static int solove2(int n) {
		
		if(dp3[n] == null) {
			dp3[n] = 1;
			
			for(int i = n - 1; i >= 0; i--) 
				if(number2[i] < number2[n]) dp3[n] = Math.max(dp3[n], solove2(i) + 1);
			
		}
		
		return dp3[n];
	}
	
	// 12738번 -가장 긴 증가하는 부분 수열 3
	public static void test08() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        List<Integer> list = new ArrayList<>();
        int arr[] = new int[n + 1];

        for(int i = 1 ; i <= n; i++) arr[i] = Integer.parseInt(st.nextToken());

        list.add(Integer.MIN_VALUE);

        for(int i = 1 ; i <= n; i++){
        	
            int num = arr[i];
            int left = 1;
            int right = list.size() - 1;

            if(num > list.get(list.size() - 1)) list.add(num);
            
            else{

            	while(left < right){
                    int mid = (left + right) >> 1;

                    if(list.get(mid) >= num) right = mid;
                    else left = mid + 1;
                }
            	
                list.set(right, num);
            }
        }

        System.out.println(list.size() - 1);
	}

	
	// 9658번 - 돌 게임 5
	public static void test10() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		long N = Long.parseLong(br.readLine());
		
		if(N % 2 == 0) System.out.println("CY");
		else System.out.println("SK");
	}

}
