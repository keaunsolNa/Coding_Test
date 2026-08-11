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
		test01();
	}

	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		Queue<Integer> que = new LinkedList<>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		while(st.hasMoreTokens()) que.add(Integer.parseInt(st.nextToken()));
		
		int target = 1;
		int ans = 0;
		while(!que.isEmpty()) {
			
			if(que.peek() == target) {
				target++;
				que.poll();
			}
			
			else {
				que.poll();
				ans++;
			}
		}
		
		System.out.println(ans);
	}
}
