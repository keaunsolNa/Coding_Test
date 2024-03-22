import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	private static Integer[] number2;
	private static Integer[] dp3;
   public static void main(String[] args) throws IOException {
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
}