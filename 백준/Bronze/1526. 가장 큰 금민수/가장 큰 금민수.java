import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test09();
	}

	public static void test09() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String N = br.readLine();
		
		while(true) {
			
			boolean chk = true;
			for(int i = 0; i < N.length(); i++) {
		
				if(N.charAt(i) != '4' && N.charAt(i) != '7') {
					chk = false;
					break;
				}
			}

			if(chk == true) break;
			else N = String.valueOf(Integer.parseInt(N) - 1);

		}
		
		System.out.println(N);
		
	}
}
