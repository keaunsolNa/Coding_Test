import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test03();
	}

	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		
		st = new StringTokenizer(br.readLine());
		List<Integer> prevList = new ArrayList<>();
		List<Integer> nextList = new ArrayList<>();

		boolean isPrev = true;
		for(int i = 0; i < N; i++) {
			
			int temp = Integer.parseInt(st.nextToken());
			
			if(temp == -1) {
				isPrev = false;
				continue;
			}
			
			if(isPrev) prevList.add(temp);
			else nextList.add(temp);
			
		}
		
		Collections.sort(prevList);
		Collections.sort(nextList);

		System.out.println(prevList.get(0) + nextList.get(0));
	}
}
