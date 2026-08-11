import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test10();
	}

	public static void test10() throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String fid = br.readLine();
		int N = Integer.parseInt(br.readLine());
		int cnt = 0;
		
		while(N --> 0) {
			String ring = br.readLine();
			ring += ring;
			
			if(ring.replaceAll(fid, "").length() != ring.length()) cnt++;
		}
		
		System.out.println(cnt);
	}
}
