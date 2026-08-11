import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test05();
	}

	public static void test05() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int total = 0;
		boolean hacker = false;
		for(int i = 0; i < 9; i++) {
			int temp = Integer.parseInt(st.nextToken());
			
			switch(i) {
				case 0 : hacker = temp > 100 ? true : false; break;
				case 1 : hacker = temp > 100 ? true : false; break;
				case 2 : hacker = temp > 200 ? true : false; break;
				case 3 : hacker = temp > 200 ? true : false; break;
				case 4 : hacker = temp > 300 ? true : false; break;
				case 5 : hacker = temp > 300 ? true : false; break;
				case 6 : hacker = temp > 400 ? true : false; break;
				case 7 : hacker = temp > 400 ? true : false; break;
				case 8 : hacker = temp > 500 ? true : false; break;
			}
			
			if(!hacker) break;
			total += temp;
		}
		
		if(hacker) {
			System.out.println("hacker");
		} else if(total >= 100) {
			System.out.println("draw");
		} else {
			System.out.println("none");
		}
	}
}
