import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test06();
	}

	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int A = Integer.parseInt(st.nextToken());
		int P = Integer.parseInt(st.nextToken());
		
		List<Integer> list = new ArrayList<>();
		list.add(A);
		
		while(true) {
			
			int temp = list.get(list.size() - 1);
			int res = 0;
			
			while(temp != 0) {
				res += (int) Math.pow(temp % 10, (double)P);
				temp /= 10;
			}
			
			if(list.contains(res)) {
				int ans = list.indexOf(res);
				System.out.println(ans);
				break;
			}
			
			list.add(res);
		}
		
	}
}
