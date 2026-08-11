import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test10();
	}

	public static void test10() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int S1 = Integer.parseInt(st.nextToken());
		int S2 = Integer.parseInt(st.nextToken());
		String answer = "Accepted";
		
		for(int i = 0; i < S1+S2; i++) {
			st = new StringTokenizer(br.readLine()," ");
			String answer1 = st.nextToken();
			String answer2 = st.nextToken();
			System.out.println("Index : " + i + "\n answer1 : " + answer1 + "\nanswer2 : " + answer2);
			if(i < S1) {
				if(!answer1.equals(answer2)) {
					answer = "Wrong Answer";
					break;
				}
			} else {
				if(!answer1.equals(answer2)) {
					answer = "Why Wrong!!!";
					break;
				}
			}
			System.out.println(answer);
		}
		
		System.out.println(answer);
		
	}
}
