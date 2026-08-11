import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test04();
	}

	public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int people = Integer.parseInt(st.nextToken());
		int area = Integer.parseInt(st.nextToken());
		
		int areaPeople = area*people;
		st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < 5; i++) {
			int temp = Integer.parseInt(st.nextToken());
			System.out.println(temp - areaPeople);
		}
	}
}
