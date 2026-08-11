import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test01();
	}

	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int testCase = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int answer = 0;
		for(int i = 1; i <= testCase; i++) {
			String temp = st.nextToken();
			if(!(temp.equals(i+"") || temp.equals("mumble"))) {
				answer = - 1;
			}
			
		}
		
		if(answer == -1) {
			System.out.println("something is fishy");
		} else {
			System.out.println("makes sense");
		}
	}
}
