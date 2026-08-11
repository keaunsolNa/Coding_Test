import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test02();
	}

	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Stack<Map<Integer, Integer>> stack = new Stack<>();
		
		int total = 0;
		for(int i = 0; i < N; i++) {
			String[] temp = br.readLine().split(" ");
			Map<Integer, Integer> map = new HashMap<>();
			
			if(temp[0].equals("0")) {
				if(!stack.isEmpty()) {
					Iterator<Integer> iterKey = stack.peek().keySet().iterator();
					Iterator<Integer> iterValue = stack.peek().values().iterator();
	
					map.put(iterKey.next(), iterValue.next() - 1);
					stack.pop();
					stack.add(map);
				}
				
			} else {
				map.put(Integer.parseInt(temp[1]), Integer.parseInt(temp[2]) - 1);
				stack.add(map);
			}

			if(!stack.isEmpty()) {
				Iterator<Integer> iterKey = stack.peek().keySet().iterator();
				Iterator<Integer> iterValue = stack.peek().values().iterator();
				
				if(iterValue.next() == 0) {
					stack.pop();
					total += iterKey.next();
				}
			}
			
		}
		
		System.out.println(total);
	}
}
