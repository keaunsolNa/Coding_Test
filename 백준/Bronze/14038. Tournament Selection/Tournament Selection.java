import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test09();
	}

	public static void test09() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int winCnt = 0;
		for(int i = 0; i < 6; i++) {
			String WOL = br.readLine();
			if(WOL.equals("W")) {
				winCnt++;
			}
		}
		
		if(winCnt >= 5) {
			System.out.println(1);
		} else if(winCnt >= 3) {
			System.out.println(2);
		} else if(winCnt >= 1) {
			System.out.println(3);
		} else {
			System.out.println(-1);
		}
	}
}
