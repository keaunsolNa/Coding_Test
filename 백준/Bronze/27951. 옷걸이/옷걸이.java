import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test05();
	}

	public static void test05() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());

		int[] arr = new int[N];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) arr[i] = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int U = Integer.parseInt(st.nextToken());
		int D = Integer.parseInt(st.nextToken());

		char[] ans= new char[N];
		for(int i = 0; i < arr.length; i++) {
			
			if(arr[i] == 1) {
				if(U > 0) { ans[i] = 'U'; U--; }
			}
			
			else if(arr[i] == 2)  {
				if(D > 0) { ans[i] = 'D'; D--; }
			}
			
            else {
				if(U > 0 && U > D) { ans[i] = 'U'; U--; }
				else if(D > 0 && D > U) { ans[i] = 'D'; D--; }
			}
		}
		
		if(U > 0 || D > 0)  System.out.println("NO");
		else {
			System.out.println("YES");
			for (char c : ans) {
                sb.append(c);
			}
            
            System.out.println(sb);
		}
		
	}
}
