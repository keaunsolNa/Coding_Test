import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test03();
	}

	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		
		while(T --> 0) {
			
			st = new StringTokenizer(br.readLine());
			int downToUp = Integer.parseInt(st.nextToken());
			int leftToRight = Integer.parseInt(st.nextToken());
			int crash = 0;
			
			List<Integer> down = new ArrayList<>();
			
			st = new StringTokenizer(br.readLine());
			for(int i = 0; i < downToUp; i++) down.add(Integer.parseInt(st.nextToken()));
			
			st = new StringTokenizer(br.readLine());
			for(int i = 0; i < leftToRight; i++) 
				if(down.contains(Integer.parseInt(st.nextToken()))) crash++;
			
			sb.append(crash + "\n");
			
		}
		
		System.out.println(sb);
	}
}
