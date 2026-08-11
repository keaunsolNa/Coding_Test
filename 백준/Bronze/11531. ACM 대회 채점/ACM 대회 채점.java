import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test09();
	}

	public static void test09() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Map<String, Integer> wrongAnswer = new HashMap<>();
		long total = 0;
		int cnt = 0;
		while(true) {
			
			String input = br.readLine();
			if(input.equals("-1")) break;
			
			int t = Integer.parseInt(input.split(" ")[0]);
			String q = input.split(" ")[1];
			boolean answer = (input.split(" ")[2].equals("right")) ? true : false;
			
			if(!answer) wrongAnswer.put(q, wrongAnswer.getOrDefault(q, 0) + 1);
			else {
				if(wrongAnswer.containsKey(q)) total += (t + wrongAnswer.get(q) * 20);
				else total += t;
				
				cnt++;
			}
		}
		
		System.out.print(cnt + " " + total);
	}
}
