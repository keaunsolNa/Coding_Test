import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test09();
	}

	public static void test09() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] people = new int[4];
		for(int i = 0; i < 4; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int out = Integer.parseInt(st.nextToken());
			int in = Integer.parseInt(st.nextToken());
			if(i > 0) {
				people[i] = people[i-1] + (in - out);
			} else {
				people[i] =  in - out;
			}
		}
		
		Arrays.sort(people);
		System.out.println(people[people.length - 1]);
	}
}
