import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test03();
	}

	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int point = 0;
		String isMoose = "";
		if(A == 0 && B == 0) {
			isMoose = "Not a moose";
		} else if(A!=B) {
			isMoose ="Odd ";
			point = Math.max(A, B)*2;
		} else {
			isMoose = "Even ";
			point = A*2;
		}
		
		if(point != 0) {
			System.out.println(isMoose + point);
		} else {
			System.out.println(isMoose);
		}
	}
}
