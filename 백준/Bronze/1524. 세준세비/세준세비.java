import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test10();
	}

	public static void test10() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		
		for(int i = 0; i < T; i++) {
			br.readLine();
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			
			List<Integer> sejoon = new ArrayList<>();
			List<Integer> sebeee = new ArrayList<>();

			st = new StringTokenizer(br.readLine(), " ");
			for(int j = 0; j < N; j++) {
				sejoon.add(Integer.parseInt(st.nextToken()));
			}
			
			st = new StringTokenizer(br.readLine(), " ");
			for(int j = 0; j < M; j++) {
				sebeee.add(Integer.parseInt(st.nextToken()));
			}
			
			Collections.sort(sejoon);
			Collections.sort(sebeee);
			
			
			int idx = 0;
			while(!(sejoon.isEmpty() || sebeee.isEmpty())) {
				if(sejoon.get(idx) > sebeee.get(idx)) {
					sebeee.remove(0);
				} else if(sejoon.get(idx) < sebeee.get(idx)) {
					sejoon.remove(0);
				} else {
					sebeee.remove(0);
				}
			}
			
			if(sejoon.size() > sebeee.size()) {
				System.out.println("S");
			} else {
				System.out.println("B");
			}
		}
		
		
	}
}
