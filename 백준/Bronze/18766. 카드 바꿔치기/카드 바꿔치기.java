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

	public static void main(String[] args) throws IOException {
		test04();
	}

	public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			int N = Integer.parseInt(br.readLine());
			StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
			StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
			String[] original = new String[N];
			String[] after = new String[N];
			boolean check = true;
			
			for(int j = 0; j < N; j++) {
				original[j] = st1.nextToken();
				after[j] = st2.nextToken();
			}
			
			Arrays.sort(original);
			Arrays.sort(after);
			
			for(int j = 0; j < N; j++) {
				if(!original[j].equals(after[j])) {
					check = false;
					break;
				}
			}
			
			if(check) {
				System.out.println("NOT CHEATER");
			} else {
				System.out.println("CHEATER");
			}
			
		}
		
	}
}
