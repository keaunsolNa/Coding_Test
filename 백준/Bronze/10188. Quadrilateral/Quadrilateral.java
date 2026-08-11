import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test01();
	}

	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		
		while(T --> 0) {
			st = new StringTokenizer(br.readLine(), " ");
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			String temp = "";
			for(int i = 0; i < A; i++) temp += "X";
			
			for(int i = 0; i < B; i++)sb.append(temp).append("\n");
			
			sb.append("\n");
		}
		
		sb.deleteCharAt(sb.length()-1);
		sb.deleteCharAt(sb.length()-1);
		System.out.print(sb);
	}
}
