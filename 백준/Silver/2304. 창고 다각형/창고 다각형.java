import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test01();
	}

	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		
		List<Xy> list = new ArrayList<>();
		
		int ans = 0;
		int cnt = 1;
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			
			int x = Integer.parseInt(st.nextToken());
			int h = Integer.parseInt(st.nextToken());
			
			list.add(new Xy(x, h));
			if(ans < h) {
				ans = h;
				cnt = 1;
			} else if(ans>= h) {
				cnt++;
			} 
				
		}
		
		ans = ans * cnt;
		 
		System.out.println(ans);
		Collections.sort(list, (o1, o2) -> o1.x - o2.x); 
		
		Stack<Xy> stack = new Stack<>();
		for (Xy xy : list) stack.add(new Xy(xy.x, xy.y));
		
		
		while(!stack.isEmpty()) {
			
			int x = stack.peek().x;
			int y = stack.pop().y;
			
			while(!stack.isEmpty()) {
				
				int temp = stack.peek().y;
				if(temp > y) {
					ans += (x - stack.peek().x) * y;
					break;
				}
				
				stack.pop();
			}
		}
		
		Stack<Xy> stack2 = new Stack<>();
		Collections.sort(list, (o1, o2) -> o2.x - o1.x); 
		for (Xy xy : list) stack2.add(new Xy(xy.x, xy.y));
		
		while(!stack2.isEmpty()) {
			
			int x = stack2.peek().x;
			int y = stack2.pop().y;
			
			while(!stack2.isEmpty()) {
				int temp = stack2.peek().y;
				if(temp > y) {
					ans += (stack2.peek().x - x) * y;
					break;
				}
				
				stack2.pop();
			}
		}
		
		System.out.println(ans);
	}

	private static class Xy{
		
		private int x;
		private int y;
		
		private Xy(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
}
