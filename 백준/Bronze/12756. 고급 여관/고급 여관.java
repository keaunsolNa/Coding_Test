import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test04();
	}

	public static void test04() throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine(), " ");
		int pAA = Integer.parseInt(st.nextToken());
		int pAL = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine(), " ");
		int pBA = Integer.parseInt(st.nextToken());
		int pBL = Integer.parseInt(st.nextToken());
		
		while(pAL > 0 && pBL > 0) {
			pAL -= pBA;
			pBL -= pAA;
		}
		
		if(pAL > 0) {
			System.out.println("PLAYER A");
		} else if(pBL > 0) {
			System.out.println("PLAYER B");
		} else {
			System.out.println("DRAW");
		}
		
	}
}
