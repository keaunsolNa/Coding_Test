import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test08();
	}

	public static void test08() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < N; i++) {
			String temp = br.readLine();
			String front = temp.split("-")[0];
			int back = Integer.parseInt(temp.split("-")[1]);

			int frontNumber = 0;
			for(int j = 0; j < front.length(); j++) {
				int number = front.charAt(j) - 'A';
				number *= Math.pow(26,  2- j);
				frontNumber += number;
			}
			
			if(Math.abs(frontNumber - back) <= 100) {
				System.out.println("nice");
			} else {
				System.out.println("not nice");
			}
		}
	}
}
