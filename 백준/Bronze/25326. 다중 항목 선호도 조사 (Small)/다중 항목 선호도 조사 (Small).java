import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test07();
	}

	public static void test07() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		List<String[]> list = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			String[] str = new String[] {st.nextToken(), st.nextToken(), st.nextToken()};
			list.add(str);
		}
		
		for(int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			String[] str = new String[] {st.nextToken(), st.nextToken(), st.nextToken()};
			int ans = 0;
			
			for(int j = 0; j < n; j++) {
				
				if(str[0].equals("-") || str[0].equals(list.get(j)[0])) {
					
					if(str[1].equals("-") || str[1].equals(list.get(j)[1])) {
						
						if(str[2].equals("-") || str[2].equals(list.get(j)[2])) {
							ans++;
						}
					}
				}

			}
			
			System.out.println(ans);
		}
	}
}
