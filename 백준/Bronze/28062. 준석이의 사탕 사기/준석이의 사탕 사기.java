import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test02();
	}

	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		long total = 0;
		List<Integer> candy = new ArrayList<>();
		
		for(int i = 0; i < N; i++) {
			
			int temp = Integer.parseInt(st.nextToken());
			
			if(temp % 2 == 0) total += temp;
			else candy.add(temp);
			
		}
		
		Collections.sort(candy, Collections.reverseOrder());
		
		if(candy.size() % 2 == 0) {
			
			for(int i = 0; i < candy.size(); i++) total += candy.get(i);
			
		} else {
			
			for(int i = 0; i < candy.size() - 1; i++) total += candy.get(i);
		}
		
		System.out.println(total);
	}
}
