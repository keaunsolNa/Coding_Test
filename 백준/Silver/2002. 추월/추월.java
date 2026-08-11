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
		int N = Integer.parseInt(br.readLine());
		
		String[] in = new String[N];
		for(int i = 0; i < N; i++) in[i] = br.readLine();
		
		String[] out = new String[N];
		for(int i = 0; i < N; i++) out[i] = br.readLine();

		boolean[] chk = new boolean[N];
		int cnt = 0;
		
		for(int i = 0; i < N; i++) {
			
			for(int j = 0; j < N; j++) {
				
				if(!in[i].equals(out[j])) {
					if(!chk[j]) {
						chk[j] = true;
						cnt++;
					}
				}
				
				else {
					
					chk[j] = true;
					break;
				}
			}
		}
		
		System.out.println(cnt);
	}
}
