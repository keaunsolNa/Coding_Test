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
		test08();
	}

	public static void test08() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		
		List<Integer> crane = new ArrayList<>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) crane.add(Integer.parseInt(st.nextToken()));
		
		
		int M = Integer.parseInt(br.readLine());
		
		List<Integer> box = new ArrayList<>();
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < M; i++) box.add(Integer.parseInt(st.nextToken()));

		Collections.sort(crane, Collections.reverseOrder());
		Collections.sort(box, Collections.reverseOrder());
	        
		if(box.get(0) > crane.get(0)) {
			System.out.println(-1);
			return;
		}
		
		int moveCnt = 0;
		
		while(!box.isEmpty()) {
			int craneIdx = 0;
			
			for(int i = 0; i < N;) {
				
				if(craneIdx == box.size()) break;
				
				if(crane.get(i) >= box.get(craneIdx)) {
					box.remove(craneIdx);
					i++;
				} else craneIdx++;
			}
			
			moveCnt++;
		}
		
		System.out.println(moveCnt);
	}
}
